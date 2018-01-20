package georgemylonas.recipe.Services;

import georgemylonas.recipe.Repositories.RecipeRepository;
import georgemylonas.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {
     Set<Recipe> getRecipes();
     Recipe findById(Long l);
}
