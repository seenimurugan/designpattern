package com.seeni.designpattern.com.seeni.designpattern.modal;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Flyable;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class Duck {
    private Quackable quackable;
    private Flyable flyable;

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void swim() {
        System.out.println("Duck Swimming...");
    }

    public void display() {
        System.out.println("Duck display...");
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

}
