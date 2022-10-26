/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingvisualizer.model;

import java.util.ArrayList;
import pl.polsl.sortingvisualizer.controller.EventListener;

/**
 *
 * @author qooboos
 */
public class EventManager {

    private final ArrayList<EventListener> listeners;
    
    public EventManager(){
        this.listeners = new ArrayList<EventListener>();
    }

    public void addSubscriber(EventListener listener) {

        listeners.add(listener);
    }

    public void removeSubscriber(EventListener listener) {

        listeners.remove(listener);
    }

    public void notifyListener() {

        listeners.forEach((listener) -> listener.update()); 
        //System.out.println(listeners.size());
    }
}