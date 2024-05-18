package FunctionalInterface;

import java.util.function.Consumer;

public class MyConsumer {
      static Consumer<String> myConsumer =
              System.out::println;

    public static void main(String[] args) {
        myConsumer.accept("jesus is lord");
    }

}
