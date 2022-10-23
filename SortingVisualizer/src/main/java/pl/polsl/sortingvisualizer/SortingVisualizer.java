package pl.polsl.sortingvisualizer;

/**
 * @author qooboos
 */
import java.util.ArrayList;

import pl.polsl.sortingvisualizer.model.*;
import pl.polsl.sortingvisualizer.view.*;
import pl.polsl.sortingvisualizer.controller.*;


public class SortingVisualizer {

    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View();
        EventListener notification = new Notification();

        //ArrayList array = controller.getArray();
      
        view.printMenu();
        //Integer choice = controller.getChoice();
        Integer choice = 1;

        if (choice == 1) {
            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            sortingAlgorithm.addSubscriber(notification);
            
            sortingAlgorithm.sort(controller.getArray());
        }
        
        view.printArray(controller.getArray());
    }
}