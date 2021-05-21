package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_resource;
    private String type_resource;

    @JsonBackReference
    @ManyToMany(mappedBy = "roleresource")
    private Set<Role> roles;

    public int getId_resource() {
        return id_resource;
    }

    public void setId_resource(int id_resource) {
        this.id_resource = id_resource;
    }

    public String getType_resource() {
        return type_resource;
    }

    public void setType_resource(String type_resource) {
        this.type_resource = type_resource;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
