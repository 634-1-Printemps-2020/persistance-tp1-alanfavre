package ch.hesge.cours634.counter;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest
{

    @Test (expected = CounterException.class)
    public void inc() throws CounterException
    {
        UpperLimitedPositiveCounter ulpc = new UpperLimitedPositiveCounter(0, 10);
        ulpc.add(15);
    }

    @Test
    public void add()
    {
    }
}