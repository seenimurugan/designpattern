package com.seeni.designpattern.com.seeni.designpattern.observer;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackable quackable) {
        System.out.println(quackable.getClass().getSimpleName() + " quacked...");
    }
}
