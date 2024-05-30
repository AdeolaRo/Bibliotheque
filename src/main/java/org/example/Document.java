package org.example;

    abstract class Document {
        protected String titre;

        public Document(String titre) {
            this.titre = titre;
        }

        public String getTitre() {
            return titre;}
    }


