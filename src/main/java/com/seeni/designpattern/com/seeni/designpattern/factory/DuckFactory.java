package com.seeni.designpattern.com.seeni.designpattern.factory;

import com.seeni.designpattern.com.seeni.designpattern.modal.Duck;
import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public interface DuckFactory {
    Duck createRealDuck();
    Duck createWoodenDuck();
    Quackable createGooseAdapterDuck();
}
