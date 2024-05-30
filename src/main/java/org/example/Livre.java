package org.example;

import java.util.Date;

class Livre extends Volume {
    private Adherent empruntePar;
    private Date dateRestitution;

    public Livre(String titre, String auteur) {
        super(titre, auteur);
        this.empruntePar = null;
        this.dateRestitution = null;
    }

    public Adherent getEmpruntePar() {
        return empruntePar;
    }

    public void setEmpruntePar(Adherent empruntePar) {
        this.empruntePar = empruntePar;
    }

    public Date getDateRestitution() {
        return dateRestitution;
    }

    public void setDateRestitution(Date dateRestitution) {
        this.dateRestitution = dateRestitution;
    }
}