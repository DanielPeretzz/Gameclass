package com.homework.daniel;

public class GameDetails {
    public String name;
    public int yearOfPublishing;
    public double price;

    public void print(){
        System.out.println("name is : " +name);
        System.out.println("Year of publishing: " + yearOfPublishing);
        System.out.println("the price is : " + price);
    }
    public void install(){
        System.out.println("The game : "+name+ " is being installed!");
    }
}
