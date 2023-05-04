package ZZ;

import java.util.List;
import java.util.function.Consumer;
public class A {


    public static void main(String[] args) {
        Consumer<Integer> printIt = System.out::print;
        List.of(1,2,3,4).forEach(printIt);
    }
}

