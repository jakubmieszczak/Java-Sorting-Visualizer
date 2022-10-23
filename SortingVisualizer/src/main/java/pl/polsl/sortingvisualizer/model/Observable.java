/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.sortingvisualizer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import pl.polsl.sortingvisualizer.controller.EventListener;

/**
 *
 * @author qooboos
 */
public class Observable {
    
    Map<String, ArrayList<EventListener>> listeners = new HashMap<>();
    
    public void addSubscriber(String eventType, EventListener listener){
    
        ArrayList<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }
    public void removeSubscriber(String eventType, EventListener listener){
    
        ArrayList<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }
    
    public void notifyListener(String eventType){
        ArrayList<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType);
        }
    }
    
}
