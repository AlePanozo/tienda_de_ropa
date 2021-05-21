package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

    public int getId_garment() {
        return id_garment;
    }

    public void setId_garment(int id_garment) {
        this.id_garment = id_garment;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
