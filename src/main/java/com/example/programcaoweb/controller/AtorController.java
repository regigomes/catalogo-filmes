package com.example.programcaoweb.controller;

import com.example.programcaoweb.model.Ator;
import com.example.programcaoweb.service.AtorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/atores")
public class AtorController {
    @Autowired
    private AtorService atorService;

    @GetMapping
    public List<Ator> listarTodos() {
        return atorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ator> buscarPorId(@PathVariable Long id) {
        Optional<Ator> ator = atorService.buscarPorId(id);
        return ator.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Ator criar(@RequestBody Ator ator) {
        return atorService.salvar(ator);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Ator> atualizar(@PathVariable Long id, @RequestBody Ator ator) {
        if (!atorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        ator.setId(id);
        return ResponseEntity.ok(atorService.salvar(ator));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!atorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        atorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Ator> atualizarParcial(@PathVariable Long id, @RequestBody Ator ator) {
        Optional<Ator> existente = atorService.buscarPorId(id);
        if (!existente.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Ator a = existente.get();
        if (ator.getNome() != null) a.setNome(ator.getNome());
        if (ator.getDataNascimento() != null) a.setDataNascimento(ator.getDataNascimento());
        if (ator.getNacionalidade() != null) a.setNacionalidade(ator.getNacionalidade());
        return ResponseEntity.ok(atorService.salvar(a));
    }
}

