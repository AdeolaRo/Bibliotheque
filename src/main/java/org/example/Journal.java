package org.example;

import java.util.Date;

class Journal extends Document {
    private Date dateParution;

    public Journal(String titre, Date dateParution) {
        super(titre);
        this.dateParution = dateParution;
    }

    public Date getDateParution() {
        return dateParution;
    }
}