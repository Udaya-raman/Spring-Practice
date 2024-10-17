package com.example.demo;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class WeatherRecord {
//    private String city;
//    private String condition;
//
//    public WeatherRecord(){
//
//    }
//
//    public void intialize(String city, String condition){
//        this.city = city;
//        this.condition = condition;
//    }
//
//    public String getCity(){
//        return city;
//    }
//
//    public String getCondition(){
//        return condition;
//    }
//    public void setCity(String city){
//        this.city = city;
//    }
//    public void setCondition(String condition){
//        this.condition = condition;
//    }
//}

import jakarta.persistence.*;

@Entity
@Table(name="weather_records")
public class WeatherRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String city;
    @Column(nullable = false)
    private int temperature;
    @Column(nullable = false)
    private String condition;

    public WeatherRecord(){

    }

    public void intialize(String city, int temperature){
        this.city = city;
        this.temperature = temperature;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getCity(){
        return city;
    }

    public String getCondition(){
        return condition;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
