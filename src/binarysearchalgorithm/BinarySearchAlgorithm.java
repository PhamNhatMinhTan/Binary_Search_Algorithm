/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchalgorithm;

import java.util.Scanner;

/**
 *
 * @author Minh Tan
 */
public class BinarySearchAlgorithm {

    /**
     * Binary Search Algorithm
     *
     * @param arr
     * @param l
     * @param r
     * @param findValue
     * @return
     */
    public static int binarySearch(int arr[], int l, int r, int findValue) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            //if arr[mid] = findValue, return index
            if (arr[mid] == findValue) {
                return mid;
            }

            //if arr[mid] > findValue, callback binary Search method with left side
            if (arr[mid] > findValue) {
                return binarySearch(arr, l, mid - 1, findValue);
            }

            //Otherwise, if arr[mid] < findValue, callback binary Search method with right side
            return binarySearch(arr, mid + 1, r, findValue);
        }

        // Trong trường hợp không tìm thấy
        //Not found return -1
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Init Scanner object
        Scanner cin = new Scanner(System.in);
        //init array
        //REMEMBER: array MUST BE sorted ascending
        int arr[] = {2, 3, 4, 10, 40};
        //get length of array
        int n = arr.length;
        
        //Enter find value
        System.out.print("Enter value want to search: ");
        int findValue = cin.nextInt();
        
        //do binary search algorithm
        int result = binarySearch(arr, 0, n - 1, findValue);
        
        //Display result
        if (result == -1) {
            System.out.println("Not found " + findValue);
        } else {
            System.out.println(findValue + " found at index "
                    + result);
        }
    }

}
