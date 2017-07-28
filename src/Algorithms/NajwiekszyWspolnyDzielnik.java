package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class NajwiekszyWspolnyDzielnik extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Najwiekszy Wspolny Dzielnik";
    }

    @Override
    public void runAlgoritm(String[] input) {

        // na wejsciu "nwd_8_12"
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        System.out.println(Nwd(k, n));

    }

    private int Nwd(int k, int n) {
        if (k == 0) {
            return n;
        }
        return Nwd(n % k, k);

    }
}