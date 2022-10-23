/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingvisualizer.controller;

import pl.polsl.sortingvisualizer.view.View;


/**
 *
 * @author qooboos
 */
public class Notification extends Controller implements EventListener {

    View view = new View();
    @Override
    public void update(){
        //System.out.println("cokolwiek");
        view.printArray(getArray());
    }
}
