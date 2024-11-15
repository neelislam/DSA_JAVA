import java.util.Scanner; // Importing the Scanner class to read input

public class Main {
    public static void main(String[] args) {
        // Initialize the array with given values
        int[] array = {0, 1, 5, 8, 2, 3, 7, 9, 4};

        // Call quickSort method to sort the array
        quickSort(array, 0, array.length - 1);

        // Print the sorted array elements
        for (int i : array) {
            System.out.println(i); // Print each element in the sorted array
        }
    }

    /**
     * This method sorts the array using the quicksort algorithm.
     *
     * @param array The array to be sorted
     * @param start The starting index
     * @param end   The ending index
     */
    private static void quickSort(int[] array, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index, return
        if (end <= start) return;

        // Partition the array and get the pivot index
        int pivot = partition(array, start, end);

        // Recursively sort the left partition
        quickSort(array, start, pivot - 1);

        // Recursively sort the right partition
        quickSort(array, pivot + 1, end);
    }

    /**
     * This method partitions the array and returns the pivot index.
     *
     * @param array The array to be partitioned
     * @param start The starting index
     * @param end   The ending index
     * @return The pivot index
     */
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // Choose the last element as the pivot
        int i = start - 1; // Initialize the index of the smaller element

        // Iterate through the array
        for (int j = start; j <= end - 1; j++) {
            // If the current element is less than the pivot
            if (array[j] < pivot) {
                i++; // Increment the index of the smaller element
                // Swap the elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++; // Increment i to move to the right of the last smaller element
        // Swap the pivot element with the element at i
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; // Return the pivot index
    }
}
