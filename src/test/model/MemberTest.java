package model;

import model.Member;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    Member x ;
    Member y ;
    Member z ;

    @BeforeEach
    void runBefore(){
        //String name, String designation, boolean isFeesPaid, String email, String task, String taskComplete
        x = new Member("Pranjal", "President" , true , "pranjal@ubc.com" , "none", "true" );
        y = new Member("Bill Gates", "Vice President" , false , "bill@ubc.com" , "none", "true" );
        z = new Member("Tim Cook", "Secretary" , false , "tim@ubc.com" , "none", "true" );
    }



    @Test
     void testMemberFunds(){
        assertEquals(5, Member.memberFunds());
    }

    @Test
    void testAddMember(){
        assertEquals(3,Member.members.size());
    }

    @Test
    public void testChangeTask(){
        x.changeTask("Pranjal" , "bring new members");
        y.changeTask("Tim Cook" , "make app interesting");

        assertEquals(x.getTask(), "bring new members");
        assertEquals(y.getTask(), "make app interesting");

    }
    @Test
   public void testRemoveMember(){
        Member.removemyMember("Bill Gates", "Vice President");
        Member.removemyMember("Tim Cook", "Secretary");

        assertEquals(1, Member.members.size());

    }

    @Test
     public void testFeesPaidMembers(){

        assertTrue( Member.feesPaidMembers());




    }





}
