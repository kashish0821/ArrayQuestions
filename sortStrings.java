import java.util.Arrays;

public class StringSorter {
    public static void main(String[] args) {
        String[] array = {"banana", "apple", "grape", "orange"};
        
        System.out.println("Before sorting: " + Arrays.toString(array));
        
        // Sort the array
        Arrays.sort(array);
        
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}


