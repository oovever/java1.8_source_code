package spi.impl;

import spi.Say;

/**
 * Created this one by oovever on 2022/8/26.
 */
public class CoolSay implements Say {

    @Override
    public void sayHello() {
        System.out.println("cool say");
    }
}
