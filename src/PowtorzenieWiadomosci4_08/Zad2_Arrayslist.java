package PowtorzenieWiadomosci4_08;

import Algorithms.AbstractAlgoritm;

import java.util.ArrayList;
import java.util.List;

public class Zad2_Arrayslist extends AbstractAlgoritm {

    @Override
    public String getName() {
        return "Zad 2 Arraylist";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int toDelete = Integer.parseInt(input[1]);

        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 2; i < input.length; i++) {
            lista.add(Integer.parseInt(input[i]));

        }
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i) == toDelete) {
                lista.remove(i);
                i = 0;
            }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista);
            return;
        }

    }
}
