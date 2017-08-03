package Algorithms;


import java.util.Stack;

public class OdwrotnaNotacjaPolska extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "Odwrotna notacja polska";
    }

    @Override
    public void runAlgoritm(String[] input) {

        Stack<Integer> s = new Stack<>();
        int a = 0;
        int b = 0;
        for (int i = 1; i < input.length; i++) {

            switch (input[i]) {
                case "R":
                    System.out.println(s.pop());
                    break;
                case "D":
                    a = s.pop();
                    b = s.pop();
                    s.push(a + b);
                    break;
                case "O":
                    a = s.pop();
                    b = s.pop();
                    s.push(a - b);
                    break;
                case "I":
                    a = s.pop();
                    b = s.pop();
                    s.push(a / b);
                    break;
                case "M":
                    a = s.pop();
                    b = s.pop();
                    s.push(a * b);
                    break;
                default:
                    s.push(Integer.parseInt(input[i]));

            }
        }
    }
}
