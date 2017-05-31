package com.seeni.designpattern.com.seeni.designpattern.factory;

import com.seeni.designpattern.com.seeni.designpattern.adaptor.GooseQuackableAdapter;
import com.seeni.designpattern.com.seeni.designpattern.decorator.QuackDecorator;
import com.seeni.designpattern.com.seeni.designpattern.modal.*;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.*;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class DuckCountableFactoryImpl implements DuckFactory {
    public Duck createRealDuck() {
        Quackable quackable = new QuackDecorator(new CanQuack());
        Duck realDuck = new RealDuck();
        realDuck.setFlyable(new CanFly());
        realDuck.setQuackable(quackable);
        return realDuck;
    }

    public Duck createWoodenDuck() {
        Quackable quackable = new QuackDecorator(new CanNotQuack());
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.setFlyable(new CanNotFly());
        woodenDuck.setQuackable(quackable);
        return woodenDuck;
    }

    public Quackable createGooseAdapterDuck() {
        return new QuackDecorator(new GooseQuackableAdapter(new Goose()));
    }
}
