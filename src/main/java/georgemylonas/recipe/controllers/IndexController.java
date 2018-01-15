package georgemylonas.recipe.controllers;

import georgemylonas.recipe.Repositories.CategoryRepository;
import georgemylonas.recipe.Repositories.UnitOfMeasureRepository;
import georgemylonas.recipe.Services.RecipeService;
import georgemylonas.recipe.Services.RecipeServiceImpl;
import georgemylonas.recipe.domain.Category;
import georgemylonas.recipe.domain.UnitOfMeasure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {
    private RecipeService recipeService;

    @Autowired
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","","index"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}

