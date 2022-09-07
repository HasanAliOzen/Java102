import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10000; i++) {
            numbers.add(i);
        }


        List<Thread> threads = new ArrayList<>();

        threads.add(new Thread(new EvenOrOdd(numbers.subList(0,2500))));
        threads.add(new Thread(new EvenOrOdd(numbers.subList(2500,5000))));
        threads.add(new Thread(new EvenOrOdd(numbers.subList(5000,7500))));
        threads.add(new Thread(new EvenOrOdd(numbers.subList(7500,10000))));

        threads.get(0).start();
        threads.get(1).start();
        threads.get(2).start();
        threads.get(3).start();

    }
}
