package com.example.booking_app_authentication;

import androidx.annotation.NonNull;

public class studios {
    String name;
    String location;
    String Activity1;
    String Activity2;
    String rating;

    public studios(){

    }

    @Override
    public String toString() {
        return "Studios{" +
                "Name='"+name+'\''+
                ",Location='"+location+'\''+
                ",Activity 1='"+Activity1+'\''+
                ",Activity 2='"+Activity2+'\''+
                ",Rating='"+rating+'\''+
                '}';
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
    public void setLocation(String location){
        this.location=location;
    }

    public String getActivity1() {
        return Activity1;
    }
    public void setActivity1(String Activity1){
        this.Activity1= Activity1;
    }

    public String getActivity2() {
        return Activity2;
    }
    public void setActivity2(String Activity2){
        this.Activity2=Activity2;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating){
        this.rating=rating;
    }
}
