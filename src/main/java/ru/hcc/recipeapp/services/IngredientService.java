package ru.hcc.recipeapp.services;

/*
 * Created by SS on 21/06/2020.
 */

import ru.hcc.recipeapp.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long id);

    IngredientCommand saveIngredientCommand(IngredientCommand command);
}
