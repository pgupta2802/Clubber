package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MemberTest {
    Member x;


    @BeforeEach
    void runBefore() {
        //String name, String designation, boolean isFeesPaid, String email, String task, String taskComplete
        x = new Member("Pranjal", "President", true, "pranjal@ubc.com", "none", "true");
//        y = new Member("Bill Gates", "Vice President", false, "bill@ubc.com", "none", "true");
//        z = new Member("Tim Cook", "Secretary", false, "tim@ubc.com", "none", "true");
    }


    @Test
    void testMemberFunds() {
        assertEquals(25, Member.getMemberFunds());

    }

    @Test
    void testAddMember() {
        assertEquals(2, Member.members.size());
    }


    @Test
    void testMemberList() {
        assertEquals(Member.members.get(0).getName() + " " + Member.members.get(0).getDesignation()
                        +
                        " " + Member.members.get(0).getEmail() + "\n"
                        + Member.members.get(0).getName() + " " + Member.members.get(0).getDesignation()
                        +
                        " " + Member.members.get(0).getEmail() + "\n"
                , Member.memberList());
    }


    @Test
    public void testChangeTask() {
        x.changeTask("Pranjal", "bring new members");

        assertEquals("bring new members", x.getTask());
    }

    @Test
    public void testRemoveMember() {
        Member.removemyMember("Pranjal", "President");
        assertEquals(1, Member.members.size());

    }

    @Test
    public void testFeesPaidMembers() {
        assertTrue(Member.feesPaidMembers());
    }


}
