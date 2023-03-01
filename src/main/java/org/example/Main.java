package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2};
        RemoveDuplicateInArray(arr);

    }


    public static void RemoveDuplicateInArray(int arr[]) {
        // convert array to set to remove duplicates

        Set<Integer> set = new HashSet<>();
        for (int b : arr) {
            set.add(b);
        }
        //convert set back to array
        int[] result = new int[set.size()];
        int i=0;
        for (int c:set) {
            result[i++] = c;
        }
        // print the result
        System.out.println(Arrays.toString(result));
    }
}
