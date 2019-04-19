package com.indecis.tableauBord.models;

public class Report {

    private String course_number;
    private String course_duration;
    private String course_co2;
    private String course_km;
    private String course_price;

    public Report(){}

    public Report(String course_number, String course_duration, String course_co2, String course_km, String course_price) {
        this.course_number = course_number;
        this.course_duration = course_duration;
        this.course_co2 = course_co2;
        this.course_km = course_km;
        this.course_price = course_price;
    }

    public String getCourse_number() {
        return course_number;
    }

    public void setCourse_number(String course_number) {
        this.course_number = course_number;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_co2() {
        return course_co2;
    }

    public void setCourse_co2(String course_co2) {
        this.course_co2 = course_co2;
    }

    public String getCourse_km() {
        return course_km;
    }

    public void setCourse_km(String course_km) {
        this.course_km = course_km;
    }

    public String getCourse_price() {
        return course_price;
    }

    public void setCourse_price(String course_price) {
        this.course_price = course_price;
    }

    @Override
    public String toString() {
        return "Report{" +
                "course_number='" + course_number + '\'' +
                ", course_duration='" + course_duration + '\'' +
                ", course_co2='" + course_co2 + '\'' +
                ", course_km='" + course_km + '\'' +
                ", course_price='" + course_price + '\'' +
                '}';
    }
}
