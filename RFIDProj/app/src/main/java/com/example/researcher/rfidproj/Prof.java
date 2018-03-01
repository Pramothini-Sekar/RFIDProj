package com.example.researcher.rfidproj;

/**
 * Created by researcher on 1/3/18.
 */
public class Prof {
    private String name;
    private String location;
    private String time;
   // private String date;

    public Prof(String name, String location, String time)
    {
        this.setName(name);
        this.setLocation(location);
        this.setTime(time);
    //  this.setDate(date);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
/*
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    */



}