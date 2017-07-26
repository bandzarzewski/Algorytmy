import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-25.
 */
public class SzyfrCezara extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Algorytm Cezara ";
    }

    @Override
    public void runAlgoritm(String[] input) {


        for (int i = 1; i < input.length; i++) {
            String slowo = input[i].toLowerCase();
            char[] tabLiterkiWSlowie = slowo.toCharArray();
            for (int j = 0; j < tabLiterkiWSlowie.length; j++) { // TA PETLA PRZECHODZI PO WSZYSTKICH SLOWACH

                int position = GetLetterPosition(Character.toString(tabLiterkiWSlowie[j])); // POZYCJA KAZDEJ LITERKI
                int move = (position + 3) % literki.length;
                System.out.printf("%s", literki[move]);
            }
        }
    }

    String[] literki = new String[]{"a", "b", "c", "d", "f", "g", "h", "i"};

    private int GetLetterPosition(String letter) {
        for (int i = 0; i < literki.length; i++) {
            if (literki[i].equals(letter)) {
                return i; // TU ZWRACAMY DOKLADNA POZYJCE LITERKI np. 0,1,2...
            }
        }
        return -1;
    }
}
