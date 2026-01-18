import java.util.Scanner;

public class valid_triangle {
    public static boolean validTriange(int a, int b, int c) {
        if((a+b)>c && (b+c)>a && (c+a)>b) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();
        boolean result = validTriange(a,b,c);
        System.out.print(result);
    }
}
