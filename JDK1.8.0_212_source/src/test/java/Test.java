import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;

/**
 * Created this one by oovever on 2022/8/25.
 */
public class Test {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.getAndIncrement();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
    }
}
