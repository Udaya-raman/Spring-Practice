package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class WeatherService {
    private final WeatherRepository weatherRepositry;
    @Autowired
    public WeatherService(WeatherRepository weatherRepositry){
        this.weatherRepositry = weatherRepositry;
    }

    public List<WeatherRecord> getAllWeather(){
        return weatherRepositry.findAll();
    }

    public WeatherRecord getWeatherByCity(String city){
        return weatherRepositry.findByCity(city).orElseThrow(() -> new RuntimeException("City not found"));
    }

    public WeatherRecord addWeather(WeatherRecord weatherRecord){
        return weatherRepositry.save(weatherRecord);
    }
    public void deleteWeather(Long id){
        weatherRepositry.deleteById(id);
    }
    public WeatherRecord updateWeather(WeatherRecord weatherRecord){
        return weatherRepositry.save(weatherRecord);
    }

}
