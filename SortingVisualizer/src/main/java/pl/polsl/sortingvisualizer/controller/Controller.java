package pl.polsl.sortingvisualizer.controller;

import java.util.Scanner;

/**
 *
 * @author qooboos
 */
public class Controller {

    public static int GetChoice() {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
}
