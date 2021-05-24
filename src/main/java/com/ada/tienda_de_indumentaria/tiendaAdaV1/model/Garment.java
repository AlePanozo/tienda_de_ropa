package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Garment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_garment;
    private String size;
    private String season;
    private int price;
    private int year;
    private String description;
}
