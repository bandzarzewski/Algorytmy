package Algorithms;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumOfNumbers extends AbstractAlgoritm{
    @Override
    public String getName() {
        return "Suma of numbers";
    }

    @Override
    public void runAlgoritm(String[] input) {
        // int n=Integer.parseInt(input[1]);
        int sum = 0;
        for (int i = 1; i <input.length ; i++) {
            sum = sum+Integer.parseInt(input[i]);
            System.out.println(sum);

        }
    }

}
