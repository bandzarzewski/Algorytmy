package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class Dominanta extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Diminanta";
    }

    @Override
    public void runAlgoritm(String[] input) {

        // wejście - tablica int.

        int n = input.length - 1; //  wielkosc tab.
        int[] T = new int[n];
        int max = 0;

        for (int i = 0; i < T.length; i++) {
            T[i] = Integer.parseInt(input[i + 1]);
            if (T[i] > max) {
                max = T[i];
            }
        }
        int[] L = new int[max + 1];
        // int[] W = new int[max + 1];


        for (int j = 0; j < T.length; j++) {
            int licznik = T[j];
            L[licznik]++;
        }

        int wynik = 0;
        for (int j = 0; j < L.length; j++) {
            if (L[j] > L[wynik]) {
                wynik = j;
            }

        }
        System.out.printf("%d %d", wynik, L[wynik]);

    }

}
