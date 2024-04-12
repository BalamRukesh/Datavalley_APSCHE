public class SumDivisibleBy5And2 {

    public static void main(String[] args) {
        int[] numbers = { 100, 52, 43, 99, 42, 40, 91 };
        int sum = 0;

        // Iterate through the array and add elements divisible by both 5 and 2 
        for (int num : numbers) {
            if (num % 10 == 0) { // Check divisibility by 10 (both 5 and 2 are factors of 10)
                sum += num;
            }
        }

        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
}
