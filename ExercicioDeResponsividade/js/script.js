let menu = document.getElementById("menu_links");
let menu_barras =document.getElementById("menu_barras");
//O padrão CamelCase é uma convenção de escrita que consiste em formar palavras compostas ou frases sem espaços, onde cada palavra ou parte da palavra começa com uma letra maiúscula, exceto a primeira palavra. Isso geralmente é usado em programação, nomenclatura de variáveis, nomes de funções, classes, métodos e até mesmo em nomes de arquivos.

function mostrarMenu(){
    if (window.getComputedStyle(menu).display =="none")
    //pega o style que esta apartado no element menu display
    {
     menu.style.display = "flex"
     menu_barras.setAttribute("aria-label", "fechar menu");//"fechar menu
     menu_barras.setAttribute(aria-expanded, "true");//"
    }else{
        menu.style.display = "none"
        menu_barras.setAttribute("aria-label","abrir menu")//"abrir menu
        menu_barras.setAttribute("aria-expanded","false")
    }
    //funcao q pega menu bar you say hello  and i say godbye

}
