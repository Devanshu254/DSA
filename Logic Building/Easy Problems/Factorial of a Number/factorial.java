public class factorial {
    public static int factorial(int n) {
        int ans = 1;
        for(int i=2;i<=n;i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String args[]) {
        int n = 5;
        int result = factorial(n);
        System.out.print(result);
    }
}
