package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_stock;
    private Date update_;
    private int amount;

    @OneToOne
    @JoinColumn(name = "id_garment", referencedColumnName = "id_garment")
    private Garment id_garment;



}
