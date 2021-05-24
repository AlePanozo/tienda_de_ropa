package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Resource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_resource;
    private String type_resource;

    @JsonBackReference
    @ManyToMany(mappedBy = "roleresource")
    private Set<Role> roles;

}
