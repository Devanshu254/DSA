public class check_even_or_odd {
    public static boolean isEven(int n) {
        int rem = n % 2;
        if (rem == 0) {
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