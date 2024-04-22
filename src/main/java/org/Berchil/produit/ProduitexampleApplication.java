package org.Berchil.produit;

import org.Berchil.produit.dao.entities.Produit;
import org.Berchil.produit.metier.ProduitManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProduitexampleApplication implements CommandLineRunner {

    @Autowired
    ProduitManager produitManager;

    public static void main(String[] args) {
        SpringApplication.run(ProduitexampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Produit produit0 = new Produit(null, "product1","product11", 200.0);
        Produit produit1 = new Produit(null, "product2","product22", 300.0);
        Produit produit2 = new Produit(null, "product3","product33", 400.0);
        produitManager.addProduit(produit0);
        produitManager.addProduit(produit1);
        produitManager.addProduit(produit2);

    }
}
