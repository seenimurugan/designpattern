package com.seeni.designpattern;

import com.seeni.designpattern.com.seeni.designpattern.decorator.QuackDecorator;
import com.seeni.designpattern.com.seeni.designpattern.factory.DuckCountableFactoryImpl;
import com.seeni.designpattern.com.seeni.designpattern.factory.DuckFactory;
import com.seeni.designpattern.com.seeni.designpattern.factory.DuckFactoryImpl;
import com.seeni.designpattern.com.seeni.designpattern.composite.Folks;
import com.seeni.designpattern.com.seeni.designpattern.observer.Observer;
import com.seeni.designpattern.com.seeni.designpattern.observer.Quackologist;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        DuckFactory duckFactory = new DuckFactoryImpl();
        DuckFactory duckCountableFactory = new DuckCountableFactoryImpl();

        Folks folks = new Folks();
        Folks countableFolks = new Folks();

        folks.add(duckFactory.createWoodenDuck().getQuackable());
        folks.add(duckFactory.createRealDuck().getQuackable());
        folks.add(duckFactory.createGooseAdapterDuck());

        countableFolks.add(duckCountableFactory.createWoodenDuck().getQuackable());
        countableFolks.add(duckCountableFactory.createRealDuck().getQuackable());
        countableFolks.add(duckCountableFactory.createGooseAdapterDuck());

        Observer quackologist = new Quackologist();
        folks.registerObserver(quackologist);
        countableFolks.registerObserver(quackologist);

        Main main = new Main();

        main.simulate(folks);
        main.simulate(countableFolks);

        System.out.println("total quacks: " + QuackDecorator.getCount());
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
