package com.example.portfolio.controller;

import com.example.portfolio.model.Contato;
import com.example.portfolio.model.Projeto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Year;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        
        model.addAttribute("nome", "Leticia Ferreira");
        model.addAttribute("cargo", "Analista de Produto | PMO | Dados");
        model.addAttribute("introducao",
                "Conecto produto, dados e processos para transformar demandas em entregas claras, priorizadas e eficientes.");

    
        List<String> sobre = List.of(
                "Analista de Produto com atuação em PMO, gestão de projetos de desenvolvimento e iniciativas de melhoria de processos operacionais, do levantamento de requisitos até a entrega de soluções, utilizando metodologias ágeis (Scrum, Kanban).",
                "Atuo na intermediação entre times internos, clientes e parceiros externos, garantindo alinhamento, clareza e eficiência nas demandas, com foco em priorização de backlog, condução de rituais ágeis e melhoria contínua de processos.",
                "Combino experiência prática como Product Owner com uma base técnica sólida em dados, desenvolvendo queries em SQL (Databricks) e scripts em Python para geração de bases, automação de processos e apoio a decisões estratégicas. Já atuei em precificação de ativos financeiros, marketplaces, sistemas industriais e projetos de governança corporativa, unindo visão de produto, dados e processos em cada uma dessas frentes."
        );
        model.addAttribute("sobre", sobre);

     
        List<String> habilidades = List.of(
                "Product Owner", "PMO", "Scrum", "Kanban",
                "Priorização de backlog", "Levantamento de requisitos",
                "Melhoria de processos", "SQL (Databricks)", "Python"
        );
        model.addAttribute("habilidades", habilidades);

      
        List<Projeto> projetos = List.of(
                new Projeto("Precificação de ativos financeiros",
                        "Geração de bases com SQL (Databricks) e scripts em Python para apoiar decisões estratégicas.",
                        List.of("SQL", "Python", "Dados")),
                new Projeto("Marketplaces",
                        "Priorização de backlog e condução de rituais ágeis, alinhando times internos, clientes e parceiros.",
                        List.of("Product Owner", "Scrum")),
                new Projeto("Sistemas industriais",
                        "Gestão de projetos de desenvolvimento, do levantamento de requisitos até a entrega da solução.",
                        List.of("Requisitos", "Kanban")),
                new Projeto("Governança corporativa",
                        "Atuação em PMO e iniciativas de melhoria contínua de processos operacionais.",
                        List.of("PMO", "Processos"))
        );
        model.addAttribute("projetos", projetos);

        
        List<Projeto> projetosAcademicos = List.of(
                new Projeto("Login Seguro",
                        "Sistema de autenticação com Spring Boot, Spring Security e Thymeleaf, com três perfis de acesso e banco MongoDB Atlas.",
                        List.of("Java", "Spring Boot", "Spring Security", "Thymeleaf")),
                new Projeto("To-do list",
                        "Lista de tarefas em HTML, CSS e JavaScript que salva as tarefas no navegador com localStorage.",
                        List.of("HTML", "CSS", "JavaScript")),
                new Projeto("Painel com Bootstrap",
                        "Painel de controle responsivo construído com componentes do Bootstrap.",
                        List.of("HTML", "Bootstrap"))
        );
        model.addAttribute("projetosAcademicos", projetosAcademicos);

        // Contatos
        List<Contato> contatos = List.of(
                new Contato("LinkedIn", "https://www.linkedin.com/in/legferreira/", "/img/linkedin.png"),
                new Contato("GitHub", "https://github.com/legferreira", "/img/github.png")
        );
        model.addAttribute("contatos", contatos);

       
        model.addAttribute("ano", Year.now().getValue());

        return "index";
    }
}
