package com.carrental.infra.specification;

import com.carrental.infra.controller.dto.CarRequestDTO;
import com.carrental.infra.entity.CarEntity;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CarSpecification implements Specification<CarEntity> {

    private final CarRequestDTO carRequestDTO;

    @Override
    public Predicate toPredicate(Root<CarEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

        List<Predicate> criteria = new ArrayList<>();

        if (carRequestDTO.getId() != null) {
            criteria.add(criteriaBuilder.equal(root.get("id"), carRequestDTO.getId()));
        }

        if (carRequestDTO.getBrand() != null) {
            criteria.add(criteriaBuilder.equal(root.get("brand"), carRequestDTO.getBrand()));
        }

        if (carRequestDTO.getName() != null) {
            criteria.add(criteriaBuilder.equal(root.get("name"), carRequestDTO.getName()));
        }

        if (carRequestDTO.getType() != null) {
            criteria.add(criteriaBuilder.equal(root.get("type"), carRequestDTO.getType()));
        }

        if (carRequestDTO.getImageUrl() != null) {
            criteria.add(criteriaBuilder.equal(root.get("imageUrl"), carRequestDTO.getImageUrl()));
        }

        if (carRequestDTO.getHighlight() != null) {
            criteria.add(criteriaBuilder.equal(root.get("highlight"), carRequestDTO.getHighlight()));
        }

        if (carRequestDTO.getDescription() != null) {
            criteria.add(criteriaBuilder.equal(root.get("description"), carRequestDTO.getDescription()));
        }

        if (carRequestDTO.getPrice() != null) {
            criteria.add(criteriaBuilder.equal(root.get("price"), carRequestDTO.getPrice()));
        }

        if (carRequestDTO.getYear() != null) {
            criteria.add(criteriaBuilder.equal(root.get("year"), carRequestDTO.getYear()));
        }

        if (carRequestDTO.getCreateDate() != null) {
            criteria.add(criteriaBuilder.equal(root.get("createDate"), carRequestDTO.getCreateDate()));
        }

        if (carRequestDTO.getNumberOfPeople() != null) {
            criteria.add(criteriaBuilder.equal(root.get("numberOfPeople"), carRequestDTO.getNumberOfPeople()));
        }

        if (carRequestDTO.getQuantityOfDoors() != null) {
            criteria.add(criteriaBuilder.equal(root.get("quantityOfDoors"), carRequestDTO.getQuantityOfDoors()));
        }

        if (carRequestDTO.getHydraulicSteering() != null) {
            criteria.add(criteriaBuilder.equal(root.get("hydraulicSteering"), carRequestDTO.getHydraulicSteering()));
        }

        if (carRequestDTO.getAirConditioning() != null) {
            criteria.add(criteriaBuilder.equal(root.get("airConditioning"), carRequestDTO.getAirConditioning()));
        }

        if (carRequestDTO.getElectricGlass() != null) {
            criteria.add(criteriaBuilder.equal(root.get("electricGlass"), carRequestDTO.getElectricGlass()));
        }

        if (carRequestDTO.getAirBag() != null) {
            criteria.add(criteriaBuilder.equal(root.get("airBag"), carRequestDTO.getAirBag()));
        }

        if (carRequestDTO.getABS() != null) {
            criteria.add(criteriaBuilder.equal(root.get("ABS"), carRequestDTO.getABS()));
        }

        Predicate[] predicates = new Predicate[criteria.size()];
        predicates = criteria.toArray(predicates);

        return criteriaBuilder.and(predicates);
    }

}
