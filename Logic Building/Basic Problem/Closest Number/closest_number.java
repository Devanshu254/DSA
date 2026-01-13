import java.util.Scanner;

public class closest_number {
    static int closestNumber(int n, int m) {
        // Find the range.
        int closest = 0;
        int min_distance = Integer.MAX_VALUE;
        for (int i = n - Math.abs(m); i < n + Math.abs(m); i++) {
            if (i % m == 0) {
                int dis = Math.abs(n - i);
                if (dis < min_distance || dis == min_distance && Math.abs(i) > Math.abs(closest)) {
                    closest = i;
                    min_distance = dis;
                }
            }
        }
        // return condition.
        return closest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m: ");
        int m = sc.nextInt();
        int result = closestNumber(n, m);
        System.out.println("The closest number is: " + result);
    }
}
