import java.util.Scanner;

public class dis_between_two_points {
    public static int disTwoPoints(int x1, int y1, int x2, int y2) {
        return (int) Math.round(
            Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))
        );
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the value of y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the value of x2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the value of y2: ");
        int y2 = sc.nextInt();
        int distance = disTwoPoints(x1, y1, x2, y2);
        System.out.print("The distance is: "+ distance);
    }
}
