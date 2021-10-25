package org.example.grokking.chapter1;

public class BinarySearch {
    public static void main(String[] args) {
        int[] my_list = new int[]{1, 3, 5, 7, 9};

        System.out.println(binary_search(my_list, 3)); // 1
        System.out.println(binary_search(my_list, 9)); // 4
        System.out.println(binary_search(my_list, -1));//-1
    }

    public static int binary_search(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
