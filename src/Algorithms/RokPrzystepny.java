package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class RokPrzystepny extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Rok Przystępny";
    }

    @Override
    public void runAlgoritm(String[] input) {
        for (int i = 1; i < input.length; i++) {
            int rok = Integer.parseInt(input[i]);
            if ((rok % 4 == 0 && (rok % 100 != 0) || (rok % 400 == 0))) {
                System.out.printf("%d to jest rok przysteny \n", rok);
            } else {
                System.out.printf("%d to nie jest rok przysteny \n", rok);
            }
        }
    }
}
