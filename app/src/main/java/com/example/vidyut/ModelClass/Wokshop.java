package com.example.vidyut.ModelClass;

public class Wokshop {

    private String tittle,description,cost,time,date;

    public Wokshop(String tittle, String description, String cost,String time,String date) {
        this.tittle = tittle;
        this.description = description;
        this.cost = cost;
        this.time = time;
        this.date = date;
    }

    public String getTime() {
        return "Time: "+time;
    }

    public String getDate() {
        return "Date: "+date;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getCost() {
        return "₹. "+cost;
    }
}
