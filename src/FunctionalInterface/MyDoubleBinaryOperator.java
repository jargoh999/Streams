package FunctionalInterface;

import java.util.function.DoubleBinaryOperator;

public class MyDoubleBinaryOperator {
    static DoubleBinaryOperator doubleBinaryOperator = (value1,value2)-> value1+=value2;


    public static void main(String[] args) {
        System.out.println(doubleBinaryOperator.applyAsDouble(123.000, 134.0001));
    }

}
