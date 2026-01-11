import java.util.*;

public class sum_of_naturals {
    public static int sumOfNaturals(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide input: ");
        int n = sc.nextInt();
        sc.close();
        int res = sumOfNaturals(n);
        System.out.println(res);
    }
}
