package com.idriss.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private Date date;
    private Date d_debut;
    private Date d_fin;

    @ManyToOne
    private  Cours cours;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Etudiant> Etudiants = new ArrayList<>();

}
