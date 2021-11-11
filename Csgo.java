package com.homework.daniel;

public class Csgo {
    public static void main(String[] args) {
    GameDetails csgo = new GameDetails();
    csgo.name = "Counter-Strike: Global Offensive";
    csgo.price = 15.00;
    csgo.yearOfPublishing = 2012;
    csgo.print();
    csgo.install();
    }
}
