package org.example.oop.Cw2.Ex2;
/**
 * 1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
 * 2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ и факт получения заказа.
 * Дополнение: для большего понимания у студентов, можно сделать методы-геттеры для имени и прочих “персональных данных” abstract
 * 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavior
 */
public abstract class Actor implements ActorBehaviour{
    protected String name;
    protected boolean makeOrder;
    protected boolean takeOrder;

    public boolean isMakeOrder() {
        return makeOrder;
    }
    public boolean isTakeOrder() {
        return takeOrder;
    }
    public abstract String getName();

}
