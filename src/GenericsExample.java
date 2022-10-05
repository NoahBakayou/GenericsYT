import java.util.ArrayList;

//https://www.youtube.com/watch?v=K1iu1kXkVoA&t=38s
// Finished @ 9:38. He says some good stuff at 9:00 mins if you want a review.

public class GenericsExample {

    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(33.5);
        doublePrinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        Cat myCat = (Cat)cats.get(0);
        //generics solve type safety issues ie if its a double but defined as int.
        //having a specific type for each class helps us know which type we're using
    }
}
