package com.iphone.uml;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    private String model;
    private String color;
    private int Year;

    public Iphone(String model , String color , int year) {
        this.model = model;
        this.color = color;
        Year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public static void main(String[] args) {
        Iphone newIphone = new Iphone("XR", "RED", 2017);
    }
}
