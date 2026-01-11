public class sum_of_naturals {
    public static int sumOfNaturals(int n) {
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        int n = 5;
        int res = sumOfNaturals(n);
        System.out.println(res);
    }
}
