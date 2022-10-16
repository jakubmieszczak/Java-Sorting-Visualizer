/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingvisualizer.controller;

import pl.polsl.sortingvisualizer.model.SortingAlgorithm;
import java.util.ArrayList;

/**
 *
 * @author qooboos
 */
public class SortingInfo {

    private ArrayList<Integer> originalArray;
    public ArrayList<ArrayList<Integer>> sortingIterations = new ArrayList<ArrayList<Integer>>();
    private Integer arrayAccesses = 0;
    private Integer arrayComparsions = 0;

    private SortingAlgorithm sortingType;
    
    public SortingInfo(ArrayList<Integer> originalArray, SortingAlgorithm sortingType){
        this.originalArray = originalArray;
        this.sortingType = sortingType;
    }
    
    public void updateArray(ArrayList<Integer> array){
        
        ArrayList<Integer> singleIteration = new ArrayList<Integer>(array);
        this.sortingIterations.add(singleIteration);
    }
}
