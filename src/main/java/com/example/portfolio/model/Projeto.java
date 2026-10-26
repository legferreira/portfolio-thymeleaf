package com.example.portfolio.model;

import java.util.List;

// Representa um card da seção "Projetos e atuação"
public class Projeto {

    private String titulo;
    private String descricao;
    private List<String> tags;

    public Projeto(String titulo, String descricao, List<String> tags) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tags = tags;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<String> getTags() {
        return tags;
    }
}
