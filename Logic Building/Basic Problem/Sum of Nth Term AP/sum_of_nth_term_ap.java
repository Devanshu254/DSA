public class sum_of_nth_term_ap {
    static int nthTermOfAP(int a1, int a2, int n) {
        return a1+(n-1)*(a2-a1);
    }
    public static void main(String args[]) {
        int a1 = 2, a2 = 3;
        int n = 4;
        int result = nthTermOfAP(a1, a2, n);
        System.out.print(result);
    }
}
