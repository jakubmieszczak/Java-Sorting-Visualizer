package pl.polsl.sortingvisualizer.view;

import java.util.ArrayList;

/**
 *
 * @author qooboos
 */
public class View {

    public void printMenu() {
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Heap Sort");

    }

    public void printArray(ArrayList<Integer> array) {

        Integer n = array.size();

        for (Integer i = 0; i < n; i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
