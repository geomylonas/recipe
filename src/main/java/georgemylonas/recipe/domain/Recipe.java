package georgemylonas.recipe.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    @Lob
    private String directions;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "recipe")
    private Set<Ingredient> ingredient=new HashSet<>();
    @Enumerated(value = EnumType.STRING)
    private Difficulty difficulty;
    @Lob
    private Byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
    @ManyToMany
    @JoinTable(name = "Recipe_Category",joinColumns = @JoinColumn(name = "Recipe_ID"),inverseJoinColumns = @JoinColumn(name = "Cateogory_id"))
    private Set<Category> categories=new HashSet<>();

    public Recipe() {
    }

    public void setNotes(Notes notes) {
        notes.setRecipe(this);
        this.notes = notes;
    }

    public void addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.getIngredient().add(ingredient);
    }

    public void addCategory(Category category){
        category.getRecipes().add(this);
        this.getCategories().add(category);
    }

}
