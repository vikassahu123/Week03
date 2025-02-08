import java.util.*;
public class Problem_2 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(arr, l, L, 0, n1);
        System.arraycopy(arr, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr1 = new int[1001];
        int[] arr2 = new int[10001];
        int[] arr3 = new int[100001];
        for (int i = 0; i < arr1.length; i++) arr1[i] = rand.nextInt(1001);
        for (int i = 0; i < arr2.length; i++) arr2[i] = rand.nextInt(10001);
        for (int i = 0; i < arr3.length; i++) arr3[i] = rand.nextInt(100001);

        System.out.println("Performing Sorting operations on dataset of size 1001");
        int[] dataset = Arrays.copyOf(arr1, arr1.length);
        long start = System.nanoTime();
        bubbleSort(dataset);
        long end = System.nanoTime();
        System.out.println("Bubble sort took " + (end - start) / 1000000.0 + " ms\n");

        dataset = Arrays.copyOf(arr1, arr1.length);
        start = System.nanoTime();
        mergeSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Merge sort took " + (end - start) / 1000000.0 + " ms\n");

        dataset = Arrays.copyOf(arr1, arr1.length);
        start = System.nanoTime();
        quickSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Quick sort took " + (end - start) / 1000000.0 + " ms\n");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Performing Sorting operations on dataset of size 10001");
        dataset = Arrays.copyOf(arr2, arr2.length);
        start = System.nanoTime();
        bubbleSort(dataset);
        end = System.nanoTime();
        System.out.println("Bubble sort took " + (end - start) / 1000000.0 + " ms\n");
        dataset = Arrays.copyOf(arr2, arr2.length);
        start = System.nanoTime();
        mergeSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Merge sort took " + (end - start) / 1000000.0 + " ms\n");
        dataset = Arrays.copyOf(arr2, arr2.length);
        start = System.nanoTime();
        quickSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Quick sort took " + (end - start) / 1000000.0 + " ms\n");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Performing Sorting operations on dataset of size 100001");
        dataset = Arrays.copyOf(arr3, arr3.length);
        start = System.nanoTime();
        bubbleSort(dataset);
        end = System.nanoTime();
        System.out.println("Bubble sort took " + (end - start) / 1000000.0 + " ms\n");
        dataset = Arrays.copyOf(arr3, arr3.length);
        start = System.nanoTime();
        mergeSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Merge sort took " + (end - start) / 1000000.0 + " ms\n");
        dataset = Arrays.copyOf(arr3, arr3.length);
        start = System.nanoTime();
        quickSort(dataset, 0, dataset.length - 1);
        end = System.nanoTime();
        System.out.println("Quick sort took " + (end - start) / 1000000.0 + " ms\n");
    }
}
