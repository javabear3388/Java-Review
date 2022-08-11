package task3;

import java.util.Comparator;
import java.util.Optional;

public class TransactionTest {

    public static void main(String[] args) {

        System.out.println("1 - Find all transactions in 2011 and sort by value");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2- What are all the unique cities where the traders work");
        TransactionData.getAll().stream()
                .map(transaction ->transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);

        System.out.println("3- Find all traders from Cambridge and sort them by name");
        TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("4- Return a String of all trader's names sorted alphabetically");
        String result = TransactionData.getAll().stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("",(a ,b)-> a+b+" ");
        System.out.println(result);


        System.out.println("5- Are any traders based in Milan?");
        boolean milanBased = TransactionData.getAll().stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);

        System.out.println("6- Print the values of all transactions from the traders living in Cambridge");
        TransactionData.getAll().stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("7 - What is the highest value of all the transactions");
        Optional<Integer> max =TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(max.get());

        System.out.println("8-Find the transaction with the smallest value");
        Optional<Transaction> smallest = TransactionData.getAll().stream()
//                .map(Transaction::getValue)
                .reduce((t1, t2) -> t1.getValue()< t2.getValue() ? t1 : t2);
        System.out.println(smallest.get());

        Optional<Transaction> smallest2 = TransactionData.getAll().stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(smallest2.get());

    }

}
