public class sum_of_digits_recursive_approach {
    static int sumOfDigits(int n) {
        if(n==0) return 0;
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String args[]) {
        int n = 12345;
        int result = sumOfDigits(n);
        System.out.println(result);
    }
}
