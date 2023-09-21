package com.carrental.infra.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
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
    private boolean ABS;

}
