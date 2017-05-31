package com.seeni.designpattern.com.seeni.designpattern.observer;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
