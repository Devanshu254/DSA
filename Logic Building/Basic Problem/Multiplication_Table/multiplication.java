// class multiplication {
//     void printTable(int n) {
//         for(int i=1;i<=10;i++) {
//             System.out.println(n +"*"+ i + "=" + n*i);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         multiplication m = new multiplication();
//         m.printTable(n);
//     }
// }


// If we are not following OOP then we can simply make the method static, so that other methods can directly call it. Otherwise we will have to create an object.
// class multiplication {
//     public static void printTable(int n) {
//         for(int i=1;i<=10;i++) {
//             System.out.println(n +"*"+ i + "=" + n*i);
//         }
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printTable(n);
//     }
// }

// Printing the solution using ArrayList. Collection framework in java concept.
import java.util.ArrayList;

class multiplication {
    public ArrayList<Integer> multiplicationTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++) {
            list.add(n*i);
        }

        return list;
    }
    public static void main(String[] args) {
        int n=6;

        multiplication obj = new multiplication();
        ArrayList<Integer> result = obj.multiplicationTable(n);

        System.out.println(result);
    }
}