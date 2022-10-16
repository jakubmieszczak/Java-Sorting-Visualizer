package pl.polsl.sortingvisualizer.model;

/**
 *
 * @author qooboos
 */

import java.util.ArrayList;
import pl.polsl.sortingvisualizer.controller.SortingInfo;

public interface SortingAlgorithm {

    void sort(ArrayList<Integer> array, SortingInfo sortingInfo);

}
