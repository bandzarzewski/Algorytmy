package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Sortowanie przez zliczanie";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = input.length - 2; // Dlugosc tablicy
        int max = Integer.parseInt(input[1]) + 1;
        int[] tabSparsowanycWejscia = new int[n];

        for (int i = 0; i < input.length - 2; i++) {
            tabSparsowanycWejscia[i] = Integer.parseInt(input[i + 2]);
        }
        int[] tabPomocnicza = new int[max];

        for (int i = 0; i < tabSparsowanycWejscia.length; i++) {
            int liczba = tabSparsowanycWejscia[i];
            tabPomocnicza[liczba]++;//odwolujemy sie
        }
        for (int indeksTablicy = 0; indeksTablicy < tabPomocnicza.length; indeksTablicy++) {
            for (int ileLiczb = tabPomocnicza[indeksTablicy]; ileLiczb > 0; ileLiczb--) {
                System.out.printf("%d", indeksTablicy);
            }
        }
//        for (int i = 0; i < tabPomocnicza.length; i++) {
//            System.out.print(tabPomocnicza[i]);
//
//    }
    }

}
