package com.seeni.designpattern.com.seeni.designpattern.stratagy;

import com.seeni.designpattern.com.seeni.designpattern.observer.QuackObservable;

/**
 * Created by SShanmugam on 29/05/2017.
 */
public interface Quackable extends QuackObservable {
    void quack();
}
