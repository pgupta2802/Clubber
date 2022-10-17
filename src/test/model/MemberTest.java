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
        assertEquals(25, Member.getMemberFunds()); //adds 5 five times bacause of run before
        Member.members.remove(x);


    }

    @Test
    void testAddMember() {
        assertEquals(1, Member.members.size());
        Member.members.remove(x);

    }


    @Test
    void testMemberList() {
        assertEquals(Member.members.get(0).getName() + " " + Member.members.get(0).getDesignation()
                        +
                        " " + Member.members.get(0).getEmail() + "\n"

                , Member.memberList());
        Member.members.remove(x);
    }


    @Test
    public void testChangeTask() {
        x.changeTask("Pranjal", "bring new members");

        assertEquals("bring new members", x.getTask());
        Member.members.remove(x);

    }

    @Test
    public void testRemoveMember() {
        Member.removemyMember("Pranjal", "President");
        assertEquals(0, Member.members.size());
        Member.members.remove(x);

    }

    @Test
    public void testFeesPaidMembers() {
        assertTrue(Member.feesPaidMembers());
        Member.members.remove(x);
    }


}
