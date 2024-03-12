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
public class Etudiant extends Personne{
    private String matricule;

    @ManyToMany(mappedBy = "Etudiant", fetch = FetchType.EAGER)
    private Collection<Seance> seances = new ArrayList<>();
}
