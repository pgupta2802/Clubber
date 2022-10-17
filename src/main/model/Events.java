package model;

import java.util.ArrayList;

public class Events {
    private String eventname;
    private String eventdate;
    static ArrayList<Events> event = new ArrayList();

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
    public void addEvent(Events e) {
        event.add(e);
    }

    public static boolean EventList() {
        for (int i = 0; i < event.size(); i++) {
            System.out.println(event.get(i).eventname + " " + event.get(i).eventdate);

        }
        return true ;
    }


}
