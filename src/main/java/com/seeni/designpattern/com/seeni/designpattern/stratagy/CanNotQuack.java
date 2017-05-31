package com.seeni.designpattern.com.seeni.designpattern.stratagy;

import com.seeni.designpattern.com.seeni.designpattern.observer.Observable;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observer;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class CanNotQuack implements Quackable {

    Observable observable;

    public CanNotQuack() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("can not quack...");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
