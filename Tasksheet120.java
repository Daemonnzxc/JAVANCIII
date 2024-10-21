public class Tasksheet120 {

    static int cumulatedSum(int... numbers){
        int totalSum = 0;
        for (int number: numbers) {
            int cumulatedSum= 0;

            for (int j = 1; j <= number; j++) {
                cumulatedSum +=j;
            }

            System.out.println("Cumulative sum for " + number + " is: " + cumulatedSum);
            totalSum += cumulatedSum;
                    }
        return totalSum;
    }

    public static void main(String[] args) {
        int subTotal = cumulatedSum(4, 5 ,10);
        System.out.println("Total sum of cumulative sums is: " + subTotal);
    }

}
