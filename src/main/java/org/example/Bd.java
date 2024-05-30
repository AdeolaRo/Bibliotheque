package org.example;

class BD extends Volume {
    private String dessinateur;

    public BD(String titre, String auteur, String dessinateur) {
        super(titre, auteur);
        this.dessinateur = dessinateur;
    }

    public String getDessinateur() {
        return dessinateur;
    }
}