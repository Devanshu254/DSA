package Arrays.Largest_Element_01;

public class largest_element {
    static int largestElement(int[] arr, int n) {
        int largest = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}

// Brute force solution -> we can sort the array and then the last element will be the one which 
// will be largest. O(nlogn)
