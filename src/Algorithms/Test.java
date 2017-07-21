package Algorithms;

import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public class Test extends AbstractAlgoritm {

    public Test(){
        System.out.println("Konstruktor Test");
    }

    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public void runAlgoritm(String[] input) {
        System.out.println("To jest algorytm testowy");
    }
}
