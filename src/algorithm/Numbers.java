package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use MySql Database to store data and retrieve data.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10000];
        storeRandomNumbers(num);
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);

        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num,"Insertion_Sort","SortingNumber");
        randomize(num,n);


     // Bubble Sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of"+ num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable(num,"Bubble_Sort","SortingNumbers");
       randomize(num,n);

       // Merge Sort
       algo.MergeSort(num);
       long MergeSortExecutionTime = algo.executionTime;
       System.out.println("Total Execution Time of"+ num.length + " numbers in Merge Sort take: " + MergeSortExecutionTime+ " milli sec" );
        connectToSqlDB.insertDataFromArrayToSqlTable(num,"Merge_Sort","SortingNumbers");
       Sort.printSortedArray(num);
        randomize(num,n);

        // Quick Sort
       int low = 0;
        int high = num.length-1;
        algo.quickSort(num,low,high);
        long quickSortExecutionTime = algo.executionTime;
       System.out.println("Total Execution Time of"+ num.length + " numbers in  Quick Sort take: " + quickSortExecutionTime + " milli sec" );
       connectToSqlDB.insertDataFromArrayToSqlTable(num,"Quick_Sort","SortingNumbers");
       Sort.printSortedArray(num);
        randomize(num,n);

        //Heap Sort
        algo.HeapSort(num);
       System.out.println("HEAP SORT");
       long heapSortExecutionTime = algo.executionTime;
       System.out.println("Total Execution Time of"+ num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec" );
       connectToSqlDB.insertDataFromArrayToSqlTable(num,"Heap_Sort","SortingNumbers");
      Sort.printSortedArray(num);
      randomize(num,n);

        //Shell Sort
       algo.ShellSort(num);
        long ShellSortExecutionTime = algo.executionTime;
      System.out.println("Total Execution Time of"+ num.length + " numbers in Shell Sort take: " + ShellSortExecutionTime + " milli sec" );
       connectToSqlDB.insertDataFromArrayToSqlTable(num,"Shell_Sort","SortingNumbers");
        Sort.printSortedArray(num);
       randomize(num,n);

        //Bucket Sort

       algo.bucketSort(num);
       long BucketSortExecutionTime = algo.executionTime;
       System.out.println("Total Execution Time of"+ num.length + " numbers in bucket Sort take: " + BucketSortExecutionTime + " milli sec" );
       connectToSqlDB.insertDataFromArrayToSqlTable(num,"Bucket_Sort","SortingNumbers");
        Sort.printSortedArray(num);
       randomize(num,n);

    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000000);
        }
    }

    public static void randomize(int[] arr, int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st);
        }
    }
}
