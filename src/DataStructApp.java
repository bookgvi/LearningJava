import DataStructures.List;
import DataStructures.HashTable;
import DataStructures.SetClass;
import DataStructures.Sort.ArraySorter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class DataStructApp {
    public static void main(String[] args) {
        int[] unsortedArr = new int[]{1, 2, 6, 2, 9, 3, 7, 8, 5, 5};
        ArraySorter arraySorter = new ArraySorter();

        arraySorter.displayArr("Unsorted arr", unsortedArr);
        arraySorter.quickSort(unsortedArr);
    }
}
