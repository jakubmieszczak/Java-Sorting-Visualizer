package pl.polsl.sortingvisualizer.controller;

import java.util.Scanner;

/**
 *
 * @author qooboos
 */
public class Controller {

    public Integer getChoice() {
        Scanner scan = new Scanner(System.in);
        Integer choice = scan.nextInt();
        return choice;
    }  
}
