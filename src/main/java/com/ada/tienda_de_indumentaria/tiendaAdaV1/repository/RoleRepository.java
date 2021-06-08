package com.ada.tienda_de_indumentaria.tiendaAdaV1.repository;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;


public interface RoleRepository extends CrudRepository<Role, Integer> {

    @Query(value = "select r.* from role as r inner join person as p on r.id_role = p.id_person where p.id_person = :personId", nativeQuery = true)
    Collection<Role> getRolesByPersonId(@Param("personId") String personId);


}
