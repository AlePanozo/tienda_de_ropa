package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ticket;

    @OneToOne
    @JoinColumn(name = "id_sale", referencedColumnName = "id_sale")
    private Sale id_sale;

    @OneToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person id_person;

    @OneToOne
    @JoinColumn(name = "id_branch_office", referencedColumnName = "id_branch_office")
    private Branch_office id_branch_office;

    private int total;

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Sale getId_sale() {
        return id_sale;
    }

    public void setId_sale(Sale id_sale) {
        this.id_sale = id_sale;
    }

    public Person getId_person() {
        return id_person;
    }

    public void setId_person(Person id_person) {
        this.id_person = id_person;
    }

    public Branch_office getId_branch_office() {
        return id_branch_office;
    }

    public void setId_branch_office(Branch_office id_branch_office) {
        this.id_branch_office = id_branch_office;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
