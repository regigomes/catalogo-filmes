package com.example.programcaoweb.controller;

import com.example.programcaoweb.model.Filme;
import com.example.programcaoweb.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<Filme> listarTodos() {
        return filmeService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        Optional<Filme> filme = filmeService.buscarPorId(id);
        return filme.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Filme criar(@RequestBody Filme filme) {
        return filmeService.salvar(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        if (!filmeService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        filme.setId(id);
        return ResponseEntity.ok(filmeService.salvar(filme));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!filmeService.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        filmeService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Filme> atualizarParcial(@PathVariable Long id, @RequestBody Filme filme) {
        Optional<Filme> existente = filmeService.buscarPorId(id);
        if (!existente.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Filme f = existente.get();
        if (filme.getNome() != null) f.setNome(filme.getNome());
        if (filme.getDataLancamento() != null) f.setDataLancamento(filme.getDataLancamento());
        if (filme.getOrcamento() != null) f.setOrcamento(filme.getOrcamento());
        if (filme.getDescricao() != null) f.setDescricao(filme.getDescricao());
        if (filme.getDiretor() != null) f.setDiretor(filme.getDiretor());
        if (filme.getAtores() != null) f.setAtores(filme.getAtores());
        return ResponseEntity.ok(filmeService.salvar(f));
    }

    @GetMapping("/pesquisa")
    public List<Filme> pesquisarPorNome(@RequestParam String nome) {
        return filmeService.buscarPorNome(nome);
    }
}

