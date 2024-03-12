package com.idriss.tp2.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor
@AllArgsConstructor
public class Professeur extends Personne{
    private Date d_affection;

    @OneToOne(mappedBy = "Professeur")
    private Cours Cours;


}
