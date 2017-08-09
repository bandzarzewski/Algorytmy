package Algorithms;


public class Nww extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Najwikesza wspólna wielkrotnosc ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        // Najwiekszy wspolny dzielnik
        int a1 = Integer.parseInt(input[1]);
        int a2 = Integer.parseInt(input[2]);

        System.out.println("Nwd: " + Nwd(a1, a2));
//        int nwd = Nwd(a1, a2);

        System.out.println("Nww: " + Nww(a1, a2));

    }

    private int Nwd(int a1, int a2) {
        if (a1 == 0) {
            return a2;
        }
        return Nwd(a2 % a1, a1);
    }

    private int Nww(int a1, int a2) {
        if (a1 == 0 && a2 == 0) {
            return -1;
        }
        return (a1 * a2) / Nwd(a1, a2);

    }
}
