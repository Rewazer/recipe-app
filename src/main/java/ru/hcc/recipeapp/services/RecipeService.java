package ru.hcc.recipeapp.services;

import ru.hcc.recipeapp.commands.RecipeCommand;
import ru.hcc.recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by SS on 28/05/2020.
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
