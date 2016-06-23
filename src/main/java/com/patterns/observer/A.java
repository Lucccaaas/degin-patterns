package com.patterns.observer;

import lombok.Data;

import java.util.Observable;

/**
 * Created by yunge on 16/6/22.
 */
@Data
public class A extends Observable {
    String name;
    int price;
    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers(name);
    }
    public void setPrice(int price) {
        this.price = price;
        setChanged();
        notifyObservers(price);
    }

    public static void main(String[] args) {
        A a = new A();
        NameObserver no = new NameObserver();
        PriceObserver po = new PriceObserver();
        NameObserver no1 = new NameObserver();
        PriceObserver po1 = new PriceObserver();
        //add Observer
        a.addObserver(no);
        a.addObserver(po);
        a.setName("first");
        a.setPrice(100);
        //remove Observer
        a.deleteObservers();
        a.addObserver(no1);
        a.addObserver(po1);
        a.setName("second");
        a.setPrice(200);
    }
}
