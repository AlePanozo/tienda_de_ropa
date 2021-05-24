package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
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

}
