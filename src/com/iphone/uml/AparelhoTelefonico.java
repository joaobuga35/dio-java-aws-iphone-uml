package com.iphone.uml;

public interface AparelhoTelefonico {
    default String ligar() {
        return "Ligando.";
    }

    default String atender() {
        return "Atendendo.";
    }

    default String correioDeVoz() {
        return "Ligando correio de voz.";
    }
}
