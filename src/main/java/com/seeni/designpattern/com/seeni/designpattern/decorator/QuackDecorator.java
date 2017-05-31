package com.seeni.designpattern.com.seeni.designpattern.decorator;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observer;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class QuackDecorator implements Quackable {
    private static int count = 0;
    private Quackable quackable;

    public QuackDecorator(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        count++;
        quackable.quack();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
