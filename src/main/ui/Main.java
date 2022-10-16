package ui;

import model.Events;
import model.Member;
import model.Sponsor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Clubber newApp = new Clubber();

    }

    public static class Clubber {
        private Sponsor spon;
        private Member memb;
        private Events even;

        public Clubber() {
            runClubber();
        }


        public void runClubber() {


            boolean keepGoing = true;

            while (keepGoing) {
                displayMenu();
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                if (a == 1) {
                    addNewMember();
                }


            }

        }

        public void displayMenu() {
            System.out.println("Welcome To Clubber");
            Scanner in = new Scanner(System.in);
            System.out.println("Here You can Store a List of your Sponsors, Members, Events");
            System.out.println("Menu");
            System.out.println("Press 1 for Member");
            System.out.println("Press 2 for Sponsor");
            System.out.print("Press 3 for Event");
            int input = in.nextInt();
            if (input == 1) {
                displayMemberMenu();
            }

        }

        public void displayMemberMenu() {
            Scanner in = new Scanner(System.in);
            System.out.println("This is member Menu");
            System.out.println("Press 1 for Adding new member");
            System.out.println("Press 2 for Retrieving the list of member");
            System.out.println("Press 3 for Removing a member");
            System.out.println("Press 4 for assigning a new task to a member");
            System.out.println("Press 5 for fees paid  member");
            System.out.println("Press 6 for Main Menu");
            int input = in.nextInt();
            if (input == 1) {
                addNewMember();
            }
            if (input == 2) {
                listofMembers();
            }
            if (input == 3) {
                removeMember();
            }

            if (input == 4) {
                assignNewtask();
            }

            if (input == 5) {
                listofFeesPaid();
            }
            if (input == 6) {
                displayMenu();
            }

            in.nextLine();


        }

        public void addNewMember() {
            Scanner in = new Scanner(System.in);
            System.out.println("Here you can add a new member");
            System.out.println("Name of the Member");
            String name = in.nextLine();
            System.out.println("Designation of Member");
            String desg = in.nextLine();
            System.out.println("Has the member paid fees? true/false");
            boolean fees = in.nextBoolean();
            in.nextLine();
            System.out.println("What is the email of the member?");
            String email = in.nextLine();
            System.out.println("Task assigned to the member?");
            String task = in.nextLine();
            System.out.println("Has the member completed the task? true/false");
            String taskStatus = in.nextLine();
            Member newMem = new Member(name, desg, fees, email, task, taskStatus);
            System.out.println("Member added, press enter to continue");
            in.nextLine();

            displayMemberMenu();
        }

        public void listofMembers() {
            Scanner in = new Scanner(System.in);
            Member.memberList();
            System.out.println("Press enter to continue");
            in.nextLine();
            displayMemberMenu();

        }

        public void assignNewtask() {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the name of member");
            String name = in.nextLine();
            in.nextLine();
            System.out.println("Please enter the new task");
            String task = in.nextLine();
            Member.changeTask(name, task);
            System.out.println("Press enter to continue");
            in.nextLine();
            displayMemberMenu();
        }

        public void removeMember() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of member ");
            String name = in.nextLine();
            System.out.println("Enter the designation");
            String desig = in.nextLine();
            Member.removemyMember(name, desig);
            System.out.println("Press enter to continue");
            in.nextLine();
            displayMemberMenu();

        }

        public void listofFeesPaid() {
            Scanner in = new Scanner(System.in);
            Member.feesPaidMembers();
            System.out.println("Press enter to continue");
            in.nextLine();
            displayMemberMenu();
        }


    }

}







