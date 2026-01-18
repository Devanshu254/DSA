public class valid_triangle {
    public static boolean validTriange(int a, int b, int c) {
        if((a+b)>c && (b+c)>a && (c+a)>b) {
            return true;
        }
        return false;
    }
    public static void main(String args[]) {
        int a = 7;
        int b = 10;
        int c = 5;
        boolean result = validTriange(a,b,c);
        System.out.print(result);
    }
}
