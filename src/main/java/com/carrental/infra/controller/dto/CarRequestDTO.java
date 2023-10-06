package com.carrental.infra.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class CarRequestDTO {

    private Integer id;
    private String brand;
    private String name;
    private String imageUrl;
    private Boolean highlight;
    private String description;
    private BigDecimal price;
    private Integer year;
    private LocalDate createDate;
    private Integer numberOfPeople;
    private Integer quantityOfDoors;
    private Boolean hydraulicSteering;
    private Boolean airConditioning;
    private Boolean electricGlass;
    private Boolean airBag;
    private Boolean ABS;

}
