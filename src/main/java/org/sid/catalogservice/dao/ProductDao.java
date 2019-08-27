package org.sid.catalogservice.dao;

import org.sid.catalogservice.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProductDao extends JpaRepository<Product, Long> {
    @RestResource(path = "/designation")
    List<Product> findByDescriptionContains(@Param("desc") String desc);
    @RestResource(path = "/pagination")
    Page<Product> findByDescriptionContains(@Param("desc") String desc, Pageable pageable);
}
