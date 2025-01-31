import java.util.Arrays;

public class CountingSortApproach {
    public static void countingSort(int arr[], int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];

        for (int age : arr) {
            count[age - minAge]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - minAge] - 1] = arr[i];
            count[arr[i] - minAge]--;
        }

        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int ages[] = {12, 15, 10, 14, 18, 13, 17, 16, 11, 12, 14};
        
        System.out.println("Before Sorting: " + Arrays.toString(ages));

        countingSort(ages, 10, 18);

        System.out.println("After Sorting: " + Arrays.toString(ages));
    }
}

