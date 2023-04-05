package org.example.oop.Cw2.Ex2;

import java.util.*;

/**
 * 1. Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из очереди, принятие/отдача заказа
 * 2. Интерфейс MarketBehaviour, который описывает логику магазина – приход/уход покупателей, обновление состояния магазина
 * 3. Класс Market, который реализовывает два вышеуказанных интерфейса и хранит в списке список людей в очереди в различных статусах
 */
public class Market implements QueueBehaviour, MarketBehaviour {
    List<Actor> myList = new ArrayList<>();
    Queue<Actor> myQueue = new LinkedList<>();
    @Override
    public void acceptToMarket(Human human) {
      myList.add(human);
    }

    @Override
    public void releaseFromMarket(Human human) {
    myList.remove(human);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human human) {
    myQueue.add(human);
    }

    @Override
    public void takeOrder() {
    myQueue.peek().setTakeOrder();
    }

    @Override
    public void giveOrder() {
        myQueue.peek().setMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        myQueue.poll();
    }




}
