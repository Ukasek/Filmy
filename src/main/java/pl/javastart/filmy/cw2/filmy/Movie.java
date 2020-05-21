package pl.javastart.filmy.cw2.filmy;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDateTime premiereDate;
    private String description;

    @Enumerated(EnumType.STRING)
    private MovieCategory category;

    public Movie() {
    }

    public Movie(Long id, String title, LocalDateTime premiereDate, String description, MovieCategory category) {
        this.id = id;
        this.title = title;
        this.premiereDate = premiereDate;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPremiereDate() {
        return premiereDate;
    }

    public void setPremiereDate(LocalDateTime premiereDate) {
        this.premiereDate = premiereDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MovieCategory getCategory() {
        return category;
    }

    public void setCategory(MovieCategory category) {
        this.category = category;
    }
}
