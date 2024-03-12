package com.idriss.tp2;

import com.idriss.tp2.dao.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {
	@Autowired
	private ProductRepository pR;

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Create
		Product Prod = new Product(1, "Sanicroix", "eye dropplets", 0.5);
		pR.save(Prod);

		//Read
		Prod = pR.getReferenceById(1);
		System.out.println(Prod);

		// Update
		Prod.setPrice(10);

		//Delete
		pR.delete(Prod);

	}

}
