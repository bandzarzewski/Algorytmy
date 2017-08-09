package Algorithms;


import java.util.Stack;

public class nwd extends AbstractAlgoritm {
    @Override
    public String getName() {
        return "nwd ";
    }

    @Override
    public void runAlgoritm(String[] input) {

        // tworzymy stos
        Stack<String> stack = new Stack<>();

        String myInput = " a + b * c = ";
        // zmieniamy to na liste
        String[] myInputArr = myInput.split(" "); // met. split dzieli stringi
        String helper = "";
        for (String element : myInputArr) { // bierzemy konkretny element i nie mozemy go edytować
            switch (element) {
                case "=":
                    while (!stack.empty()) {
                        System.out.printf("%s ", stack.pop());
                    }
                    break;
                case "(":
                    stack.push(element);
                    break;
                case ")":
                    helper = stack.pop();
                    while (!helper.equals("(")) ;//peek - m. podejrzyj ale nie sciagaj ze stosu
                {
                    System.out.printf("%s ", helper);
                    helper = stack.pop();
                }
                break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "^":
                    while (!stack.empty()) {
                        if (GetOperatorPriority(element) == 3 || GetOperatorPriority(element) >= GetOperatorPriority(stack.peek())) {
                            break;
                        } else {
                            System.out.printf("%s", stack.pop());
                        }

                    }
                    stack.push(element);
                    break;
                default:
                    System.out.printf("%s ", stack.pop());
                    break;
            }
        }
    }

    public int GetOperatorPriority(String operator) { // wazanosc operatorow
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            case "^":
                return 3;
            default:
                return -1;
        }
    }
}
