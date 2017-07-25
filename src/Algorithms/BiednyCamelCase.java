package Algorithms;

/**
 * Created by RENT on 2017-07-21.
 */
public class BiednyCamelCase extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgoritm(String[] input) {

        System.out.println("Biedny Camel Case");


        int l = 0;
        for (int i = 1; i < input.length; i++) {

            String word = input[i];
            char[] Tab = word.toCharArray();

            for (int j = 0; j < Tab.length; j++) {
                if (l % 2 == 0) {

                    System.out.print(Character.toString(Tab[j]).toUpperCase());
                } else {
                    System.out.print(Character.toString(Tab[j]).toLowerCase());
                }
                l++;
            }
        }

    }
}
