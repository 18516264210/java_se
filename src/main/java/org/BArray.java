package org;

public class BArray {

    protected static int[] arr = {22, 34, 3, 32, 82, 55, 89, 50, 37, 5, 64, 35, 9, 70};


    public static void swap(int[] sortArray, int index1, int index2) {
        int temp = sortArray[index1];
        sortArray[index1] = sortArray[index2];
        sortArray[index2] = temp;
    }
}
