public class check_even_or_odd {
    // public static boolean isEven(int n) {
    // int rem = n % 2;
    // if (rem == 0) {
    // return true;
    // } else {
    // return false;
    // }
    // }

    // Best Case Scenario - The last bit of all odd numbers is always 1, while for
    // even numbers it’s 0. So, when performing bitwise AND operation with 1, odd
    // numbers give 1, and even numbers give 0.

    public static boolean isEven(int n) {
        if ((n & 1) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 12;
        if (isEven(n) == true) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}