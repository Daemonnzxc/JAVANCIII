
import java.util.*;
public class Tasksheet117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        int[] numbers = {num1, num2, num3};
        Arrays.sort(numbers);
        
        if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
            System.out.println("All numbers are equal.");
        } else {
            System.out.println("The largest number is: " + numbers[2]);
        }
        scanner.close();
    }
}
