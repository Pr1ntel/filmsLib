package org.example.filmslib.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "films")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Films {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private String duration;

    @Column(name = "release_year")
    private int releaseYear;

    @ManyToOne
    @JoinColumn(name = "style_film_id")
    private StyleFilms styleFilm;

    @Column(name = "producer")
    private String producer;

    @Column(name = "staring")
    private String staring;

    @Column(name = "country_of_manufacture")
    private String countryOfManufacture;

    @Column(name = "original_language")
    private String originalLanguage;

    @Column(name = "rating_film")
    private double ratingFilm;

    @Column(name = "description")
    private String description;
}
