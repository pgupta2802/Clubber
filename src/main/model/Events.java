package model;

import java.util.ArrayList;

public class Events {
    static ArrayList<Events> event = new ArrayList();
    private final String eventname;
    private final String eventdate;

    //Requires : name and date in string format
    // Effects : Creates an instance of event with  name and date
    public Events(String name, String date) {
        this.eventname = name;
        this.eventdate = date;
        addEvent(this);
    }

    // Effects : returns a string of eventlist
    public static String eventList() {
        String event1 = "";
        for (int i = 0; i < event.size(); i++) {
            event1 += event.get(i).getEventname() + " " + event.get(i).getEventdate() + "\n";

        }
        return event1;
    }

    public String getEventname() {
        return this.eventname;
    }


    //Array

    public String getEventdate() {
        return this.eventdate;
    }

    //Effects - adds current event to the array of events
    public void addEvent(Events e) {
        event.add(e);
    }


}
