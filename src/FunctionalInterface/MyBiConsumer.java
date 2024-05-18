package FunctionalInterface;

import java.util.function.BiConsumer;

public class MyBiConsumer {
static BiConsumer<String , Integer> myBiConsumer = (firstParameter, secondParameter) -> System.out.println(firstParameter + " " + secondParameter);
    public static void main(String[] args) {
        myBiConsumer.accept("marvy is now ", 29);
    }
}

