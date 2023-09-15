package com.carrental.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Car {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate createDate;
    private int numberOfPeople;
    private CarAccessories carAccessories;
}
