package com.idriss.tp2.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.idriss.tp2.dao.entities.Product;

public interface CoursRepository  extends JpaRepository<Product , Integer> {
}
