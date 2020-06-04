package ru.hcc.recipeapp.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/*
 * Created by SS on 28/05/2020.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
