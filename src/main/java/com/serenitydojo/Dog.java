package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteFood;
    private Integer age;

    //Parameterized Constructor
    public Dog(String name, String favoriteFood, Integer age){
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getFavoriteFood(){
        return this.favoriteFood;
    }

    public Integer getAge(){
        return this.age;
    }
}
