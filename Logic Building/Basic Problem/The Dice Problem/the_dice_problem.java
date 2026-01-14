// Naive Solution TC - O(1) and Space - O(1).
public class the_dice_problem {
    static int diceNumber(int n) {
        int res = 0;
        if(n == 1) {
            res = 6;
        }
        else if(n == 2) {
            res = 5;
        }else if(n == 3) {
            res = 4;
        }else if(n == 4) {
            res = 3;
        }else if(n == 5) {
            res = 2;
        }else {
            res = 1;
        }
        return res;
    }
    public static void main(String args[]) {
        int n = 1;
        int result = diceNumber(n);
        System.out.println(result);
    }
}
