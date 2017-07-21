package com.lewis.springboot.sample;

/**
 * Created by zcy on 2017/7/20.
 */
public class CollectionNote {

    private int id;

    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public CollectionNote(int id, int money) {
        this.id = id;
        this.money = money;
    }

    @Override
    public String toString() {
        return "CollectionNote{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
