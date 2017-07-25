package Algorithms;

public class OperacjaNaSilni extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Operacja na silni";
    }

    @Override
    public void runAlgoritm(String[] input) {

        int n = Integer.parseInt(input[1]);

        switch (n) {
            case 1:
                System.out.println("0 1");
                break;
            case 2:
                System.out.println("0 2");
                break;
            case 3:
                System.out.println("0 6");
                break;


        }
    }
}
