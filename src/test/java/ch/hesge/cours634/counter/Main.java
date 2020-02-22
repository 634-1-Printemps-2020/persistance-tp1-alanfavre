package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) {

        Counter simpleCounter = new Counter(0);
        UpperLimitedPositiveCounter advancedCounter = new UpperLimitedPositiveCounter(0, 7);

        System.out.println("Valeur compteur simple : " + simpleCounter.getValue());
        System.out.println("Valeur compteur avancé : " + advancedCounter.getValue());

        System.out.println("Incrémentation normale ...");
        try
        {
            simpleCounter.inc();
            advancedCounter.inc();
        }
        catch (CounterException e)
        {
            e.printStackTrace();
        }

        System.out.println("Valeur compteur simple : " + simpleCounter.getValue());
        System.out.println("Valeur compteur avancé : " + advancedCounter.getValue());

        System.out.println("Incémentation de 5 avec step()");
        try
        {
            simpleCounter.add(5);
            advancedCounter.add(5);
        }
        catch (CounterException e)
        {
            e.printStackTrace();
        }

        System.out.println("Valeur compteur simple : " + simpleCounter.getValue());
        System.out.println("Valeur compteur avancé : " + advancedCounter.getValue());

        System.out.println("Déclenchement des exceptions ...");
        try
        {
            advancedCounter.add(9);
            simpleCounter.add(-5);
        }
        catch (CounterException e)
        {
            e.printStackTrace();
        }
    }
}
