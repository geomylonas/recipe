package georgemylonas.recipe.Repositories;

import georgemylonas.recipe.domain.Category;
import org.springframework.context.annotation.Description;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
