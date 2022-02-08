package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer = new Programmer("Mark", "Programmer", "Facebook");
        System.out.println(programmer.toString());
        programmer.coding();

    Dancer dancer = new Dancer("Atai","Dancer","Kara Jorgo");
        System.out.println(dancer.toString());
        dancer.dancing();

    Singer singer = new Singer("Justin Bieber","Singer","X-band");
        System.out.println(singer.toString());
        singer.singing();
        singer.playing();






    }
}
