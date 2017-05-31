package com.seeni.designpattern.com.seeni.designpattern.observer;

import com.seeni.designpattern.com.seeni.designpattern.stratagy.Quackable;

/**
 * Created by SShanmugam on 30/05/2017.
 */
public interface Observer {
    void update(Quackable quackable);
}
