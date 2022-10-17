package model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventsTest {
    Events x;
    Events y;


    @BeforeEach
    void runBefore() {

        x = new Events("Pizza Night", "22-10-2022");
        y = new Events("Billionaire Club", "25-10-2022");
    }

    @Test
    void testAddEvent() {
        assertEquals(2, Events.event.size());
        Events.event.remove(x);
        Events.event.remove(y);


    }

    @Test
    void testEventList() {
        assertEquals(Events.event.get(0).getEventname() + " " + Events.event.get(0).getEventdate() + "\n" +
                Events.event.get(1).getEventname() + " " + Events.event.get(1).getEventdate() + "\n", Events.eventList());

        //Events.event.remove(x);
        //Events.event.remove(y);


    }


}



