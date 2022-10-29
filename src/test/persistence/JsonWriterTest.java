package persistence;

import model.Events;
import model.Member;
import model.Sponsor;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JsonWriterTest {
    @Test
    void testWriterInvalidFile() {
        try {
            Sponsor wr = new Sponsor("Google", 100);
            JsonWriter writer = new JsonWriter("./data/my\0illegal:fileName.json");
            writer.open();
            fail("IOException was expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    void testWriterEmptySponsors() {
        try {
            Sponsor sponsor = new Sponsor("Google", 1000);
            JsonWriter writer = new JsonWriter("./data/testWriterEmptySponsor.json");
            writer.open();
            writer.writeSponsor();
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterEmptySponsor.json");
            sponsor = reader.readSponsor("./data/testWriterEmptySponsor.json");
            assertEquals("Google", Sponsor.getSponsors().get(0).getName());
            assertEquals(1000, Sponsor.getSponsors().get(0).getFundsGiven());
            Sponsor.getSponsors().remove(0);

        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void testWriterGeneralSponsors() {
        try {
            Sponsor sponsorOne = new Sponsor("Amazon", 100);
            Sponsor sponsorTwo = new Sponsor("Google", 1000);

            JsonWriter writer = new JsonWriter("./data/testWriterGeneralSponsor.json");
            writer.open();
            writer.writeSponsor();
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterGeneralSponsor.json");
            sponsorOne = reader.readSponsor("./data/testWriterGeneralSponsor.json");

            List<Sponsor> sponsorList = Sponsor.getSponsors();
            assertEquals(4, Sponsor.getSponsors().size());
            assertEquals("Amazon", Sponsor.getSponsors().get(0).getName());
            assertEquals("Google", Sponsor.getSponsors().get(1).getName());

        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void testWriterEmptyMembers() {
        try {
            Member memberOne = new Member("Pranjal", "President", true, "pranjal@",
                    "none", "done");


            JsonWriter writer = new JsonWriter("./data/testWriterGeneralMember.json");
            writer.open();
            writer.writeMembers();
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterGeneralMember.json");
            memberOne = reader.readMember("./data/testWriterGeneralMember.json");

            assertEquals("Pranjal", Member.getMembers().get(0).getName());
            assertEquals("President", Member.getMembers().get(0).getDesignation());


        } catch (Exception e) {
            fail("Exception should not have been thrown");

        }
    }


    @Test
    void testWriterGeneralMembers() {
        try {
            Member memberOne = new Member("Pranjal", "President", true, "pranjal@",
                    "none", "done");


            JsonWriter writer = new JsonWriter("./data/testWriterGeneralMember.json");
            writer.open();
            writer.writeMembers();
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterGeneralMember.json");
            memberOne = reader.readMember("./data/testWriterGeneralMember.json");


            List<Member> MemberList = Member.getMembers();
            assertEquals(2, MemberList.size());
            assertEquals("Pranjal", Member.getMembers().get(0).getName());

        } catch (Exception e) {
            fail("Exception should not have been thrown");
        }
    }


    @Test
    void testWriterEmptyEvents() {
        try {
            Events eventOne = new Events("Workshop", "20-10-2022");


            JsonWriter writer = new JsonWriter("./data/testWriterEmptyEvents.json");
            writer.open();
            writer.writeEvents();
            writer.close();

            JsonReader reader = new JsonReader("./data/testWriterEmptyEvents.json");
            eventOne = reader.readEvents("./data/testWriterEmptyEvents.json");

            assertEquals("Workshop", Events.getEvents().get(0).getEventname());
            assertEquals("20-10-2022", Events.getEvents().get(0).getEventdate());


        } catch (Exception e) {
            fail("Exception should not have been thrown");

        }
    }

    @Test
        void testWriterGeneralEvents () {
            try {

                Events eventOne = new Events("Workshop", "20-10-2022");
                Events eventTwo = new Events("Dance", "11-10-2022");


                JsonWriter writer = new JsonWriter("./data/testWriterGeneralEvents.json");
                writer.open();
                writer.writeEvents();
                writer.close();

                JsonReader reader = new JsonReader("./data/testWriterGeneralEvents.json");
                eventOne = reader.readEvents("./data/testWriterGeneralEvents.json");
                eventTwo = reader.readEvents("./data/testWriterGeneralEvents.json");
                List<Events> eventsList = Events.getEvents();
                assertEquals(6, eventsList.size());
                assertEquals("Workshop", Events.getEvents().get(0).getEventname());
                assertEquals("20-10-2022", Events.getEvents().get(0).getEventdate());
                assertEquals("20-10-2022", Events.getEvents().get(0).getEventdate());



            } catch (Exception e) {
                fail("Exception should not have been thrown");

            }



        }


    }


























