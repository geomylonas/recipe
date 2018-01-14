package georgemylonas.recipe.domain;

import javax.persistence.*;

@Entity
public class Notes {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private  Recipe recipe;
    @Lob
    private String recipeNotes;
}
