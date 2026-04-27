public class Advanced {
    public static int[] quick(int[] arr) {
        quick(arr, 0, arr.length - 1);
        return arr;
    }

    public static void quick(int[] arr, int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);
            quick(arr, start, pi - 1);
            quick(arr, pi + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }


    public static long measure(int[] arr) {
        long start = System.nanoTime();
        quick(arr.clone());
        return System.nanoTime() - start;
    }


    public static void main(String[] args) {
        int[] arr = {11, 31, 51, 85, 53, 34, 14, 8, 59, 10, 22, 20, 50, 96, 18, 72, 4, 1, 37, 47, 81, 86, 68, 63, 52, 35, 66, 95,
                40, 69, 49, 30, 100, 26, 67, 19, 54, 57, 76, 62, 13, 79, 60, 73, 5, 83, 45, 97, 33, 58, 88, 39, 48, 93, 71, 55, 64, 77, 56, 46, 17, 2, 3, 21,
                44, 75, 15, 16, 9, 36, 92, 23, 43, 7, 61, 89, 78, 42, 32, 87, 41, 28, 91, 84, 65, 80, 99, 70, 90, 24, 38, 29, 82, 27, 25, 74, 6, 98, 94, 12};

        arr = quick(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n" + measure(arr) + " ns");
    }
}