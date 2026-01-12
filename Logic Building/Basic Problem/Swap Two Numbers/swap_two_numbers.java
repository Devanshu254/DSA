// class swap_two_numbers {
//     public static void main(String[] args) {
//         int a = 2, b = 3;
//         System.out.println("a: "+a+ " b: "+ b);

//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println("a: "+a+" b: "+ b);
//     }
// }

import java.util.*;

class swap_two_numbers {
    List<Integer> get(int a, int b) {
        List<Integer> list = new ArrayList<>();
        
        int temp = a;
        a = b;
        b = temp;

        list.add(a);
        list.add(b);

        return list;
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        swap_two_numbers obj = new swap_two_numbers();
        List<Integer> result = obj.get(a,b);

        System.out.println("A: "+ result.get(0) + " B: "+ result.get(1));
    }
}