package org.sid.catalogservice;

import org.sid.catalogservice.dao.CategoryDao;
import org.sid.catalogservice.dao.ProductDao;
import org.sid.catalogservice.entities.Category;
import org.sid.catalogservice.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatalogServiceApplication implements CommandLineRunner {

    @Autowired
    ProductDao productDao;
    @Autowired
    RepositoryRestConfiguration restConfiguration;
    @Autowired
    CategoryDao categoryDao;

    public static void main(String[] args) {
        SpringApplication.run(CatalogServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Product.class);
        restConfiguration.exposeIdsFor(Category.class);
        /*
        Test l'insertion
        Category c1 =  new Category();
        Category c3=  new Category();
        Category c2 =  new Category();
        Category c4 =  new Category();
        c1.setDesignation("Informatique");
        c2.setDesignation("Electronique");
        c3.setDesignation("Aliment");
        c4.setDesignation("Jouets");
        categoryDao.save(c1);
        categoryDao.save(c2);
        categoryDao.save(c3);
        categoryDao.save(c4);

        productDao.save(new Product(null, "Ordnateur ACER",211006, 3,c1));
        productDao.save(new Product(null, "Lenovo",25892, 3,c1));
        productDao.save(new Product(null, "HP mini S5",258963, 3,c1));
        productDao.save(new Product(null, "Telephone",14000, 3,c1));
        productDao.save(new Product(null, "Chargeur HP PRO",10000, 3,c1));
        productDao.save(new Product(null, "Refrigerateur",10400, 3,c2));
        productDao.save(new Product(null, "Washing",108900, 3,c2));
        productDao.save(new Product(null, "Lait Cachier",108900, 3,c3));
        productDao.save(new Product(null, "Buisquit",1080, 3,c3));
        productDao.save(new Product(null, "Jus",8900, 3,c3));
        productDao.save(new Product(null, "Manette",8900, 3,c4));

        productDao.findAll().forEach(p->{
            System.out.println(p.getDescription());
        });
       */
    }
}
