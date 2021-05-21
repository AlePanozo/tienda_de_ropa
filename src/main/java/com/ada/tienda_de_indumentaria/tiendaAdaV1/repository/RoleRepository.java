package com.ada.tienda_de_indumentaria.tiendaAdaV1.repository;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface RoleRepository extends CrudRepository<Role, Integer> {

}
