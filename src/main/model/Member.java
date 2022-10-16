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
    public static List<Member> members = new ArrayList();


    public Member(String name, String designation, boolean isFeesPaid, String email, String task, String taskComplete) {
        this.name = name;
        this.designation = designation;
        this.isFeesPaid = isFeesPaid;
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

    public boolean getFeesPaid() {
        return this.isFeesPaid;
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

    public static void removeMember(String name, String desig){
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)&&members.get(i).getDesignation().equals(desig)) {
                members.remove(i);
            }
            System.out.println("Member removed successfully");
        }
    }

    public static void removemyMember(String name, String desig){
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equals(name)&&members.get(i).getDesignation().equals(desig)) {
                members.remove(i);
            }
            System.out.println("Member " + name + " removed successfully");
        }
    }

    public static void feesPaidMembers(){
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).isFeesPaid) {
                System.out.println(members.get(i).getName());
            }
        }
    }














}
