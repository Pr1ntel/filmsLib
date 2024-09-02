package org.example.filmslib.repositorys;

import org.example.filmslib.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository  extends JpaRepository<Users, Integer> {
    Optional<Users> findByUsername(String username);
}
