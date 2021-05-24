package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ticket;

    private int total;

    @OneToOne
    @JoinColumn(name = "id_sale", referencedColumnName = "id_sale")
    private Sale id_sale;

    @OneToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person id_person;

    @OneToOne
    @JoinColumn(name = "id_branch_office", referencedColumnName = "id_branch_office")
    private Branch_office id_branch_office;


}
