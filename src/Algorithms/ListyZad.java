package Algorithms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class ListyZad extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Listy Zad ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        ArrayList<String> listaKolorow = new ArrayList<String>();
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("zolty");
        listaKolorow.add("fioletowy");

        //System.out.println(listaKolorow.size());

        listaKolorow.add(0, "rozowy");
        listaKolorow.add(listaKolorow.size(), "zielony");
        for (String element : listaKolorow) {
            System.out.println(element);
        }


    }

}



