package com.ada.tienda_de_indumentaria.tiendaAdaV1.repository;

import com.ada.tienda_de_indumentaria.tiendaAdaV1.model.Resource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface ResourceRepository extends CrudRepository<Resource, Integer> {

    @Query(value = "select r.* from resource as r inner join role_resource as rr" +
            "on r.id_resource =rr.id_resource where rr.id_role = :roleId", nativeQuery = true)
    Collection<Resource> getResourceByRole(@Param("roleId") String roleId);

}
