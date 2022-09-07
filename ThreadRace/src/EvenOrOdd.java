import java.util.ArrayList;
import java.util.List;

public class EvenOrOdd implements Runnable{
    public static final List<Integer> EVEN_NUMS =new ArrayList<>();
    public static final List<Integer> ODD_NUMS =new ArrayList<>();
    private List<Integer> numbers;
    private static Object LOCK = new Object();

    public EvenOrOdd(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int evenCounter = 0;
        int oddCounter = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0){
                EvenOrOdd.EVEN_NUMS.add(number);
                evenCounter++;
            }
            if (number % 2 == 1){
                EvenOrOdd.ODD_NUMS.add(number);
                oddCounter++;
            }
        }

        synchronized (LOCK){
            System.out.println(Thread.currentThread().getName() + " Even numbers = " + evenCounter);
            System.out.println(Thread.currentThread().getName() +" Odd numbers = " + oddCounter);
        }


    }

}
