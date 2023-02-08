package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Events;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    private static final Map<Integer, Events> events = new HashMap<>();

    public static Collection<Events> getAll(){
        return events.values();
    }

    public static Events getById(int id){
        return events.get(id);
    }

    public static void add(Events event) {
        events.put(event.getId(), event);
    }

    // remove an event

    public static void remove(Integer id) {
        if (events.containsKey(id)) {
            events.remove(id);
        }
    }
}
