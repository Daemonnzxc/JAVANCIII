import java.util.*;
import java.util.function.*;

public class Tasksheet124 {

    static List<Integer> filteredNumbers(List<Integer> numbers,Predicate<Integer> condition){
        List<Integer> result= new ArrayList<>();
            for(int nums:numbers){
                if(condition.test(nums))
                result.add(nums);
            }
            return result; 
        }


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        Predicate<Integer> isPositive = nums -> nums > 0;
        Predicate<Integer> isEven = nums -> nums % 2==0;
        Predicate<Integer> isGreaterThanTen = nums -> nums >= 10;
        
        System.out.println("Original List: " + numbers);
        System.out.println("Positive Numbers: " + filteredNumbers(numbers, isPositive));
        System.out.println("Even Numbers: " + filteredNumbers(numbers, isEven));
        System.out.println("Numbers Greater Than 10: " + filteredNumbers(numbers, isGreaterThanTen));

    }
}
