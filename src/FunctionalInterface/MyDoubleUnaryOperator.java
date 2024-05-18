package FunctionalInterface;

import java.util.function.DoubleUnaryOperator;

public class MyDoubleUnaryOperator {

    static DoubleUnaryOperator myOperator = (value)-> value+=1;

    public static void main(String[] args) {
        System.out.println(myOperator.applyAsDouble(120.5));
    }
}
