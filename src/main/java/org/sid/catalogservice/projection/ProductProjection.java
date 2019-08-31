package org.sid.catalogservice.projection;

import org.sid.catalogservice.entities.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Product.class)
public interface ProductProjection {
    public double getPrice();

    public String getDescription();
}
