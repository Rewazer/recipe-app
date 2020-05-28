package ru.hcc.recipeapp.repos;

/*
 * Created by SS on 28/05/2020.
 */

import org.springframework.data.repository.CrudRepository;
import ru.hcc.recipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
