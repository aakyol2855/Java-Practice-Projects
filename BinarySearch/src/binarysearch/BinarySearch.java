package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static int bSearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] args) {
        int[] nArr = {1, 3, 4, 5, 6, 7, 8, 9, 10, 22, 31}; 
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the element to search:");
        int key = s.nextInt();
        
        int result = bSearch(nArr, key);
        
        if (result != -1) {
            System.out.println("Element found at index " + (result+1));
        }
    }
}
