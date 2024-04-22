package org.Berchil.produit.dao.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.Berchil.produit.dao.entities.Produit;

@Transactional
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    Page<Produit> findByDesignationContains(String keyword, Pageable pageable);
}