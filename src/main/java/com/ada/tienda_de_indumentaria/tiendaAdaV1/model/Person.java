package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_person;
    private String name;
    private String last_name;
    private int dni;
    private int age;

    @OneToOne
    @JoinColumn(name = "id_turn", referencedColumnName = "id_turn")
    private Turn id_turn;

    @OneToOne
    @JoinColumn(name = "id_role", referencedColumnName = "id_role")
    private Role id_role;

}
