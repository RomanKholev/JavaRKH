package org.example.oop.Cw2.Ex2;


public class Main {
    public static void main (String [] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrder();
        mac.giveOrder();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);

    }
}
