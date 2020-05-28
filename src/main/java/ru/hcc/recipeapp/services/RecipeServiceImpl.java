package ru.hcc.recipeapp.services;

import org.springframework.stereotype.Service;
import ru.hcc.recipeapp.domain.Recipe;
import ru.hcc.recipeapp.repos.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/*
 * Created by SS on 28/05/2020.
 */
@Service
public class RecipeServiceImpl implements RecipeService {
    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
