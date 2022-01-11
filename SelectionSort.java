public class SelectionSort {
    public static int findmin(int[] array, int start, int end) {
        int min = array[start];
        int minIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    } // end swap

    public static void Ascending(int[] array) {
        for (int k = 0; k < array.length - 1; k++) {
            int minIndex = findmin(array, k, array.length);
            swap(array, k, minIndex);
        }
    }
}