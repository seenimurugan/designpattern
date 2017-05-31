package com.seeni.designpattern.com.seeni.designpattern.modal;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.CanNotFly;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.CanNotQuack;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class WoodenDuck extends Duck {

    public WoodenDuck() {
        this.setQuackable(new CanNotQuack());
        this.setFlyable(new CanNotFly());
    }

    public void display() {
        System.out.println("WoodenDuck display...");
    }

}
