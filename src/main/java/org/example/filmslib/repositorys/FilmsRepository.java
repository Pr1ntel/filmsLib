package org.example.filmslib.repositorys;

import org.example.filmslib.models.Films;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmsRepository extends JpaRepository<Films, Integer> {
}
