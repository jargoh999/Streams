package FunctionalInterface;


import java.util.function.ObjDoubleConsumer;

public class MyObjDoubleConsumer {
    static ObjDoubleConsumer<Transaction> myObjDoubleConsumer=(myTract,value)-> System.out.println(myTract.getAmount()+value);

    public static void main(String[] args) {
        myObjDoubleConsumer.accept(new Transaction(), 100.90);
    }
}
