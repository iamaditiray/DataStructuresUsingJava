package com.aditi;

public class MergeSort {
    public static void divide(int[] arr, int startingIndex, int endingIndex) {
        if (startingIndex >= endingIndex) {
            return;
        }
        int midIndex = (startingIndex + endingIndex) / 2;
        divide(arr, startingIndex, midIndex);
        divide(arr, midIndex + 1, endingIndex);
        conquer(arr, startingIndex, midIndex, endingIndex);
    }

    public static void conquer(int[] arr, int startingIndex, int midIndex, int endingIndex) {
        int[] merged = new int[endingIndex - startingIndex + 1];
        int leftIndex = startingIndex;
        int rightIndex = midIndex + 1;
        int indexOfMerged = 0;

        while (leftIndex <= midIndex && rightIndex <= endingIndex) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                merged[indexOfMerged++] = arr[leftIndex++];
            } else {
                merged[indexOfMerged++] = arr[rightIndex++];
            }
        }

        while (leftIndex <= midIndex) {
            merged[indexOfMerged++] = arr[leftIndex++];
        }
        while (rightIndex <= endingIndex) {
            merged[indexOfMerged++] = arr[rightIndex++];
        }

        for (int i = 0, j = startingIndex; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int index = arr.length;
        divide(arr, 0, index - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
