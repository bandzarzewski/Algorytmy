import Algorithms.AbstractAlgoritm;

public class Main {

    public static void main(String[] args) throws Exception {
        String algotrithmName = args[0];

        AlgoritmFabric factory = new AlgoritmFabric();
        AbstractAlgoritm algorithm = factory.getAlgoritm(algotrithmName);
        System.out.println("Wykonujemy algorytm: " + algorithm.getName());
        algorithm.runAlgoritm(args);
    }
}
