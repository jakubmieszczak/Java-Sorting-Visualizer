package pl.polsl.sortingvisualizer.view;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author qooboos
 */
public class View {

    public void PrintMenu() {
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Heap Sort");

    }

    public void PrintArray(ArrayList<Integer> array) {
        
        Integer n = array.size();

        for (Integer i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
    }

    public void PrintArrayWithIterators(ArrayList<Integer> array, Iterator<Integer> it) {

        Integer n = array.size();

        for (Iterator i = it; it.hasNext();) {
            System.out.print(it.next() + " ");
        }
    }

}
