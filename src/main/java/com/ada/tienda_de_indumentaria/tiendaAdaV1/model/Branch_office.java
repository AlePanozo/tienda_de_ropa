package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Branch_office {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_branch_office;
    private String name;
    private String address;
    private int telephone;

    @OneToOne
    @JoinColumn(name = "id_turn", referencedColumnName = "id_turn")
    private Turn id_turn;

    @OneToOne
    @JoinColumn(name = "id_stock", referencedColumnName = "id_stock")
    private Stock id_stock;

    @OneToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person id_person;

}
