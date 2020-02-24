package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest
{

    @Test
    public void inc() throws CounterException
    {
        Counter c = new Counter(0);
        c.inc();
        assertEquals(1, c.getValue());
    }

    @Test
    public void add()
    {
    }

    @Test
    public void getValue()
    {
    }
}