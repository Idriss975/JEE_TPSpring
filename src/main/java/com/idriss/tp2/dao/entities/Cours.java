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
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String titre;
    private String description;
    @OneToOne
    private Professeur Professeur;

    @OneToMany(mappedBy = "Cours", fetch = FetchType.LAZY)
    private Collection<Seance> Seances = new ArrayList<>();
}
