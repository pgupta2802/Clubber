package model;

import java.util.ArrayList;
import java.util.List;

public class Member {

    private String name;
    private String designation = "Member";
    private boolean isFeesPaid = false;
    private String email;
    private String task;
    private String taskStatus;
    private static int memberFunds = 0;
    @SuppressWarnings("checkstyle:VisibilityModifier")
    public static List<Member> members = new ArrayList();


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

    public void feesIspaid() {
        memberFunds += 5;

    }

    public static int memberFunds() {
        return memberFunds;
    }


    public String getEmail() {
        return this.email;
    }


    public String getTask() {
        return this.task;
    }

    public String getTaskStatus() {
        return this.taskStatus;
    }


    //Array list methods
    public void addMember(Member m) {
        members.add(m);
    }

    public static void memberList() {
        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).getName() + " " + members.get(i).getDesignation() + " " + members.get(i).getEmail());

        }
    }

    public static void changeTask(String name, String newTask) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)) {
                members.get(i).getTask().equals(newTask);
            }
        }
    }


    public static void removemyMember(String name, String desig) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name) && members.get(i).getDesignation().equals(desig)) {
                members.remove(i);
            }
            System.out.println("Member " + name + " removed successfully");
        }
    }

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
