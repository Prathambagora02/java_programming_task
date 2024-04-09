import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 3, 4, 5};
        int[] output = removeDuplicates(input);
        
        System.out.print("Output: ");
        for (int num : output) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}