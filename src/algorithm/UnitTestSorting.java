package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for the soring algorithm

        // Insertion Sort
        sort.insertionSort(unSortedArray);
        System.out.println("Array After Insertion Sort");
        for (int i : unSortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bubble Sort
        sort.bubbleSort(unSortedArray);
        System.out.println("Array After Bubble Sort");
        for (int i : unSortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Heap Sort
        sort.HeapSort(unSortedArray);
        System.out.println("Array After Heap Sort");
        for (int i : unSortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Shell Sort
        sort.ShellSort(unSortedArray);
        System.out.println("Array After Shell Sort");
        for (int b : unSortedArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Merge sort
        sort.MergeSort(unSortedArray);
        System.out.println("Array After Merge Sort");
        for (int x : unSortedArray) {
            System.out.print(x + " ");

        }

        System.out.println();
        //quick sort
        int size = sortedArray.length;
        sort.quickSort(sortedArray, 0, size - 1);
        System.out.println("Array After quick Sort");
        for (int x : unSortedArray) {
            System.out.print(x + " ");

        }
        System.out.println();

        // bucket Sort

        sort.bucketSort(unSortedArray);
        System.out.println("Array After bucket Sort");
        for (int x : unSortedArray) {
            System.out.print(x + " ");

        }


    }
}








