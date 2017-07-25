package Algorithms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SilniaLiczbNa extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Suma liczb naturalnych";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.print(SilniaSum(n));

    }

    private int SilniaSum(int n) {
        if (n < 2)
            return 1;
        return n + SilniaSum(n - 1);

    }
}
