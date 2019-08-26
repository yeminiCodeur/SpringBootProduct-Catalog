package org.sid.catalogservice;

import org.sid.catalogservice.dao.ProductDao;
import org.sid.catalogservice.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatalogServiceApplication  implements CommandLineRunner {
@Autowired  ProductDao  productDao;
@Autowired RepositoryRestConfiguration restConfiguration;
    public static void main(String[] args)  {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Product.class);
        productDao.save(new Product(null, "Ordinateur",2556, 3));
        productDao.save(new Product(null, "Imprimqnte",2556, 3));
        productDao.save(new Product(null, "Scanner",2556, 3));
        productDao.save(new Product(null, "Mouse",2556, 3));
        productDao.save(new Product(null, "Screens",2556, 3));
        productDao.findAll().forEach(p->{
            System.out.println(p.getDescription());
        });
    }
}
