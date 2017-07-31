package Algorithms;

/**
 * Created by RENT on 2017-07-31.
 */
public class AlgorytmWyszukiwanieMaxMinWartosci extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "AlgorytmWyszukiwanieMaxMinWartosci";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = input.length - 1;
        int[] values = new int[n];

        int max = 0;
        int min = 0;

        for (int i = 0; i < values.length; i++) {
            values[i] = Integer.parseInt(input[i + 1]);
            if (values[i] > values[max]) {
                max = i;


            }
            if (values[i] < values[min]) {
                min = i;

            }

        }
        System.out.println(min + " " + values[min]);
        System.out.println(max + " " + values[max]);
    }
}
