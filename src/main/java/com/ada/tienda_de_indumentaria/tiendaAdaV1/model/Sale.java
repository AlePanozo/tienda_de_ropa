package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_sale;

    @OneToOne
    @JoinColumn(name = "id_person", referencedColumnName = "id_person")
    private Person id_person;

    private String description;
    private int price;
    private int amount;

    @OneToOne
    @JoinColumn(name = "id_branch_office", referencedColumnName = "id_branch_office")
    private Branch_office id_branch_office;

    private Date id_date;
    private int total;

    public int getId_sale() {
        return id_sale;
    }

    public void setId_sale(int id_sale) {
        this.id_sale = id_sale;
    }

    public Person getId_person() {
        return id_person;
    }

    public void setId_person(Person id_person) {
        this.id_person = id_person;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Branch_office getId_branch_office() {
        return id_branch_office;
    }

    public void setId_branch_office(Branch_office id_branch_office) {
        this.id_branch_office = id_branch_office;
    }

    public Date getId_date() {
        return id_date;
    }

    public void setId_date(Date id_date) {
        this.id_date = id_date;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
