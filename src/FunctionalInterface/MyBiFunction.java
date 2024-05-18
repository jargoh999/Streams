package FunctionalInterface;

import javax.swing.*;
import java.util.function.BiFunction;

public class MyBiFunction {

    static BiFunction<String,Integer,Boolean> myBiFunction = (sentence,length)-> sentence.length()==length;

    public static void main(String[] args) {
        System.out.println(myBiFunction.apply("marv", 4));
    }
}
