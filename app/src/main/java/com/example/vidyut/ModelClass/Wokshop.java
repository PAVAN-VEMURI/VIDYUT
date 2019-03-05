package com.example.vidyut.ModelClass;

public class Wokshop {

    private String tittle;
    private String description;
    private String cost;

    public Wokshop(String tittle, String description, String cost) {
        this.tittle = tittle;
        this.description = description;
        this.cost = cost;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getCost() {
        return cost;
    }
}
