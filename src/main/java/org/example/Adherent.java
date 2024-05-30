package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Adherent {

    private String prenom;
    private String nom;
    private List<Livre> livresEmpruntes;

    public Adherent(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.livresEmpruntes = new ArrayList<>();
    }

    public void emprunterLivre(Livre livre) {
        if (livresEmpruntes.size() < 3 && livre.getEmpruntePar() == null) {
            livresEmpruntes.add(livre);
            livre.setEmpruntePar(this);
        } else {
            System.out.println("Impossible d'emprunter plus de 3 livres ou le livre est déjà emprunté.");
        }
    }

    public void restituerLivre(Livre livre) {
        if (livresEmpruntes.remove(livre)) {
            livre.setEmpruntePar(null);
        } else {
            System.out.println("Ce livre n'est pas emprunté par cet adhérent.");
        }
    }

    public void prolongerDateRestitution(Livre livre, Date nouvelleDate) {
        if (livresEmpruntes.contains(livre)) {
            livre.setDateRestitution(nouvelleDate);
        } else {
            System.out.println("Ce livre n'est pas emprunté par cet adhérent.");
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }
}
