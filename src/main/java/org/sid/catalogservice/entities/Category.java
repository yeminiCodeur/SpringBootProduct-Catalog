package org.sid.catalogservice.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Category {
    @Id @GeneratedValue
    private long id;
    private String designation;
}
