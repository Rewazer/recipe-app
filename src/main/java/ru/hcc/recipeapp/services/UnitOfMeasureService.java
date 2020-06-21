package ru.hcc.recipeapp.services;

/*
 * Created by SS on 21/06/2020.
 */

import ru.hcc.recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
