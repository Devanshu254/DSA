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
        int x = 2;
        int y = 30;
        boolean result = isPower(x, y);
        System.out.println(result);
    }
}
