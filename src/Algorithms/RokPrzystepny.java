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
        int d1 = Integer.parseInt(input[1]);

        //int[] rok=new int[]{input[]};
        int rok = 2006;
        if ((rok % 4 == 0 && !(rok % 100 == 0) || (rok % 400 == 0))) {
            System.out.printf("TAK");
        } else {
            System.out.printf("NIE");
        }
    }
}
