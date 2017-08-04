package PowtorzenieWiadomosci4_08;

import Algorithms.AbstractAlgoritm;

import java.util.Stack;

/**
 * Created by RENT on 2017-08-04.
 */
public class Zad4Stos_Arraylist extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Stos/arraylist palindrom ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        Stack<Integer> s = new Stack<>();

        for (int i = 1; i < input.length; i++) {
            s.add(Integer.parseInt(input[i]));


        }
    }
}
