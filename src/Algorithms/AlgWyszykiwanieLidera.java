package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class AlgWyszykiwanieLidera extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Alg Wyszykiwanie Lidera";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = input.length - 1;
        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[1] = Integer.parseInt(input[i + 1]);

            int[] tab1 = new int[n + 1];
            // teraz musimy to dopisać zliczanie 

        }

    }
}
