package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Boat boat = new Boat("SSG321");
        boat.moveTo("West Seattle");
    }
}