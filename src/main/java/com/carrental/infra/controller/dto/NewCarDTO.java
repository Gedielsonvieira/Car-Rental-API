package com.carrental.infra.controller.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class NewCarDTO {

    @NotBlank(message = "Fill in the brand field")
    private String brand;
    @NotBlank(message = "Fill in the name field")
    private String name;
    @NotBlank(message = "Fill in the type field")
    private String type;
    @NotBlank(message = "Fill in the imageUrl field")
    private String imageUrl;
    @NotNull
    private boolean highlight;
    @NotBlank(message = "Fill in the description field")
    private String description;
    @Positive
    @NotNull
    private BigDecimal price;
    @Positive
    @NotNull
    private int year;
    @Positive
    @NotNull
    private int numberOfPeople;
    @Positive
    @NotNull
    private int quantityOfDoors;
    @NotNull
    private boolean hydraulicSteering;
    @NotNull
    private boolean airConditioning;
    @NotNull
    private boolean electricGlass;
    @NotNull
    private boolean airBag;
    @NotNull
    private boolean abs;

}
