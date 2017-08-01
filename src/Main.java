import Algorithms.AbstractAlgoritm;

/**
 * Created by RENT on 2017-07-21.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        String algorithmName = args[0];

//        for (int i = 0; i < args.length ; i++) {
//                System.out.println(args[i]);}

        AlgoritmFabric fabric = new AlgoritmFabric();
        AbstractAlgoritm algoritm =
                fabric.getAlgoritm(algorithmName);

        System.out.println("Wykonujemy algorytm" + algoritm.getName());

        algoritm.runAlgoritm(args);

    }
}
