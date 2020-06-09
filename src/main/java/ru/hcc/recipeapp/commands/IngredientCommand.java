package ru.hcc.recipeapp.commands;

/*
 * Created by SS on 10/06/2020.
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {

    private Long id;

    private String description;

    private BigDecimal amount;

    private UnitOfMeasureCommand unitOfMeasure;
}
