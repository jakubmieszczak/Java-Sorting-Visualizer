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
public class Notification implements EventListener {

    View view = new View();
    Controller controller;
    
    public Notification(Controller controller){
        this.controller = controller;
    }
    
    @Override
    public void update(){
        view.printArray(controller.getArray());
        
    }
}
