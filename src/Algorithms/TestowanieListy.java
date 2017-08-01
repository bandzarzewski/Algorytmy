package Algorithms;

import Struktury.mList;

/**
 * Created by RENT on 2017-08-01.
 */
public class TestowanieListy extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Testowanie listy ";
    }

    @Override
    public void runAlgoritm(String[] input) {
        mList lista = new mList();

        lista.addElementAtBegining(14, lista);
        lista.addElementAtBegining(25, lista);
        lista.addElementBeforeElement(45, 14, lista);
        lista.printAllElements(lista);


    }
}
