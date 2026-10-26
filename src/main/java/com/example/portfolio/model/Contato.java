package com.example.portfolio.model;

// Representa um link de contato (LinkedIn, GitHub...)
public class Contato {

    private String nome;
    private String link;
    private String icone;

    public Contato(String nome, String link, String icone) {
        this.nome = nome;
        this.link = link;
        this.icone = icone;
    }

    public String getNome() {
        return nome;
    }

    public String getLink() {
        return link;
    }

    public String getIcone() {
        return icone;
    }
}
