import Algorithms.AbstractAlgoritm;
import Algorithms.BiednyCamelCase;
import Algorithms.Test;
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
                default:
                    throw new Exception("Nie ma takiego algorytmu");
        }
    }
}
