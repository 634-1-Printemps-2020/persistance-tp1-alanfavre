package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        testCounter();
    }

    private static void testCounter() throws CounterException {
        Counter simpleCounter = new Counter(0);

        if(simpleCounter.getValue() != 0)
        {
            throw new IllegalArgumentException("Test constructor failed");
        }

        simpleCounter = new Counter(0);
        simpleCounter.inc();

        if(simpleCounter.getValue() != 1)
        {
            throw new IllegalArgumentException("Test inc() failed");
        }

        simpleCounter = new Counter(0);
        simpleCounter.add(5);

        if(simpleCounter.getValue() != 5)
        {
            throw new IllegalArgumentException("Test add() failed");
        }
    }
}
