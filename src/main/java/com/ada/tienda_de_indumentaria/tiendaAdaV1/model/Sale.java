package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sale;

    private String description;
    private int price;
    private int amount;
    private Date update_;
    private int total;

    @OneToOne
    @JoinColumn(name = "id_branch_office", referencedColumnName = "id_branch_office")
    private Branch_office id_branch_office;

    @OneToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person id_person;


}
