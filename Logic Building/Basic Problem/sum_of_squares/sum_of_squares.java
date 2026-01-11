import java.util.Scanner;

class sum_of_squares {
    public static int sumOfSquares(int n) {
        int sum = 0;

        for(int i=1;i<=n;i++) {
            sum = sum + (i*i);
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();
        sc.close();
        int result = sumOfSquares(n);
        System.out.print(result);
    }    
}
