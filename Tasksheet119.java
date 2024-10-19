import java.util.*;

class ArithmeticOperations {
    private ArrayList<Integer> numbers;

    public ArithmeticOperations(int num1, int num2) {
        numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
    }
    public int add() {
        return numbers.get(0) + numbers.get(1);
    }

    public int subtract() {
        return numbers.get(0) - numbers.get(1);
    }

    public int multiply() {
        return numbers.get(0) * numbers.get(1);
    }

    public float divide() {
        if (numbers.get(1) != 0) {
            return (float) numbers.get(0) / numbers.get(1);
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }
}

public class Tasksheet119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        ArithmeticOperations operations = new ArithmeticOperations(num1, num2);

        System.out.println("Addition: " + operations.add());
        System.out.println("Subtraction: " + operations.subtract());
        System.out.println("Multiplication: " + operations.multiply());
        System.out.println("Division: " + operations.divide());

        scanner.close();
    }
}
