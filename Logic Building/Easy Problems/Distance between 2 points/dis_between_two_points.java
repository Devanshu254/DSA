public class dis_between_two_points {
    public static int disTwoPoints(int x1, int y1, int x2, int y2) {
        return (int) Math.round(
            Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2))
        );
    }
    public static void main(String args[]) {
        int x1 = 0, x2 = 0;
        int y1 = 2, y2 = -2;
        int distance = disTwoPoints(x1, y1, x2, y2);
        System.out.print("The distance is: "+ distance);
    }
}
