package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.*;

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

    public int getId_branch_office() {
        return id_branch_office;
    }

    public void setId_branch_office(int id_branch_office) {
        this.id_branch_office = id_branch_office;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public Turn getId_turn() {
        return id_turn;
    }

    public void setId_turn(Turn id_turn) {
        this.id_turn = id_turn;
    }

    public Stock getId_stock() {
        return id_stock;
    }

    public void setId_stock(Stock id_stock) {
        this.id_stock = id_stock;
    }

    public Person getId_person() {
        return id_person;
    }

    public void setId_person(Person id_person) {
        this.id_person = id_person;
    }
}
