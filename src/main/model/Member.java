package model;

import java.util.ArrayList;
import java.util.List;


public class Member {

    static List<Member> members = new ArrayList();
    private static int memberFunds;
    private final String name;
    private String designation = "Member";
    private boolean isFeesPaid = false;
    private final String email;
    private String task;
    private final String taskStatus;

    //Requires - name,designation,isFeespaid,email,task,taskStatus,memberFunds,
//effects - creates an instance of member with given fields
    public Member(String name, String designation, boolean isFeesPaid, String email, String task, String taskComplete) {
        this.name = name;
        this.designation = designation;
        this.isFeesPaid = isFeesPaid;
        if (isFeesPaid) {
            feesIspaid();
        }
        this.email = email;
        this.task = task;
        this.taskStatus = taskComplete;
        //this.members = members;
        addMember(this);


    }

    public static int getMemberFunds() {
        return memberFunds;
    }

    //effects :creates a string of all the memberlist
    public static String memberList() {
        String mem = "";
        for (int i = 0; i < members.size(); i++) {
            mem += members.get(i).getName() + " " + members.get(i).getDesignation()
                    +
                    " " + members.get(i).getEmail() + "\n";

        }
        return mem;
    }

    //effects: changes the task of given member
    public static boolean changeTask(String name, String newTask) {
        boolean b = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)) {
                members.get(i).setTask(newTask);
                return true;
            }
        }
        return b;
    }

    //effects :  removes the given member from the class
    public static void removemyMember(String name, String desig) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name) && members.get(i).getDesignation().equals(desig)) {
                members.remove(i);
            }

        }
    }

    //Effects : returns what is the status of payment of fees
    public static boolean feesPaidMembers() {
        boolean a = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).isFeesPaid) {
                System.out.println(members.get(i).getName());
                a = true;
            }
        }
        return a;
    }

    public String getName() {
        return this.name;
    }


    //Array list methods

    public String getDesignation() {
        return this.designation;
    }

    //Effects add members fees in memberfunds everytime it is called
    public void feesIspaid() {
        memberFunds += 5;

    }

    public String getEmail() {
        return this.email;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    //effects :adds the given member in member array
    public void addMember(Member m) {
        members.add(m);
    }


}
