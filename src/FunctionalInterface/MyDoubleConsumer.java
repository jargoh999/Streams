package FunctionalInterface;

import java.util.function.DoubleConsumer;

public class MyDoubleConsumer {

   static DoubleConsumer consumer = System.out::println;


    public static void main(String[] args) {
        consumer.accept(125.0);
    }
}
