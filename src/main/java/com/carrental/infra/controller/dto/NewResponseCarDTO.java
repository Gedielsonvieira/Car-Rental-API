package com.carrental.infra.controller.dto;

import com.carrental.infra.entity.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class NewResponseCarDTO {

    private int id;
    private String brand;
    private String name;
    private String imageUrl;
    private boolean highlight;
    private String description;
    private BigDecimal price;
    private Integer year;
    private LocalDate createDate;
    private int numberOfPeople;
    private int quantityOfDoors;
    private boolean hydraulicSteering;
    private boolean airConditioning;
    private boolean electricGlass;
    private boolean airBag;
    private boolean abs;

    public NewResponseCarDTO(CarEntity carEntity) {
        id = carEntity.getId();
        brand = carEntity.getBrand();
        name = carEntity.getName();
        imageUrl = carEntity.getImageUrl();
        highlight = carEntity.isHighlight();
        description = carEntity.getDescription();
        price = carEntity.getPrice();
        year = carEntity.getYear();
        createDate = carEntity.getCreateDate();
        numberOfPeople = carEntity.getNumberOfPeople();
        quantityOfDoors = carEntity.getQuantityOfDoors();
        hydraulicSteering = carEntity.isHydraulicSteering();
        airConditioning = carEntity.isAirConditioning();
        electricGlass = carEntity.isElectricGlass();
        airBag = carEntity.isAirBag();
        abs = carEntity.isAbs();
    }

}
