package pl.polsl.sortingvisualizer;

/**
 * @author qooboos
 */
import java.util.ArrayList;
import java.util.List;

import pl.polsl.sortingvisualizer.model.*;
import pl.polsl.sortingvisualizer.view.*;
import pl.polsl.sortingvisualizer.controller.*;

public class SortingVisualizer {

    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View();

        ArrayList<Integer> array = new ArrayList<Integer>(List.of(6, 2, 3, 1));
      
        view.printMenu();
        Integer choice = controller.getChoice();

        if (choice == 1) {
            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            sortingAlgorithm.sort(array);
        }
        //view.printArray(array);
    }
}
