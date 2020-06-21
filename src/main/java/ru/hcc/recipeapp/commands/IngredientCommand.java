package ru.hcc.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by SS on 10/06/2020.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;

    private Long recipeId;

    private String description;

    private BigDecimal amount;

    private UnitOfMeasureCommand uom;
}
