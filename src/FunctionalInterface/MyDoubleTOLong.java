package FunctionalInterface;

import java.util.function.DoubleToLongFunction;

public class MyDoubleTOLong {
    static DoubleToLongFunction myFunction = (value)-> (long) value;
    public static void main(String[] args) {
        System.out.println(myFunction.applyAsLong(450.89));
    }
}
