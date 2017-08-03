package Algorithms;


import java.util.Stack;

public class PrzeliczanieSystemow extends AbstractAlgoritm {
    @Override
    public String getName() {
        return " Przeliczanie z systemu 10 na 2 ";
    }

    @Override
    public void runAlgoritm(String[] input) {

//        int n = input.length - 1;

        Stack<Integer> S = new Stack<>();

        int liczba = Integer.parseInt(input[1]);
        int podstawa = Integer.parseInt(input[2]);


        int i = 0;
        while (liczba > 0) {
            S.push(liczba % podstawa);
            liczba = Math.floorDiv(liczba, podstawa);
            i++;
        }
        while (!S.empty()) {
            System.out.println(S.pop());

        }


    }
}
