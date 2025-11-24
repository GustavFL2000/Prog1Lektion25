package measure;

import sortering.BubbelSortering;
import sortering.InsertionSortering;
import sortering.SelectionSort;

public class SortMethods {
    
    public static void bubbleSort(String[] array) {
        BubbelSortering.bubbleSort(array);
    }
    
    public static void insertionSort(String[] array) {
        InsertionSortering.insertioneSort(array);
    }
    
    public static void selectionSort(String[] array) {
        SelectionSort.selectionSort(array);
    }
    
}
