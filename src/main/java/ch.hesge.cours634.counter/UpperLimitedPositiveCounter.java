package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private int max;

    public UpperLimitedPositiveCounter(int value, int max)
    {
        super(value);
        this.max = max;
    }

    @Override
    public void inc() throws CounterException
    {
        checkMax(1);

        super.inc();
    }

    @Override
    public void add(int step) throws CounterException
    {
        checkMax(step);
        checkPositive(step);

        super.add(step);
    }

    @Override
    public String toString()
    {
        return "Valeur : " + getValue() + " | Maximum : " + this.max;
    }

    private void checkMax(int step) throws CounterException
    {
        if(getValue() + step > this.max)
        {
            throw new CounterException("Valeur maximale atteinte.");
        }
    }

    private void checkPositive(int step) throws CounterException
    {
        if(getValue() + step < 0)
        {
            throw new CounterException("Le compteur ne peut pas être négatif.");
        }
    }
}
