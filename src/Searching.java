import java.util.Random;
import java.util.Arrays;

public class Searching {
    public static int binary(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        binary(arr, target);
        return System.nanoTime() - startTime;
    }

    public static void main(String[] args) {
        int arr[] = generateRandomArray(1000);
        Arrays.sort(arr);

        int x = arr[new Random().nextInt(arr.length)];
        int result = binary(arr, x);

        System.out.println("Searching for: " + x);
        System.out.println("index:" + result);

        long time = measureSearchTime(arr, x);
        System.out.println("Search time: " + time + " ns");
    }

}