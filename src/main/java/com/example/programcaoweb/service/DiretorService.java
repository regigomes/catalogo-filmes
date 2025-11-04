package com.example.programcaoweb.service;

import com.example.programcaoweb.model.Diretor;
import com.example.programcaoweb.repository.DiretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DiretorService {
    @Autowired
    private DiretorRepository diretorRepository;

    public List<Diretor> listarTodos() {
        return diretorRepository.findAll();
    }

    public Optional<Diretor> buscarPorId(Long id) {
        return diretorRepository.findById(id);
    }

    public Diretor salvar(Diretor diretor) {
        return diretorRepository.save(diretor);
    }

    public void deletar(Long id) {
        diretorRepository.deleteById(id);
    }
}

