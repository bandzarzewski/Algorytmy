package Algorithms;

/**
 * Created by RENT on 2017-07-26.
 */
public class AlgorytmBabelkowy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Algorytm Babelkowy";
    }

    @Override
    public void runAlgoritm(String[] input) {


        int[] tab = new int[input.length - 1];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = Integer.parseInt(input[i + 1]);
        }
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int temp;
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.printf(tab[i] + "");
        }


    }
}