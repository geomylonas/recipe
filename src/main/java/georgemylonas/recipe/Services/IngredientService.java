package georgemylonas.recipe.Services;

import georgemylonas.recipe.Repositories.RecipeRepository;
import georgemylonas.recipe.commands.IngredientCommand;
import georgemylonas.recipe.domain.Ingredient;

public interface IngredientService {
    public IngredientCommand findByRecipeIdAndIngredientId(Long RecipeId, Long IngredientId);
}
