/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingvisualizer.view;

/**
 *
 * @author qooboos
 */
public class View {

    public void PrintMenu() {
        System.out.println("Choose sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Heap Sort");

    }

    static public void PrintArray(int[] array) {
        int n = array.length;
        //System.out.println(n);
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(i + " ");
        }
    }

}
