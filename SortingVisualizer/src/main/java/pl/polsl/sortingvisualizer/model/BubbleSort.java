package pl.polsl.sortingvisualizer.model;

/**
 *
 * @author qooboos
 */

import java.util.ArrayList;
import java.util.Iterator;

public class BubbleSort implements SortingAlgorithm {

    public void Sort(ArrayList<Integer> array, Iterator<Integer> it) {

        Integer n = array.size();
        Integer temp;
         
       
        for (Iterator i = it; i.hasNext();) {
            for (Integer j = 0; j < (n - 1); j++) {
                if (array.get(j) > array.get(j + 1)) {
                    temp = array.get(j);
                    //array.get(j) = array.get(j + 1);
                    array.set(j, array.get(j + 1));
                    //array[j + 1] = temp;
                    array.set(j + 1, temp);
               
                }
            }
        }
    }
    
    public void Sort(ArrayList<Integer> array, Iterator<Integer> it, Iterator<Integer> it2) {
        
        Integer n = array.size();
        Integer temp;
        
        for(Iterator i = it; i.hasNext();){}
    }
}
