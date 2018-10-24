package com.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Awards {

    private Integer nominations;
    private Integer wins;
    private String text;

    public Integer getNominations() {
        return nominations;
    }

    public void setNominations(Integer nominations) {
        this.nominations = nominations;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
