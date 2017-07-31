package Algorithms;

import java.util.Random;

/**
 * Created by RENT on 2017-07-31.
 */
public class Tablice extends AbstractAlgoritm {


    @Override
    public String getName() {
        return "tablice";
    }

    @Override
    public void runAlgoritm(String[] input) {
        Random mRand = new Random(12);

        int[] tab = new int[10];
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = mRand.nextInt();
            System.out.printf("%d ", tab[i]);
        }

        System.out.println();
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length - 1; i++) {
            tab1[i] = i * 2;
//            tab[i] % 2 == 0;
            System.out.printf("%d ", tab1[i]);

        }
        System.out.println();

        int[] tab2 = new int[10];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i * 2 + 1;
            System.out.printf("%d ", tab2[i]);
        }

        System.out.println();
        int[] tab3 = new int[10];
        for (int i = 0, j = 0; i < tab3.length; i++, j = j + 2) {
            tab3[i] = j;
            System.out.printf("%d ", tab3[i]);

        }


    }
}

//        if (tab[i]%2 == 0){
//            tab2[poz]=tab[i];
//            tab[i] =poz++;


