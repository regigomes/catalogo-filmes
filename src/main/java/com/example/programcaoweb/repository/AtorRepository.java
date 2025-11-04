package com.example.programcaoweb.repository;

import com.example.programcaoweb.model.Ator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorRepository extends JpaRepository<Ator, Long> {
}

