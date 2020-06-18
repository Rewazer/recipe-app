package ru.hcc.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.hcc.recipeapp.domain.Difficulty;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SS on 10/06/2020.
 */

@Getter
@Setter
@NoArgsConstructor
public class RecipeCommand {

    private Long id;

    private String description;

    private Integer prepTime;

    private Integer cookTime;

    private Integer servings;

    private String source;

    private String url;

    private String directions;

    private Set<IngredientCommand> ingredients = new HashSet<>();

    private Difficulty difficulty;

    private NotesCommand notes;

    private Set<CategoryCommand> categories = new HashSet<>();
}
