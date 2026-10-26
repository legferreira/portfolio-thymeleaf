
const topo = document.getElementById("topo");
const menu = document.getElementById("menu");
const menuBotao = document.getElementById("menuBotao");
const voltarTopo = document.getElementById("voltarTopo");
const linksMenu = document.querySelectorAll("nav a");
const secoes = document.querySelectorAll("section");


menuBotao.addEventListener("click", function () {
    menu.classList.toggle("aberto");
});


linksMenu.forEach(function (link) {
    link.addEventListener("click", function () {
        menu.classList.remove("aberto");
    });
});


window.addEventListener("scroll", function () {
    const posicao = window.scrollY;

    topo.classList.toggle("rolando", posicao > 20);
    voltarTopo.classList.toggle("visivel", posicao > 400);

    
    let secaoAtual = "inicio";
    secoes.forEach(function (secao) {
        if (posicao >= secao.offsetTop - 150) {
            secaoAtual = secao.id;
        }
    });

   
    if (window.innerHeight + posicao >= document.body.scrollHeight - 5) {
        secaoAtual = secoes[secoes.length - 1].id;
    }

    linksMenu.forEach(function (link) {
        link.classList.toggle("ativo", link.getAttribute("href") === "#" + secaoAtual);
    });
});


voltarTopo.addEventListener("click", function () {
    window.scrollTo({ top: 0, behavior: "smooth" });
});


const elementosAnimados = document.querySelectorAll(".card, .habilidades li, .contato");

const observador = new IntersectionObserver(function (entradas) {
    entradas.forEach(function (entrada) {
        if (entrada.isIntersecting) {
            entrada.target.classList.add("visivel");
            observador.unobserve(entrada.target);
        }
    });
}, { threshold: 0.15 });

elementosAnimados.forEach(function (elemento) {
    elemento.classList.add("aparecer");
    observador.observe(elemento);
});
