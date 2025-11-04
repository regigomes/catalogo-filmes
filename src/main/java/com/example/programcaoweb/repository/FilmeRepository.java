package com.example.programcaoweb.repository;

import com.example.programcaoweb.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {
    List<Filme> findByNomeIgnoreCaseContaining(String nome);
}

