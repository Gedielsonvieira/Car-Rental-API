package com.carrental.infra.entity;

import com.carrental.infra.controller.dto.CarResponseDTO;
import com.carrental.infra.controller.dto.NewCarDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "table_car")
public class CarEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "marca")
    private String brand;
    @Column(name = "nome")
    private String name;
    @Column(name = "tipo")
    private String type;
    @Column(name = "imagem_url")
    private String imageUrl;
    @Column(name = "destaque")
    private boolean highlight;
    @Column(name = "descricao")
    private String description;
    @Column(name = "preco")
    private BigDecimal price;
    @Column(name = "ano")
    private int year;
    @Column(name = "data_criacao")
    private LocalDate createDate;
    @Column(name = "numero_pessoas")
    private int numberOfPeople;
    @Column(name = "quantidade_portas")
    private int quantityOfDoors;
    @Column(name = "direcao_hidraulica")
    private boolean hydraulicSteering;
    @Column(name = "ar_condicionado")
    private boolean airConditioning;
    @Column(name = "vidro_eletrico")
    private boolean electricGlass;
    @Column(name = "airbag")
    private boolean airBag;
    @Column(name = "abs")
    private boolean abs;

    public CarResponseDTO toCarDTO() {
        return new CarResponseDTO(
                id,
                brand,
                name,
                type,
                imageUrl,
                highlight,
                description,
                price,
                year,
                createDate,
                numberOfPeople,
                quantityOfDoors,
                hydraulicSteering,
                airConditioning,
                electricGlass,
                airBag,
                abs
        );
    }

    public CarEntity(NewCarDTO newCarDTO){
        brand = newCarDTO.getBrand();
        name = newCarDTO.getName();
        imageUrl = newCarDTO.getImageUrl();
        highlight = newCarDTO.isHighlight();
        description = newCarDTO.getDescription();
        price = newCarDTO.getPrice();
        year = newCarDTO.getYear();
        createDate = LocalDate.now();
        numberOfPeople = newCarDTO.getNumberOfPeople();
        quantityOfDoors = newCarDTO.getQuantityOfDoors();
        hydraulicSteering = newCarDTO.isHydraulicSteering();
        airConditioning = newCarDTO.isAirConditioning();
        electricGlass = newCarDTO.isElectricGlass();
        airBag = newCarDTO.isAirBag();
        abs = newCarDTO.isAbs();
    }
}
