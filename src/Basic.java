public class Basic {
    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }


    public static long measure(int[] arr) {
        long start = System.nanoTime();
        bubble(arr.clone());
        return System.nanoTime() - start;
    }


    public static void main(String[] args) {
        int[] arr = {26, 22, 11, 14, 27, 32, 9, 10, 28, 10};

        arr = bubble(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\n" + measure(arr) + " ns");
    }
}