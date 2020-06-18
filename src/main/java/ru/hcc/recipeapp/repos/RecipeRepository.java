package ru.hcc.recipeapp.repos;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.recipeapp.domain.Recipe;

/**
 * Created by SS on 28/05/2020.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
