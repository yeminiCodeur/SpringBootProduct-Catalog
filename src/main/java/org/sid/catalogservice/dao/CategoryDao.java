package org.sid.catalogservice.dao;

import org.sid.catalogservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.transaction.Transactional;

@Transactional
@RepositoryRestResource
@CrossOrigin("*") // permit d'accepter les requests
public interface CategoryDao extends JpaRepository<Category,Long> {
}
