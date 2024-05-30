package org.example;

import java.util.ArrayList;
import java.util.List;

class Bibliotheque {
    private List<Adherent> adherents;
    private List<Document> documents;

    public Bibliotheque() {
        this.adherents = new ArrayList<>();
        this.documents = new ArrayList<>();
    }

    public void inscrireAdherent(Adherent adherent) {
        adherents.add(adherent);
    }

    public void desinscrireAdherent(Adherent adherent) {
        adherents.remove(adherent);
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public List<Adherent> getAdherents() {
        return adherents;
    }

    public List<Document> getDocuments() {
        return documents;
    }
}