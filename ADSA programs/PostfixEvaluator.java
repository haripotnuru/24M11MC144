import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    public static double evaluatePostfix(String exp) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = exp.split("\\s+"); // Split by spaces

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) { // Check if it's a number (integer or decimal)
                stack.push(Double.parseDouble(token));
            } 
            else if (token.matches("[+\\-*/^]")) { // Check if it's an operator
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid Expression: Not enough operands.");
                }

                double op2 = stack.pop();
                double op1 = stack.pop();
                double result = 0;

                switch (token) {
                    case "+": result = op1 + op2; break;
                    case "-": result = op1 - op2; break;
                    case "*": result = op1 * op2; break;
                    case "/": 
                        if (op2 == 0) {
                            throw new ArithmeticException("Error: Division by zero");
                        }
                        result = op1 / op2;
                        break;
                    case "^": result = Math.pow(op1, op2); break;
                    default:
                        throw new IllegalArgumentException("Invalid Operator: " + token);
                }

                stack.push(result);
            } 
            else {
                throw new IllegalArgumentException("Invalid character in expression: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid Expression: Extra operands left.");
        }

        return stack.pop(); // Final result
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the postfix expression (space-separated): ");
        String exp = scanner.nextLine(); // Read full line

        try {
            double result = evaluatePostfix(exp);
            System.out.println("The value of the expression is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
