package com.seeni.designpattern.com.seeni.designpattern.factory;

import com.seeni.designpattern.com.seeni.designpattern.adaptor.GooseQuackableAdapter;
import com.seeni.designpattern.com.seeni.designpattern.modal.*;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.*;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public class DuckFactoryImpl implements DuckFactory {
    public Duck createRealDuck() {
        Duck realDuck = new RealDuck();
        realDuck.setFlyable(new CanFly());
        realDuck.setQuackable(new CanQuack());
        return realDuck;
    }

    public Duck createWoodenDuck() {
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.setFlyable(new CanNotFly());
        woodenDuck.setQuackable(new CanNotQuack());
        return woodenDuck;
    }

    public Quackable createGooseAdapterDuck() {
        return new GooseQuackableAdapter(new Goose());
    }
}
