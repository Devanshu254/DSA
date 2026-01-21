// import java.util.Scanner;

// public class factorial {
//     public static int Factorial(int n) {
//         int ans = 1;
//         for(int i=2;i<=n;i++){
//             ans = ans * i;
//         }
//         return ans;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N: ");
//         int n = sc.nextInt();
//         int result = Factorial(n);
//         System.out.print("The result is: "+result);
//     }
// }

import java.util.Scanner;

public class factorial {
    public static int Factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int result = Factorial(n);
        System.out.print(result);
    }
}
