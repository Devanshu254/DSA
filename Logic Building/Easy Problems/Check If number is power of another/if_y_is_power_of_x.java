import java.util.Scanner;

public class if_y_is_power_of_x {
    public static boolean isPower(int x, int y) {
        if (x == 1) {
            if (y == 1) {
                return true;
            }
            return false;
        }

        int pow = 1;

        while (pow < y) {
            pow = pow * x;
        }

        if (pow == y)
            return true;

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of y: ");
        int y = sc.nextInt();
        boolean result = isPower(x, y);
        System.out.println(result);
    }
}
