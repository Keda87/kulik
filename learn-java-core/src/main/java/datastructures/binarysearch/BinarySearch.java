package datastructures.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author adiyatmubarak
 * 
 * Notes:
 * Binary search could be implement if the sequence data
 * already sorted.
 */
public class BinarySearch {
    public static void main(String[] args) throws IOException {
        int[] data = {11,22,33,44,55,66,77,88};
        
        // display array contents
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Data dicari: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int find = Integer.parseInt(br.readLine());
        
        // Binary search.
        int start = 0;
        int end = data.length - 1;
        int mid;
        int position = -1; // -1 means the data not found yet.
        
        while(start <= end) {
            mid = (start + end) / 2;
            if (data[mid] == find) {
                position = mid;
                break;
            } else if (data[mid] < find) {
                start++;
            } else {
                end--;
            }
        }
        
        // Display result.
        if (position == -1) {
            System.out.println("Data tidak ditemukan.");
        } else {
            System.out.println("Data ditemukan di index: " + position);
        }
    }
}
