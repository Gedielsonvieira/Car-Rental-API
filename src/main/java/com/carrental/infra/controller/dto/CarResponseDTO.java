package com.carrental.infra.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class CarResponseDTO {

    private int id;
    private String brand;
    private String name;
    private String type;
    private String imageUrl;
    private boolean highlight;
    private String description;
    private BigDecimal price;
    private int year;
    private LocalDate createDate;
    private int numberOfPeople;
    private int quantityOfDoors;
    private boolean hydraulicSteering;
    private boolean airConditioning;
    private boolean electricGlass;
    private boolean airBag;
    private boolean ABS;

}
