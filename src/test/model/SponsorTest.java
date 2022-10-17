package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SponsorTest {

    Sponsor x;
    Sponsor y;

    @BeforeEach
    void runBefore() {
        x = new Sponsor("Google", 10000);
        y = new Sponsor("Amazon", 20000);

    }

    @Test
    void testaddSponsor() {
        assertEquals(2, Sponsor.sponsors.size());
    }

    @Test
    void testSponsorList() {
        assertEquals("Google 10000\nAmazon 20000", Sponsor.sponsorList());

    }

    @Test
    void testRemovemySponsor() {
        Sponsor.removemySponsor("Google");
        assertEquals(1, Sponsor.sponsors.size());
    }

    @Test
    void testSponsorFunds() {
        int funds = Sponsor.sponsorfunds();
        assertEquals(30000, funds);
    }

}
