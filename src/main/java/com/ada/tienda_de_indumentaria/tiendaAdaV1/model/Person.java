package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.*;

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

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Turn getId_turn() {
        return id_turn;
    }

    public void setId_turn(Turn id_turn) {
        this.id_turn = id_turn;
    }

    public Role getId_role() {
        return id_role;
    }

    public void setId_role(Role id_role) {
        this.id_role = id_role;
    }
}
