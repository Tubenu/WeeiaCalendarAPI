package com.ppkwu.zad;

public class Calendar {

    private  String day;
    private String eventName;

    public Calendar(String day, String eventName) {
        this.day = day;
        this.eventName = eventName;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getDay() {
        return day;
    }

    public String getEventName() {
        return eventName;
    }


}
