package com.example.home_work_image_and_rec;

public class App {
    private String name;
    private String underName;
    private String num;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnderName() {
        return underName;
    }

    public void setUnderName(String underName) {
        this.underName = underName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public App(String name, String underName, String num, String time) {
        this.name = name;
        this.underName = underName;
        this.num = num;
        this.time = time;
    }
}
