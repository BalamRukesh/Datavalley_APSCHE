public class OverloadingAndOverriding {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers ---overloaded method
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles ---overloaded method
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadingAndOverriding calc = new OverloadingAndOverriding();

        System.out.println("Sum of 2 and 3 is: " + calc.add(2, 3));
        System.out.println("Sum of 2, 3, and 4 is: " + calc.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5 is: " + calc.add(2.5, 3.5));
    }
}
