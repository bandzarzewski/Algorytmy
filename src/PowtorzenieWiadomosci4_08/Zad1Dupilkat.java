package PowtorzenieWiadomosci4_08;

import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-08-04.
 */
public class Zad1Dupilkat extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Zad 1 Duplikat ";
    }

    @Override
    public void runAlgoritm(String[] input) {
        // wejscie "134457"
        int n = input.length - 1;
        int[] tab = new int[n];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    System.out.printf("%d, indeksy: %d %d", tab[i], i, j);
                    return;
                }
            }
        }
        System.out.println(" Nie ma duplikatu");


    }
}