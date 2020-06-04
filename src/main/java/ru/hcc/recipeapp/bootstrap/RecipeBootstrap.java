package ru.hcc.recipeapp.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.hcc.recipeapp.domain.*;
import ru.hcc.recipeapp.repos.CategoryRepository;
import ru.hcc.recipeapp.repos.RecipeRepository;
import ru.hcc.recipeapp.repos.UnitOfMeasureRepository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/*
 * Created by SS on 28/05/2020.
 */
@Slf4j
@Component
public class RecipeBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    private RecipeRepository recipeRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;
    private CategoryRepository categoryRepository;
    List<Recipe> recipes = new ArrayList<>();

    public RecipeBootstrap(RecipeRepository recipeRepository, UnitOfMeasureRepository unitOfMeasureRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Recipe> getRecipes() {
        List<Recipe> recipes = new ArrayList<>();

        Optional<UnitOfMeasure> teaspoonUomOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        Optional<UnitOfMeasure> tablespoonUomOptional = unitOfMeasureRepository.findByDescription("Tablespoon");
        Optional<UnitOfMeasure> cupUomOptional = unitOfMeasureRepository.findByDescription("Cup");
        Optional<UnitOfMeasure> pinchUomOptional = unitOfMeasureRepository.findByDescription("Pinch");
        Optional<UnitOfMeasure> ounceUomOptional = unitOfMeasureRepository.findByDescription("Ounce");
        Optional<UnitOfMeasure> pintUomOptional = unitOfMeasureRepository.findByDescription("Pint");
        Optional<UnitOfMeasure> eachUomOptional = unitOfMeasureRepository.findByDescription("Each");
        Optional<UnitOfMeasure> dashUomOptional = unitOfMeasureRepository.findByDescription("Dash");
        if (!teaspoonUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!tablespoonUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!cupUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!pinchUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!ounceUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!pintUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!eachUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        if (!dashUomOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        UnitOfMeasure teaspoonUom = teaspoonUomOptional.get();
        UnitOfMeasure tablespoonUom = tablespoonUomOptional.get();
        UnitOfMeasure cupUom = cupUomOptional.get();
        UnitOfMeasure pinchUom = pinchUomOptional.get();
        UnitOfMeasure ounceUom = ounceUomOptional.get();
        UnitOfMeasure pintUom = pintUomOptional.get();
        UnitOfMeasure eachUom = eachUomOptional.get();
        UnitOfMeasure dashUom = dashUomOptional.get();

        Optional<Category> categoryMexicanOptional = categoryRepository.findByDescription("Mexican");
        if (!categoryMexicanOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        Category mexicanCat = categoryMexicanOptional.get();

        Optional<Category> categoryAmericanOptional = categoryRepository.findByDescription("American");
        if (!categoryAmericanOptional.isPresent()) {
            throw new NoSuchElementException("Expected UOM not found");
        }
        Category americanCat = categoryMexicanOptional.get();
        Recipe guacamole = new Recipe();
        guacamole.setDescription("Perfect Guacamole Recipe");
        guacamole.setPrepTime(10);
        guacamole.setCookTime(0);
        guacamole.setDifficulty(Difficulty.EASY);
        guacamole.setDirections(
                "1 Cut the avocado, remove flesh: Cut the avocados in half. Remove the pit. Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. (See How to Cut and Peel an Avocado.) Place in a bowl." +
                        "2 Mash with a fork: Using a fork, roughly mash the avocado. (Don't overdo it! The guacamole should be a little chunky.)" +
                        "3 Add salt, lime juice, and the rest: Sprinkle with salt and lime (or lemon) juice. The acid in the lime juice will provide some balance to the richness of the avocado and will help delay the avocados from turning brown.\n" +
                        "\n" +
                        "Add the chopped onion, cilantro, black pepper, and chiles. Chili peppers vary individually in their hotness. So, start with a half of one chili pepper and add to the guacamole to your desired degree of hotness.\n" +
                        "\n" +
                        "Remember that much of this is done to taste because of the variability in the fresh ingredients. Start with this recipe and adjust to your taste.\n" +
                        "\n" +
                        "Chilling tomatoes hurts their flavor, so if you want to add chopped tomato to your guacamole, add it just before serving." +
                        "4 Serve: Serve immediately, or if making a few hours ahead, place plastic wrap on the surface of the guacamole and press down to cover it and to prevent air reaching it. (The oxygen in the air causes oxidation which will turn the guacamole brown.) Refrigerate until ready to serve.");
        guacamole.addIngredient(new Ingredient("ripe avocados", new BigDecimal(2), pinchUom));
        guacamole.addIngredient(new Ingredient("salt", new BigDecimal(".25"), teaspoonUom));
        guacamole.addIngredient(new Ingredient("fresh lime juice or lemon juice", new BigDecimal(1), tablespoonUom));
        guacamole.addIngredient(new Ingredient("minced red onion or thinly sliced green onion", new BigDecimal(2), tablespoonUom));
        guacamole.addIngredient(new Ingredient("serrano chiles, stems and seeds removed, minced", new BigDecimal(1), eachUom));
        guacamole.addIngredient(new Ingredient("cilantro (leaves and tender stems), finely chopped", new BigDecimal(2), tablespoonUom));
        guacamole.addIngredient(new Ingredient("freshly grated black pepper", new BigDecimal(1), dashUom));
        guacamole.addIngredient(new Ingredient("ripe tomato", new BigDecimal(".5"), pinchUom));
        guacamole.addIngredient(new Ingredient("Red radishes or jicama", new BigDecimal(1), eachUom));
        guacamole.addIngredient(new Ingredient("Tortilla chips", new BigDecimal(1), eachUom));
        guacamole.getCategories().add(americanCat);
        guacamole.getCategories().add(mexicanCat);

        recipes.add(guacamole);

        Recipe tacosRecipe = new Recipe();
        tacosRecipe.setDescription("Spicy Grilled Chicken Taco");
        tacosRecipe.setCookTime(9);
        tacosRecipe.setPrepTime(20);
        tacosRecipe.setDifficulty(Difficulty.MODERATE);

        tacosRecipe.setDirections("1 Prepare a gas or charcoal grill for medium-high, direct heat.\n" +
                "2 Make the marinade and coat the chicken: In a large bowl, stir together the chili powder, oregano, cumin, sugar, salt, garlic and orange zest. Stir in the orange juice and olive oil to make a loose paste. Add the chicken to the bowl and toss to coat all over.\n" +
                "Set aside to marinate while the grill heats and you prepare the rest of the toppings.\n" +
                "\n" +
                "\n" +
                "3 Grill the chicken: Grill the chicken for 3 to 4 minutes per side, or until a thermometer inserted into the thickest part of the meat registers 165F. Transfer to a plate and rest for 5 minutes.\n" +
                "4 Warm the tortillas: Place each tortilla on the grill or on a hot, dry skillet over medium-high heat. As soon as you see pockets of the air start to puff up in the tortilla, turn it with tongs and heat for a few seconds on the other side.\n" +
                "Wrap warmed tortillas in a tea towel to keep them warm until serving.\n" +
                "5 Assemble the tacos: Slice the chicken into strips. On each tortilla, place a small handful of arugula. Top with chicken slices, sliced avocado, radishes, tomatoes, and onion slices. Drizzle with the thinned sour cream. Serve with lime wedges.\n" +
                "\n" +
                "\n" +
                "Read more: http://www.simplyrecipes.com/recipes/spicy_grilled_chicken_tacos/#ixzz4jvtrAnNm");

        Notes tacoNotes = new Notes();
        tacoNotes.setRecipeNotes("We have a family motto and it is this: Everything goes better in a tortilla.\n" +
                "Any and every kind of leftover can go inside a warm tortilla, usually with a healthy dose of pickled jalapenos. I can always sniff out a late-night snacker when the aroma of tortillas heating in a hot pan on the stove comes wafting through the house.\n" +
                "Today’s tacos are more purposeful – a deliberate meal instead of a secretive midnight snack!\n" +
                "First, I marinate the chicken briefly in a spicy paste of ancho chile powder, oregano, cumin, and sweet orange juice while the grill is heating. You can also use this time to prepare the taco toppings.\n" +
                "Grill the chicken, then let it rest while you warm the tortillas. Now you are ready to assemble the tacos and dig in. The whole meal comes together in about 30 minutes!\n" +
                "\n" +
                "\n" +
                "Read more: http://www.simplyrecipes.com/recipes/spicy_grilled_chicken_tacos/#ixzz4jvu7Q0MJ");
        tacosRecipe.setNotes(tacoNotes);

        tacosRecipe.addIngredient(new Ingredient("Ancho Chili Powder", new BigDecimal(2), tablespoonUom));
        tacosRecipe.addIngredient(new Ingredient("Dried Oregano", new BigDecimal(1), teaspoonUom));
        tacosRecipe.addIngredient(new Ingredient("Dried Cumin", new BigDecimal(1), teaspoonUom));
        tacosRecipe.addIngredient(new Ingredient("Sugar", new BigDecimal(1), teaspoonUom));
        tacosRecipe.addIngredient(new Ingredient("Salt", new BigDecimal(".5"), teaspoonUom));
        tacosRecipe.addIngredient(new Ingredient("Clove of Garlic, Choppedr", new BigDecimal(1), eachUom));
        tacosRecipe.addIngredient(new Ingredient("finely grated orange zestr", new BigDecimal(1), tablespoonUom));
        tacosRecipe.addIngredient(new Ingredient("fresh-squeezed orange juice", new BigDecimal(3), tablespoonUom));
        tacosRecipe.addIngredient(new Ingredient("Olive Oil", new BigDecimal(2), tablespoonUom));
        tacosRecipe.addIngredient(new Ingredient("boneless chicken thighs", new BigDecimal(4), tablespoonUom));
        tacosRecipe.addIngredient(new Ingredient("small corn tortillas", new BigDecimal(8), eachUom));
        tacosRecipe.addIngredient(new Ingredient("packed baby arugula", new BigDecimal(3), cupUom));
        tacosRecipe.addIngredient(new Ingredient("medium ripe avocados, slic", new BigDecimal(2), eachUom));
        tacosRecipe.addIngredient(new Ingredient("radishes, thinly sliced", new BigDecimal(4), eachUom));
        tacosRecipe.addIngredient(new Ingredient("cherry tomatoes, halved", new BigDecimal(".5"), pintUom));
        tacosRecipe.addIngredient(new Ingredient("red onion, thinly sliced", new BigDecimal(".25"), eachUom));
        tacosRecipe.addIngredient(new Ingredient("Roughly chopped cilantro", new BigDecimal(4), eachUom));
        tacosRecipe.addIngredient(new Ingredient("cup sour cream thinned with 1/4 cup milk", new BigDecimal(4), cupUom));
        tacosRecipe.addIngredient(new Ingredient("lime, cut into wedges", new BigDecimal(4), eachUom));

        tacosRecipe.getCategories().add(americanCat);
        tacosRecipe.getCategories().add(mexicanCat);

        tacosRecipe.setUrl("http://www.simplyrecipes.com/recipes/spicy_grilled_chicken_tacos/");
        tacosRecipe.setServings(4);
        tacosRecipe.setSource("Simply Recipes");

        recipes.add(tacosRecipe);
        return recipes;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        recipeRepository.saveAll(getRecipes());
    }
}
