import Algorithms.*;

/**
 * Created by RENT on 2017-07-21.
 */
public class AlgoritmFabric {
    public AbstractAlgoritm getAlgoritm(String name) throws Exception {

        switch (name.toLowerCase()){
            case"test":
                return new Test();
            case"biednycamelcase":
                return new BiednyCamelCase();
            case"sumowanieliczbnaturalnych":
                return new SumowanieLiczbNaturalnych();
            case"sumofnumbers":
                return new SumOfNumbers();
            case"cash":
                return new Cash();
            default:
                    throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
