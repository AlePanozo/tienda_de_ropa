package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_stock;
    private Date update_;

    @OneToOne
    @JoinColumn(name = "id_garment", referencedColumnName = "id_garment")
    private Garment id_garment;

    private int amount;

    public int getId_stock() {
        return id_stock;
    }

    public void setId_stock(int id_stock) {
        this.id_stock = id_stock;
    }

    public Date getUpdate_() {
        return update_;
    }

    public void setUpdate_(Date update_) {
        this.update_ = update_;
    }

    public Garment getId_garment() {
        return id_garment;
    }

    public void setId_garment(Garment id_garment) {
        this.id_garment = id_garment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
