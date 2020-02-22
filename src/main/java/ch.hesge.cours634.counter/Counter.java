package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int value = 0;

    public Counter()
    {
        this.value = 0;
    }

    public Counter(int value)
    {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException
    {
        this.value++;
    }

    @Override
    public void add(int step) throws CounterException
    {
        if(step < 0)
        {
            throw new CounterException("La valeur doit être plus grande que 0.");
        }
        else
        {
            this.value += step;
        }
    }

    @Override
    public int getValue()
    {
        return this.value;
    }
}
