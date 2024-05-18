package FunctionalInterface;

import java.util.function.BooleanSupplier;

public class MyBooleanSupplier {

    static BooleanSupplier booleanSupplier=()-> true;

    public static void main(String[] args) {
        System.out.println(booleanSupplier.getAsBoolean());
    }
}
