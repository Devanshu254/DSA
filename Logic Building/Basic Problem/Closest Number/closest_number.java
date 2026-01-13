public class closest_number {
    static int closestNumber(int n, int m) {
        // Find the range.
        int closest = 0;
        int min_distance = Integer.MAX_VALUE;
        for(int i=n-Math.abs(m); i<n+Math.abs(m);i++) {
            if(i%m == 0) {
                int dis = Math.abs(n-i);
                if(dis < min_distance || dis == min_distance && Math.abs(i) > Math.abs(closest)) {
                    closest = i;
                    min_distance = dis;
                }
            }
        }
        // return condition.
        return closest;
    }
    public static void main(String[] args) {
        int n = -15;
        int m = 6;
        int result = closestNumber(n,m);
        System.out.println(result);
    }
}
