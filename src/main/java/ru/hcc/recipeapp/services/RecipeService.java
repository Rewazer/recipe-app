package ru.hcc.recipeapp.services;

/*
 * Created by SS on 28/05/2020.
 */

import ru.hcc.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
