package ru.hcc.recipeapp.repos;

/*
 * Created by SS on 28/05/2020.
 */

import org.springframework.data.repository.CrudRepository;
import ru.hcc.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
