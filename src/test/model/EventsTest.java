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
        y = new Events("Billionare Club", "25-10-2022");
    }

    @Test
    void testAddEvent() {
        assertEquals(2, Events.event.size());


    }

    @Test
    void testEventList() {
        assertEquals("Pizza Night 22-10-2022\nBillionare Club 25-10-2022", Events.EventList());

    }


}



