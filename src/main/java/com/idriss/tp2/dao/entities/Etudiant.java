package com.idriss.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    private String nom;
    private String matricule;

    @ManyToMany(mappedBy = "Etudiant", fetch = FetchType.EAGER)
    private Collection<Seance> Seances = new ArrayList<>();
}
