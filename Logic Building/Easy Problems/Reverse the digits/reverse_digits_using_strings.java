public class reverse_digits_using_strings {
    static int reverseDigits(int n) {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
        n = Integer.parseInt(String.valueOf(s));
        return n;
    }
    public static void main(String[] args) {
        int n = 1245;
        int result = reverseDigits(n);
        System.out.print(result);
    }
}
