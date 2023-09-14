package com.iphone.uml;

public interface ReprodutorMusical {

     default String tocar() {
        return "Tocando Música.";
    }

    default String pausar() {
         return "Pausando música.";
    }

    default String selecionarMusica() {
        return "Selecionando musica.";
    }
}
