public class reverse_digits {
    static int reverseDigits(int n) {
        int rev = 0;
        while(n!=0) {
            int last_digit = n%10;
            rev = rev * 10 + last_digit;
            n = n/10;
        }
        return rev;
    }
    public static void main(String args[]) {
        int n = 12345;
        int result = reverseDigits(n);
        System.out.print(result);
    }
}
