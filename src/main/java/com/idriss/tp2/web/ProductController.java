package com.idriss.tp2.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.idriss.tp2.dao.entities.Product;
import com.idriss.tp2.service.ProductManager;

import java.util.List;




    @Controller
    public class ProductController {

        @Autowired
        private ProductManager productManager;

        @GetMapping("/getProductsList")
        public String getALlProducts(Model model) {
            List<Product> products = productManager.getAllProducts();
            model.addAttribute("listProduits", products);
            return "listProduit" ;
        }

        @GetMapping("/ajouterproduit")
        public String addProduct(Model model) {
            return "addProduit";
        }

        @PostMapping("ajouterproduit")
        public String addproductdb(Model model, @RequestParam(name = "description") String description,
                                   @RequestParam(name = "price") float price) {
            Product product = new Product();
            product.setDesignation(description);
            product.setPrix(price);
            productManager.addProduct(product);
            return getALlProducts(model);
        }
    }

