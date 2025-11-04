package com.example.programcaoweb.controller;

import com.example.programcaoweb.model.Diretor;
import com.example.programcaoweb.service.DiretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/diretores")
public class DiretorController {
    @Autowired
    private DiretorService diretorService;

    @GetMapping
    public List<Diretor> listarTodos() {
        return diretorService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Diretor> buscarPorId(@PathVariable Long id) {
        Optional<Diretor> diretor = diretorService.buscarPorId(id);
        return diretor.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Diretor criar(@RequestBody Diretor diretor) {
        return diretorService.salvar(diretor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Diretor> atualizar(@PathVariable Long id, @RequestBody Diretor diretor) {
        if (!diretorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        diretor.setId(id);
        return ResponseEntity.ok(diretorService.salvar(diretor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!diretorService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        diretorService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Diretor> atualizarParcial(@PathVariable Long id, @RequestBody Diretor diretor) {
        Optional<Diretor> existente = diretorService.buscarPorId(id);
        if (!existente.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Diretor d = existente.get();
        if (diretor.getNome() != null) d.setNome(diretor.getNome());
        if (diretor.getDataNascimento() != null) d.setDataNascimento(diretor.getDataNascimento());
        if (diretor.getNacionalidade() != null) d.setNacionalidade(diretor.getNacionalidade());
        return ResponseEntity.ok(diretorService.salvar(d));
    }
}

