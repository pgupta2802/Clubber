package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

//This class creates new events with their specification of  name and date.
//It also creates an array list of these events.
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

    public static ArrayList<Events> getEvents() {
        return event;
    }


    //JSON Methods
    public static JSONObject toJson() {
        JSONObject eventData = new JSONObject();
        eventData.put("Events", eventsToJson());

        return eventData;


    }

    private JSONObject eventoJson() {
        JSONObject json = new JSONObject();
        json.put("name", getEventname());
        json.put("Date", getEventdate());
        return json;
    }

    // EFFECTS: returns things in this workroom as a JSON array
    private static JSONArray eventsToJson() {
        JSONArray jsonArray = new JSONArray();

        for (Events t : event) {
            jsonArray.put(t.eventoJson());
        }

        return jsonArray;
    }


}
