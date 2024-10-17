package com.example.demo.libraryapp.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private int year;

    public Book(String id,String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year= year;
        this.id=id;
    }
    //getters and settters
    public String getId() {
        return id;
    }
    /**
     * @param id
     */
    public void setId(String id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}