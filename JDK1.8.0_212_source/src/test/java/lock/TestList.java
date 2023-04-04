package lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created this one by oovever on 2022/11/15.
 */
public class TestList {

  public static void main(String[] args) {
    List<Integer> a = IntStream.rangeClosed(1, 500).boxed().collect(Collectors.toList());
//    List<Integer> b = new ArrayList<>(10000);
//    a.parallelStream().forEach(b::add);
//    System.out.println(b);

    System.out.println("--------");
    for (int i = 0; i < 100; i++) {
      List<Integer> c = new ArrayList<>(100);
      a.parallelStream().forEach(c::add);
      if (c.contains(null)) {
        System.out.println(c);
        System.out.println(i);
      }
    }

  }
}
