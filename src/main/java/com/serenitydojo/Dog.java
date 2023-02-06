package com.serenitydojo;

public class Dog {
    private String name;
    private String favoriteToy;
    private Integer age;

    //Parameterized Constructor
    public Dog(String name, String favoriteToy, Integer age){
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public String getFavoriteToy(){
        return this.favoriteToy;
    }

    public Integer getAge(){
        return this.age;
    }
}
