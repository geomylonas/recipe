package georgemylonas.recipe.Services;

import georgemylonas.recipe.Repositories.RecipeRepository;
import georgemylonas.recipe.domain.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes=new HashSet<>();
        //recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }
}
