package FunctionalInterface;

import java.util.function.BinaryOperator;

public class MyBinaryOperator {
static BinaryOperator<Integer> operator =  (value1, value2)-> value1+=value2;

    public static void main(String[] args) {
        System.out.println(operator.apply(2, 3));
    }
}
