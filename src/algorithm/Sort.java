package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++)
                if (array[i] < array[min])
                    min = i;

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 1; i < list.length; i++)
            for (int j = i - 1; j >= 0; j--)
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int temp = 0;
        for (int i = 0; i < list.length; i++)
            for (int j = 1; j < (list.length) - i; j++)
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
        return list;
    }

    public int[] HeapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        buildHeap(array);
        for (int i = array.length-1; i >= 1; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // heapify root element
            heapify(array,i,0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    // Build max heap
    public void buildHeap(int[] array) {
        for (int i = array.length/2-1; i >= 0; i--)
            heapify(array, array.length, i);
    }

    public void heapify(int[] array, int n, int i) {
// largest among root ,left child and right child
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild =2*i+2;
        if (leftChild < n && array[leftChild]>array[largest]) {
            largest = leftChild;
        }
            if (rightChild < n && array[rightChild]>array[largest]) {
                largest=rightChild;
            }

            if (largest !=i) {

                    int temp = array[i];
                    array[i] = array[largest];
                    array[largest] = temp;
                    heapify(array, n, largest);
                }
            }




    public int[] ShellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        int array_length = array.length;
        int i, j;
        for (int b = array_length / 2; b > 0; b = b / 2)
            for (i = b; i < array_length; i += 1) {
                int b2 = array[i];
                for (j = i; j >= b && array[j - b] > b2; j -= b)
                    array[j] = array[j - b];
                array[j] = b2;
            }
        return list;
    }


    public void MergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            MergeSort(left);
            MergeSort(right);
            merge(array, left, right);
        }

    }

    // left half
    public int[] leftHalf(int[] array) {
        int mid = array.length / 2;
        int[] left = new int[mid];
        for (int i = 0; i < mid; i++) left[i] = array[i];
        return left;
    }

    // right half
    public static int[] rightHalf(int[] array) {
        int mid = array.length / 2;
        int mid1 = array.length - mid;
        int[] right = new int[mid1];
        for (int i = 0; i < mid1; i++) right[i] = array[i + mid];
        return right;
    }

    public void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++)
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
    }

    public static int quickSort(int[] array, int start, int end) {
        int temp = array[end];
        int i = (start - 1);
        for (int j = start; j < end; j++)
            if (array[j] <= temp) {
                i++;
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        //swapping the elements

        int swap = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swap;
        return i + 1;
    }

    public static void quickSortAlgo(int[] arrayTobeSorted, int start, int end) {
        if (start < end) {
            int temp = quickSort(arrayTobeSorted, start, end);
            quickSortAlgo(arrayTobeSorted, start, temp - 1);
            quickSortAlgo(arrayTobeSorted, temp + 1, end);
        }
    }

    public int[] bucketSort(int[] array) {
        // Creating an empty array
        int [] list =array;
        int MaximumValue = getMax(array);
        int[] newbucket = new int[MaximumValue + 1];

       // int[] sorted_array = new int[array.length];
        for (int a = 0; a < array.length; a++) {
            newbucket[array[a]]++;
        }
        int position = 0;
        for (int i = 0; i < newbucket.length; i++) {
            for (int j = 0; j < newbucket[i]; j++) {
                array[position++] = i;

            }
        }
        return array;
    }



    // function to find the maximum value
    public int getMax(int[] array) {
        int maximum_value = 0;
        for (int i1 = 0; i1 < array.length; i1++) {
            if (array[i1] > maximum_value) maximum_value = array[i1];
        }
        return maximum_value;
    }


}



















