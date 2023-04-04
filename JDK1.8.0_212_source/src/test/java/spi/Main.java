package spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created this one by oovever on 2022/8/26.
 */
public class Main {

    public static void main(String[] args) {
        ServiceLoader<Say> sayServiceLoader = ServiceLoader.load(Say.class);
        Iterator<Say> iterator = sayServiceLoader.iterator();
        while (iterator.hasNext()) {
            Say say = iterator.next();
            say.sayHello();
        }
    }
}
