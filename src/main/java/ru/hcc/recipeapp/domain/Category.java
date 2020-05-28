package ru.hcc.recipeapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/*
 * Created by SS on 28/05/2020.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public Category() {
    }

    public Category(String description, Set<Recipe> recipes) {
        this.description = description;
        this.recipes = recipes;
    }

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
    }
}
