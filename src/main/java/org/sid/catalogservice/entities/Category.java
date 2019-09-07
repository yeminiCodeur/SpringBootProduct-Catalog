package org.sid.catalogservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id @GeneratedValue
    private long id;
    private String designation;
    @OneToMany(mappedBy = "category")
    private Collection<Product>  products;
}
