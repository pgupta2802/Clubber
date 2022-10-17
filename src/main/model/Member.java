package model;

import java.util.ArrayList;
import java.util.List;

//Requires - name,designation,isFeespaid,email,task,taskStatus,memberFunds,
//effects - creates an instance of member with given fields
public class Member {

    private String name;
    private String designation = "Member";
    private boolean isFeesPaid = false;
    private String email;
    private String task;
    private String taskStatus;
    private static int memberFunds;

    static List<Member> members = new ArrayList();


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

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.designation;
    }

    //Effects add members fees in memberfunds everytime it is called
    public void feesIspaid() {
        this.memberFunds += 5;

    }

    public static int getMemberFunds() {
        return memberFunds;
    }


    public String getEmail() {
        return this.email;
    }


    public String getTask() {
        return this.task;
    }


    //Array list methods

    //effects :adds the given member in member array
    public void addMember(Member m) {
        members.add(m);
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

    public void setTask(String task) {
        this.task = task;
    }

    //effects: changes the task of given member
    public static void changeTask(String name, String newTask) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)) {
                members.get(i).setTask(newTask);
            }
        }
    }

    //effects :  removes the given member from the class
    public static void removemyMember(String name, String desig) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name) && members.get(i).getDesignation().equals(desig)) {
                members.remove(i);
            }
            System.out.println("Member " + name + " removed successfully");
        }
    }

    //Effects : returns what is the status of payment of fees
    public static boolean feesPaidMembers() {
        boolean a = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).isFeesPaid) {
                System.out.println(members.get(i).getName());
                a = true;
                ;
            }
        }
        return a;
    }


}
