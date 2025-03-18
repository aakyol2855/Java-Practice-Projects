/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.infixpostfix;

public class BinarySearch {
       // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Element found, return its index
            } else if (array[mid] < target) {
                left = mid + 1; // Discard the left half
            } else {
                right = mid - 1; // Discard the right half
            }
        }
        return -1; // Element not found in the array
    }
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 4, 6, 7, 9, 12, 15, 18, 21};
        int targetElement = 7;

        int index = binarySearch(sortedArray, targetElement);

        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index: " + index);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
    }

 
}