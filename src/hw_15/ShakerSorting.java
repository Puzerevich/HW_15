package hw_15;

public class ShakerSorting <T extends Comparable<T>> {

    public void sort(T[] array) {
        boolean swapped;
        int start = 0;
        int end = array.length - 1;
        do {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                    swapped = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    swap(array, i, i - 1);
                    swapped = true;
                }
            }
            start++;
        } while (swapped);
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
