package FunctionalInterface;

import java.util.function.ToIntBiFunction;

public class MyToIntBiFunction {

    static ToIntBiFunction<String, Integer> myToIntFunction = (value,value1)-> value.length()+value1;

    public static void main(String[] args) {
        System.out.println(myToIntFunction.applyAsInt("value", 5));
    }
}
