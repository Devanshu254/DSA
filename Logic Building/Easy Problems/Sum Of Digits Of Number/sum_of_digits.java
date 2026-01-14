public class sum_of_digits {
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n!=0) {
            int last_digit = n%10;
            sum = sum + last_digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]) {
        int n = 657;
        int result = sumOfDigits(n);
        System.out.print(result);
    }
}
