package model;

import java.util.Calendar;
import java.util.Date;

//This class is used to create new events for every user action
public class Event {
    private static final int HASH_CONSTANT = 13;
    private final Date dateLogged;
    private final String description;

    public Event(String description) {
        dateLogged = Calendar.getInstance().getTime();
        this.description = description;
    }


    public Date getDate() {
        return dateLogged;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (other.getClass() != this.getClass()) {
            return false;
        }
        Event otherEvent = (Event) other;

        return (this.dateLogged.equals(otherEvent.dateLogged) && this.description.equals(otherEvent.description));
    }

    @Override
    public int hashCode() {
        return (HASH_CONSTANT * dateLogged.hashCode() + description.hashCode());
    }

    @Override
    public String toString() {
        return dateLogged.toString() + "\n" + description;
    }
}
