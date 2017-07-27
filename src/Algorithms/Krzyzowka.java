package Algorithms;

/**
 * Created by RENT on 2017-07-27.
 */
public class Krzyzowka extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Krzyzowka";
    }

    private String[] literki = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I"};

    @Override
    public void runAlgoritm(String[] input) {

        int liczba = Integer.parseInt(input[1]);
        if (Math.sqrt(liczba) % 1 == 0) {

            int x = (int) Math.sqrt(liczba);
            String[][] tab = new String[x][x];
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    tab[i][j] = literki[i] + (j + 1);
                }
            }
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab.length; j++) {
                    System.out.printf("%s ", tab[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.print("Koniec");
        }
    }
}
