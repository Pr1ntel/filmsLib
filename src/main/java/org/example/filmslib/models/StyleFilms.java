package org.example.filmslib.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "style_films")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StyleFilms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "style_name")
    private String name;
}
