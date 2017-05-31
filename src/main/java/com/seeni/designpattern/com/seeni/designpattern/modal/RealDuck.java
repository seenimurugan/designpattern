package com.seeni.designpattern.com.seeni.designpattern.modal;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.CanFly;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.CanQuack;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class RealDuck extends Duck {

    public RealDuck() {
        this.setFlyable(new CanFly());
        this.setQuackable(new CanQuack());
    }

    public void display() {
        System.out.println("RealDuck display...");
    }
}
