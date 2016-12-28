package com.jorge.dev.models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jorge on 27/12/16.
 */
public class Publisher {

    @Id
    private String id;
    private String name;
    private String surname;
    private String genre;
    private List<Territory> territories = new ArrayList<>();

    public Publisher() {
    }

    public Publisher(String name, String surname, String genre, List<Territory> territories) {
        this.name = name;
        this.surname = surname;
        this.genre = genre;
        this.territories = territories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Territory> getTerritories() {
        return territories;
    }

    public void setTerritories(List<Territory> territories) {
        this.territories = territories;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}