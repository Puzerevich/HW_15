package hw_15;

import java.util.Arrays;

public class app {

    public static void main(String[] args) {

        // Coctail sort
        ShakerSorting<String> sorterStringCoctail = new ShakerSorting<>();
        String[] array1 = {"apple", "orange", "banana", "watermelon",  "melon"};
        sorterStringCoctail.sort(array1);
        System.out.println(Arrays.toString(array1));

        ShakerSorting<Integer> sorterIntegerCoctail = new ShakerSorting<>();
        Integer[] array2 = {5, 1, 4, 2, 8};
        sorterIntegerCoctail.sort(array2);
        System.out.println(Arrays.toString(array2));

        // Quick sort
        QuickSort<String> sorterStringQuick = new QuickSort<>();
        String[] array3 = {"apple", "orange", "banana", "watermelon",  "melon"};
        sorterStringQuick.sort(array3);
        System.out.println(Arrays.toString(array3));

        QuickSort<Integer> sorterIntegerQuick = new QuickSort<>();
        Integer[] array4 = {5, 1, 4, 2, 8};
        sorterIntegerQuick.sort(array4);
        System.out.println(Arrays.toString(array4));
    }
}

