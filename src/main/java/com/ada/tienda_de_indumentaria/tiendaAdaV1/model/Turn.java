package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_turn;
    private String type_turno;

    public int getId_turn() {
        return id_turn;
    }

    public void setId_turn(int id_turn) {
        this.id_turn = id_turn;
    }

    public String getType_turno() {
        return type_turno;
    }

    public void setType_turno(String type_turno) {
        this.type_turno = type_turno;
    }
}
