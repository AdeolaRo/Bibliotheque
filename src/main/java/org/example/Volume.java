package org.example;

abstract class Volume extends Document {
    protected String auteur;

    public Volume(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
    }

    public String getAuteur() {
        return auteur;
    }
}