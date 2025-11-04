package com.example.programcaoweb.repository;

import com.example.programcaoweb.model.Diretor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Long> {
}

