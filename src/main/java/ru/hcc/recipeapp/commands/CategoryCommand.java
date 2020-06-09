package ru.hcc.recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * Created by SS on 10/06/2020.
 */

@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {

    private Long id;

    private String description;
}
