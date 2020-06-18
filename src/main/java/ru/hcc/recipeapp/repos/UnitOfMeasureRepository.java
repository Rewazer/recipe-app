package ru.hcc.recipeapp.repos;

import org.springframework.data.repository.CrudRepository;
import ru.hcc.recipeapp.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * Created by SS on 28/05/2020.
 */

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
