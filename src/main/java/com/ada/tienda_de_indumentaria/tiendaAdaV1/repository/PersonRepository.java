package com.ada.tienda_de_indumentaria.tiendaAdaV1.repository;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query(value = "select * from Person where id_role = :id_role", nativeQuery = true)
    Iterable<Person> getPersonsByRoleLike (@Param("id_role") String id_role);
}
