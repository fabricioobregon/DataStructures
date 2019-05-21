package com.comit.learning;

import com.comit.learning.BinarySearchTree.Binary;

public class Main {

    public static void main(String[] args) {
        Character[] chars = {'a','b','c','d','e'};
        Integer[] ints = {34,42,52,67,78,99};

        int found = Binary.searchIndex(ints, 67);
        System.out.println(found);
    }
}
