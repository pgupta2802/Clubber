package model;

import java.util.ArrayList;

public class Events {
    private String eventname;
    private String eventdate;
    static ArrayList<Events> event = new ArrayList();

    //Requires name and date
    // Effects - Creates an instance of event with  name and date
    public Events(String name, String date) {
        this.eventname = name;
        this.eventdate = date;
        addEvent(this);
    }

    public String getEventname() {
        return this.eventname;
    }

    public String getEventdate() {
        return this.eventdate;
    }


    //Array

    //Effects - adds current event to the array of events
    public void addEvent(Events e) {
        event.add(e);
    }

    // effects returns a string of eventlist
    public static String EventList() {
        String event1 = "";
        for (int i = 0; i < event.size(); i++) {
            event1 += event.get(i).getEventname() + " " + event.get(i).getEventdate() + "\n";

        }
        return event1;
    }


}
