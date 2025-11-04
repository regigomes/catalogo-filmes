package com.example.programcaoweb.service;

import com.example.programcaoweb.model.Ator;
import com.example.programcaoweb.repository.AtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AtorService {
    @Autowired
    private AtorRepository atorRepository;

    public List<Ator> listarTodos() {
        return atorRepository.findAll();
    }

    public Optional<Ator> buscarPorId(Long id) {
        return atorRepository.findById(id);
    }

    public Ator salvar(Ator ator) {
        return atorRepository.save(ator);
    }

    public void deletar(Long id) {
        atorRepository.deleteById(id);
    }
}

