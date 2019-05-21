package com.comit.learning.BinarySearchTree;

public class Binary {

    public static <T extends Comparable<T>> int searchIndex(T[] inputArray, T valueToSearch) {
        return searchIndex(inputArray, valueToSearch, 0, inputArray.length - 1);
    }

    private static <T extends Comparable<T>> int searchIndex(T[] inputArray, T valueToSearch, int low, int high) {
        if (valueToSearch == null) { return -1; }
        if (low > high) { return -1; }
        int mid = low + (high - low) / 2;

        if (valueToSearch.compareTo(inputArray[mid]) < 0) {
            return searchIndex(inputArray, valueToSearch, low, mid - 1);
        } else if (valueToSearch.compareTo(inputArray[mid]) > 0) {
            return searchIndex(inputArray, valueToSearch, mid + 1, high);
        } else {
            return mid;
        }

    }
}
