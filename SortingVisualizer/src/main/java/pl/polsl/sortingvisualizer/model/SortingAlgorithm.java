package pl.polsl.sortingvisualizer.model;

/**
 *
 * @author qooboos
 */

import java.util.ArrayList;

public interface SortingAlgorithm {
    
    //ArrayList<Integer> originalArray = null;
    Integer arrayAccesses = 0;
    Integer arrayComparsions = 0;
    
    void sort(ArrayList<Integer> array);

}
