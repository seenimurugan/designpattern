package com.seeni.designpattern.com.seeni.designpattern.adaptor;

import com.seeni.designpattern.com.seeni.designpattern.modal.Goose;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observable;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observer;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class GooseQuackableAdapter implements Quackable {
    private Goose goose;
    Observable observable;

    public GooseQuackableAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.horn();
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
