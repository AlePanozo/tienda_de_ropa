package com.ada.tienda_de_indumentaria.tiendaAdaV1.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_role;
    private String type_rol;

}
