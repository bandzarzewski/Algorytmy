package Algorithms;

/**
 * Created by RENT on 2017-07-28.
 */
public class GeneratorPlanszyWarcaby extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Generator Planszy Warcaby ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        // Wejscie: "Warcaby_4_5_C"

        int x = Integer.parseInt(input[1]);
        int y = Integer.parseInt(input[2]);
        String color = input[3];

        int licznik;
        if (color.equals("C")) {
            licznik = 0;
        } else {
            licznik = 1;
        }

        String[][] tab = new String[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (i == 0 && j == 0)
                    tab[i][j] = color;
                else if (j == 0) {
                    if (tab[j - 1][j].equals("B")) {
                        tab[i][j] = "C";
                        licznik = 0;
                    } else {
                        tab[i][j] = "B";
                        licznik = 1;
                    }
                } else {
                    if (licznik % 2 == 0) {
                        tab[i][j] = "C";

                    } else
                        tab[i][j] = "B";

                    licznik++;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("%s", tab[i][j]);
            }
            System.out.println();
        }
    }
}
