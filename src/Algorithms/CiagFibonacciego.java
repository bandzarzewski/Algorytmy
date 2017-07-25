package Algorithms;

public class CiagFibonacciego extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Ciag Fibonacciego";
    }

    @Override
    public void runAlgoritm(String[] input) {
        int n = Integer.parseInt(input[1]);

        System.out.print(Fib(n));
    }

    private int Fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return Fib(n - 1) + Fib(n - 2);
    }
}

