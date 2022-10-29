package persistence;

import model.Events;
import model.Sponsor;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JsonReaderTest {

    @Test
    void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/noSuchFile.json");
        try {
            Events event = reader.readEvents("./data/noSuchFile.json");
            fail("IOException expected");
        } catch (Exception e) {
            // pass
        }
    }

    @Test
    void testReaderEmptySponsor() throws FileNotFoundException {
//        Sponsor sponsor = new Sponsor("Google", 1000);
//        JsonWriter writer = new JsonWriter("./data/testReaderEmptySponsor.json");
//        writer.open();
//        writer.writeSponsor();
//        writer.close();

        JsonReader reader = new JsonReader("./data/testReaderEmptySponsor.json");
        try {
            Sponsor sponsorOne = reader.readSponsor("./data/testReaderEmptySponsor.json");
            assertEquals("Google", Sponsor.getSponsors().get(0).getName());
            assertEquals(1000, Sponsor.getSponsors().get(0).getFundsGiven());
        } catch (Exception e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    void testReaderGeneralSponsor() throws FileNotFoundException {
        Sponsor sponsorOne = new Sponsor("Google", 1000);
        Sponsor sponsorTwo = new Sponsor("Amazon", 10000);
        JsonWriter writer = new JsonWriter("./data/testReaderGeneralSponsor.json");
        writer.open();
        writer.writeSponsor();
        writer.close();

        JsonReader reader = new JsonReader("./data/testReaderGeneralSponsor.json");
        try {
            Sponsor sponsorthree = reader.readSponsor("./data/testReaderGeneralSponsor.json");
            assertEquals("Google", Sponsor.getSponsors().get(0).getName());
            List<Sponsor> sponsor = Sponsor.getSponsors();
            assertEquals(4,sponsor.size());
            assertEquals("Google", sponsor.get(0).getName());
            assertEquals(1000, Sponsor.getSponsors().get(0).getFundsGiven());
            assertEquals("Amazon", sponsor.get(1).getName());
            assertEquals(10000, Sponsor.getSponsors().get(1).getFundsGiven());

        } catch (Exception e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    void testReaderEmptyEvent() throws FileNotFoundException {
        Events event = new Events("Google", "20-10-2020");
        JsonWriter writer = new JsonWriter("./data/testReaderEmptyEvents.json");
        writer.open();
        writer.writeEvents();
        writer.close();

        JsonReader reader = new JsonReader("./data/testReaderEmptyEvents.json");

        try {
            Events eventOne = reader.readEvents("./data/testReaderEmptyEvents.json");
            assertEquals("Google", Events.getEvents().get(0).getEventname());
            assertEquals("20-10-2020", Events.getEvents().get(0).getEventdate());
        } catch (Exception e) {
            fail("Couldn't read from file");
        }
    }


    @Test
    void testReaderGeneralEvent() throws FileNotFoundException {
        Events event = new Events("Google", "20-10-2020");
        JsonWriter writer = new JsonWriter("./data/testReaderEmptyEvents.json");
        writer.open();
        writer.writeEvents();
        writer.close();

        JsonReader reader = new JsonReader("./data/testReaderEmptyEvents.json");

        try {
            Events eventOne = reader.readEvents("./data/testReaderEmptyEvents.json");
            assertEquals("Google", Events.getEvents().get(0).getEventname());
            assertEquals("20-10-2020", Events.getEvents().get(0).getEventdate());
        } catch (Exception e) {
            fail("Couldn't read from file");
        }
    }





}









