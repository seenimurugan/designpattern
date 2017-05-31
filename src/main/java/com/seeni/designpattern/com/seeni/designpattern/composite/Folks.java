package com.seeni.designpattern.com.seeni.designpattern.composite;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class Folks implements Quackable {
    private List<Quackable> folks = new ArrayList<>();

    @Override
    public void quack() {
        folks.stream()
                .forEach(Quackable::quack);
    }

    @Override
    public void registerObserver(Observer observer) {
        folks.stream()
                .forEach(quackable -> quackable.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {
        folks.stream()
                .forEach(Quackable::notifyObservers);
    }

    public void add(Quackable quackable) {
        this.folks.add(quackable);
    }
}
