package FunctionalInterface;

import java.util.function.BiPredicate;

public class MyBiPredicate {
   static BiPredicate<String,Integer> myPredicate = (name,lengthOfTheName)-> name.length()==lengthOfTheName;

    public static void main(String[] args) {
        System.out.println(myPredicate.test("marvy", 5));
    }
}
