package com.seeni.designpattern.com.seeni.designpattern.observer;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    Quackable quackable;

    public Observable(Quackable quackable) {
        this.quackable = quackable;
    }
    @Override
    public void registerObserver(Observer observer) {
//        System.out.println("registerObserver called..." + observers.size());
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
//        System.out.println("notifyObservers called..." + observers.size());
        observers.stream()
                .forEach(observer -> observer.update(quackable));
    }
}
