package com.iphone.uml;

public interface NavegadorInternet {
    default String exibirPagina() {
        return "Exibindo pagina.";
    }

    default String adicionarNovaAba() {
        return "Adicionando nova aba.";
    }

    default String atualizarPagina() {
        return "Atualizando pagina.";
    }
}
