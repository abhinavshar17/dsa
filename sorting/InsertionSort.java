package sorting;

public class InsertionSort {
    public static void sort(int arr[]) {
        for(int i = 1; i < arr.length; i++) { // Corrected loop condition
            int current = arr[i]; // Store the value
            int pre = i - 1;

            // Finding the correct position to insert
            while(pre >= 0 && arr[pre] > current) {
                arr[pre + 1] = arr[pre]; // Shift elements
                pre--;
            }
            // Insertion
            arr[pre + 1] = current;
        }
    }

    public static void print(int arr[]) { // Renamed method
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { // Main function
        int arr[] = {10, 80, 50, 20};
        sort(arr);
        print(arr); // Print sorted array
    }
}
