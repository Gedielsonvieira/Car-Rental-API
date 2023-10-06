package com.carrental.infra.controller;

import com.carrental.domain.service.CarService;
import com.carrental.infra.controller.dto.CarRequestDTO;
import com.carrental.infra.controller.dto.CarResponseDTO;
import com.carrental.infra.controller.dto.NewCarDTO;
import com.carrental.infra.controller.dto.NewResponseCarDTO;
import com.carrental.infra.entity.CarEntity;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("cars")
public class CarCrudController {

    private final CarService carService;

    @GetMapping
    public ResponseEntity<List<CarResponseDTO>> searchEverythingDynamically(CarRequestDTO carRequestDTO) {
        return ResponseEntity.ok(carService.searchEverythingDynamically(carRequestDTO)
                .stream()
                .map(CarEntity::toCarDTO)
                .toList());
    }

    @PostMapping
    public ResponseEntity<NewResponseCarDTO> createCar(@Valid @RequestBody NewCarDTO newCarDTO) {
        return ResponseEntity.ok(carService.createCar(newCarDTO));
    }

    @DeleteMapping(value = "/{id}")
    public boolean deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return Boolean.TRUE;
    }

}
