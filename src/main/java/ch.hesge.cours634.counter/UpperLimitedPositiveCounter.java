package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int value = 0;
    private int maxStep = 0;

    public UpperLimitedPositiveCounter(int value, int maxStep)
    {
        this.value = value;
        this.maxStep = maxStep;
    }

    @Override
    public void add(int step) throws CounterException
    {
        if (step < 0 || step > this.maxStep)
        {
            throw new CounterException("La valeur doit être comprise entre 0 et " + this.maxStep);
        }
        else
        {
            this.value += step;
        }
    }

    @Override
    public void inc() throws CounterException
    {
        this.value++;
    }

    @Override
    public int getValue()
    {
        return this.value;
    }
}
