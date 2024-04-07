import java.util.Arrays;

public class IntegerSorter {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 9};
        
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        // Sort the array
        Arrays.sort(array);
        
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
