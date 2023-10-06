package com.carrental.domain.service;

import com.carrental.domain.exception.BusinessException;
import com.carrental.infra.controller.dto.CarRequestDTO;
import com.carrental.infra.controller.dto.NewCarDTO;
import com.carrental.infra.controller.dto.NewResponseCarDTO;
import com.carrental.infra.entity.CarEntity;
import com.carrental.infra.repository.CarRepository;
import com.carrental.infra.specification.CarSpecification;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
@Service
public class CarService {

    private final CarRepository carRepository;

    @Transactional(readOnly = true)
    public List<CarEntity> searchEverythingDynamically(CarRequestDTO carRequestDTO) {
        CarSpecification carSpecification = new CarSpecification(carRequestDTO);
        return carRepository.findAll(carSpecification);
    }

    @Transactional
    public NewResponseCarDTO createCar(NewCarDTO newCarDTO){
        CarEntity carEntity = new CarEntity(newCarDTO);
        CarEntity carSaved = carRepository.save(carEntity);
        return new NewResponseCarDTO(carSaved);
    }

    @Transactional
    public void deleteCar(Long id) {
        Optional<CarEntity> carById = carRepository.findById(id);

        if (carById.isPresent()) {
            carRepository.deleteById(id);
        } else {
            throw new BusinessException("Id not found");
        }

    }
}
