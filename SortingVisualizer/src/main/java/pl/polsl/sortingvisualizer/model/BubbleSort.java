package pl.polsl.sortingvisualizer.model;

/**
 *
 * @author qooboos
 */
import java.util.ArrayList;

public class BubbleSort extends Observable implements SortingAlgorithm {
            
    @Override
    public void sort(ArrayList<Integer> array) {


        Integer n = array.size();
        Integer temp;
        
        this.notifyListener("s");
        
        for (Integer i = 0; i < n - 1; i++) {
            for (Integer j = 0; j < (n - 1 - i); j++) {
                
                if (array.get(j) > array.get(j + 1)) {

                    temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
                //sortingInfo.updateArray(array); //update every other iteration
            }
        }
    }
}