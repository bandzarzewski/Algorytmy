package Algorithms;


public class Silnia extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Liczenie silni";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = Integer.parseInt(input[1]);
        System.out.print(Silnia(n));
    }

    private int Silnia(int n) {
        if (n < 2)
            return 1; // to jest potrzebne
        return n * Silnia(n - 1);

    }
}
