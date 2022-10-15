package pl.polsl.sortingvisualizer;

/**
 * @author qooboos
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import pl.polsl.sortingvisualizer.model.*;
import pl.polsl.sortingvisualizer.view.*;
import pl.polsl.sortingvisualizer.controller.*;

public class SortingVisualizer {

    public static void main(String[] args) {

        //Model model = new Model();
        //Controller controller = new Controller();
        View view = new View();
        
        view.PrintMenu();
        int choice = Controller.GetChoice();

        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        Iterator<Integer> it = array.iterator();
        
        if (choice == 1) {
            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            //sortingAlgorithm.Sort(array);
            //view.PrintArrayWithIterators(array, it);
            
            while(it.hasNext()) {
                view.PrintArrayWithIterators(array, it);
                sortingAlgorithm.Sort(array, it);
            }
        }
    }
}
