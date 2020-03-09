public class SortOfSort {
    public static void sortOfSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        int count = 0;
        int max;
        int current;
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            max = Integer.MIN_VALUE;
            current = i;

            for (int j = left; j <= right; j++) {
                if (array[j] > max)
                    max = array[j];
                    current = j;
            }
        }
        if (left < right) {
            if (count < 2) {
                temp = array[right];
                array[right] = max;
                array[current] = temp;
                count++;
                right--;
            } else if (count < 4) {
                temp = array[left];
                array[left] = max;
                array[current] = temp;
                count++;
                left++;
            }
        }
        if (count == 4) {
            count = 0;
        }
    }
}