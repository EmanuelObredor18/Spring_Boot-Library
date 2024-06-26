package com.obredor.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obredor.library.models.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
  
}
