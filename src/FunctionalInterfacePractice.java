
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;


public class FunctionalInterfacePractice {

    public static void main(String[] args) {
        Comparator<Transaction> comparator = Comparator.comparing(Transaction::getAmount);

        Set<Transaction> transactions = new TreeSet<>(comparator);
        transactions.addAll(List.of(new Transaction(1,"ayo",200.0,TransactionType.DEBIT, LocalDate.now()),
                new Transaction(1,"ayo",200.1,TransactionType.DEBIT, LocalDate.now()),
                        new Transaction(1,"ayo",200.2,TransactionType.DEBIT, LocalDate.now()),
                                new Transaction(1,"ayo",200.3,TransactionType.DEBIT, LocalDate.now())));
        System.out.println(transactions);


        Supplier<Integer> supplier = ()-> new Random().nextInt();
        System.out.println(supplier.get());

//        Stream.generate(supplier)
//                .forEach(System.out::println);

        Function<String,Integer> function= String::length;
        System.out.println(function.apply("ayo"));

        BiConsumer<String,Integer> biConsumer = (s,i)-> System.out.println(s.repeat(i));
        biConsumer.accept("dayo", 2);

        BiFunction<String,Integer,Boolean> biFunction = (word,number)-> word.length()==number;
        System.out.println(biFunction.apply("ayo",3));


        BiPredicate<Integer,Integer> biPredicate = (firstNumber,secondNumber)-> firstNumber>secondNumber;
        System.out.println(biPredicate.test(200, 100));
    }




}
