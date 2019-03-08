package com.example.vidyut.ModelClass;

public class Schedule {

    private String tittle;
    private String desc;
    private String date;
    private String time ;

    public Schedule(String tittle, String desc, String date, String time) {
        this.tittle = tittle;
        this.desc = desc;
        this.date = date;
        this.time = time;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDesc() {
        return desc;
    }

    public String getDate() {
        return "Date: "+date;
    }

    public String getTime() {
        return "Time: "+time;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
