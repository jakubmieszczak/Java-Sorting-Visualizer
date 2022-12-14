package pl.polsl.sortingvisualizer.model;

/**
 *
 * @author qooboos
 */
import java.util.ArrayList;
//import pl.polsl.sortingvisualizer.model.EventManager;

public class BubbleSort extends SortingAlgorithm {
    
    @Override
    public void sort(ArrayList<Integer> array) {
      
        Integer n = array.size();
        Integer temp;
        
        this.notifyListener();
        
        for (Integer i = 0; i < n - 1; i++) {
            for (Integer j = 0; j < (n - 1 - i); j++) {
                
                if (array.get(j) > array.get(j + 1)) {

                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    //System.out.println("zmiana");
                }
                this.notifyListener();
            }
        }
    }
}