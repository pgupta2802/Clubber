package model;

import java.util.ArrayList;
import java.util.Date;

public class Events {
    private String eventname;
    //private ArrayList<Date>;
    private ArrayList<Events> event = new ArrayList();

    Events(String name) {
        this.eventname = name;
        addEvent(this);
    }


    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public void addEvent(Events e) {
        event.add(e);
    }


}
