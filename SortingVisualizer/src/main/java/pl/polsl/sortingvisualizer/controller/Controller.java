package pl.polsl.sortingvisualizer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author qooboos
 */
public class Controller {

    ArrayList<Integer> array = new ArrayList<Integer>(List.of(6, 2, 3, 1));
    
    public ArrayList getArray() {
         
        return array;
    }
    
    public Integer getChoice() {
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        return choice;
    }  
}