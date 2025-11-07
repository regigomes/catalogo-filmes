package com.example.programcaoweb.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate dataLancamento;
    private Double orcamento;
    private String descricao;

    @ManyToOne
    private Diretor diretor;

    @ManyToMany
    private List<Ator> atores;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public LocalDate getDataLancamento() { return dataLancamento; }
    public void setDataLancamento(LocalDate dataLancamento) { this.dataLancamento = dataLancamento; }
    public Double getOrcamento() { return orcamento; }
    public void setOrcamento(Double orcamento) { this.orcamento = orcamento; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public Diretor getDiretor() { return diretor; }
    public void setDiretor(Diretor diretor) { this.diretor = diretor; }
    public List<Ator> getAtores() { return atores; }
    public void setAtores(List<Ator> atores) { this.atores = atores; }
}
