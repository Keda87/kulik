package datastructures.bubblesort;

/**
 *
 * @author adiyatmubarak
 */
public class BubbleSort {
    public static void main(String[] args) {
        int data[] = {2,5,12,6,8,45,88,43,26}; // unordered data.
        
        // Display data before sorting.
        System.out.println("Before sorting: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println("");
        
        // Bubble sorting
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
        
        // Display data after sorting.
        System.out.println("After sorting: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println("");
    }
}
