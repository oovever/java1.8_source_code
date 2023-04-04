package spi.impl;

import java.util.concurrent.atomic.AtomicInteger;
import spi.Say;
import sun.misc.Unsafe;

/**
 * Created this one by oovever on 2022/8/26.
 */
public class UglySay implements Say {
    @Override
    public void sayHello()  {
        System.out.println("ugle say");
    }
}
