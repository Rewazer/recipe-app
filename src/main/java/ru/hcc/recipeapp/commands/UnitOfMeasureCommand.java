package ru.hcc.recipeapp.commands;

/*
 * Created by SS on 10/06/2020.
 */

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UnitOfMeasureCommand {

    private Long id;

    private String description;
}
