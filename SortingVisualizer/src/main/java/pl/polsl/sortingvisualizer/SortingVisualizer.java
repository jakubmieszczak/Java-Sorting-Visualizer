package pl.polsl.sortingvisualizer;

/**
 * @author qooboos
 */
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

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        if (choice == 1) {
            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            sortingAlgorithm.Sort(array);
            //view.PrintArray(array);
        }
    }
}
