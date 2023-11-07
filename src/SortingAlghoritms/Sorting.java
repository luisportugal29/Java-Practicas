package SortingAlghoritms;

public class Sorting {

    public static<T extends Comparable<T>> void bubbleSort(T[] elements) {
        for ( int i = 0; i < elements.length - 1; i++) {
            for ( int x = i + 1; x < elements.length; x++) {
                if ( elements[i].compareTo(elements[x]) > 0 ) {
                    T temp = elements[x];
                    elements[x] = elements[i];
                    elements[i] = temp;
                }
            }
        }
    }
}
