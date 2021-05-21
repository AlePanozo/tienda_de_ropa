package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_role;
    private String type_rol;

    @JsonManagedReference
    @ManyToMany
    @JoinTable(
            name = "role_resource",
            joinColumns = @JoinColumn(name = "id_role"),
            inverseJoinColumns = @JoinColumn(name = "id_resource"))
    private Set<Resource> roleresource;

    public int getId_role() {
        return id_role;
    }

    public void setId_role(int id_role) {
        this.id_role = id_role;
    }

    public String getType_rol() {
        return type_rol;
    }

    public void setType_rol(String type_rol) {
        this.type_rol = type_rol;
    }
}
