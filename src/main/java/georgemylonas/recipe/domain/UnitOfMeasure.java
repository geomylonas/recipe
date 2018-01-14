package georgemylonas.recipe.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class UnitOfMeasure {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
