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
        EventListener notification = new Notification(controller);

      
        view.printMenu();
        Integer choice = controller.getChoice();

        if (choice == 1) {
            SortingAlgorithm sortingAlgorithm = new BubbleSort();
            sortingAlgorithm.addSubscriber(notification);
            
            sortingAlgorithm.sort(controller.getArray());
        }
        
        view.printArray(controller.getArray());
    }
}