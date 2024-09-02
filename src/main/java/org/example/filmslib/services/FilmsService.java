package org.example.filmslib.services;


import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.filmslib.models.Films;
import org.example.filmslib.repositorys.FilmsRepository;
import org.example.filmslib.repositorys.StyleFilmsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class FilmsService {
    private final FilmsRepository filmsRepository;
    private final StyleFilmsRepository styleFilmsRepository;

    public List<Films> getAll() {
        return filmsRepository.findAll().stream().map(
                filmsItem -> Films.builder()
                        .id(filmsItem.getId())
                        .name(filmsItem.getName())
                        .duration(filmsItem.getDuration())
                        .releaseYear(filmsItem.getReleaseYear())
                        .styleFilm(filmsItem.getStyleFilm())
                        .producer(filmsItem.getProducer())
                        .staring(filmsItem.getStaring())
                        .countryOfManufacture(filmsItem.getCountryOfManufacture())
                        .originalLanguage(filmsItem.getOriginalLanguage())
                        .ratingFilm(filmsItem.getRatingFilm())
                        .description(filmsItem.getDescription())
                        .build()
        ).collect(Collectors.toList());
    }
}
