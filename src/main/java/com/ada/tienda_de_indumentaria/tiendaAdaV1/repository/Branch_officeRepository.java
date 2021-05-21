package com.ada.tienda_de_indumentaria.tiendaAdaV1.repository;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.Branch_office;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface Branch_officeRepository extends CrudRepository<Branch_office, Integer> {

    @Query("from Branch_office where name like %:name% or address like %:name%") // iterable es para traer una lista y query nos permite editar nuestros metodos
    Iterable<Branch_office> getBranch_officeByNameOrAddressLike(@Param("name") String name);
}
