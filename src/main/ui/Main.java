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
                //Scanner in = new Scanner(System.in);
                //int a = in.nextInt();
                //if (a == 1) {
                //  addNewMember();
                //}


            }

        }

        public void displayMenu() {
            System.out.println("Welcome To Clubber");
            Scanner in = new Scanner(System.in);
            System.out.println("Here You can Store a List of your Sponsors, Members, Events");
            System.out.println("Menu");
            System.out.println("Press 1 for Member");
            System.out.println("Press 2 for Sponsor");
            System.out.println("Press 3 for Event");
            System.out.println("Press 4 for Total funds recieved");
            System.out.println("Press 5 for terminating the program");
            int input = in.nextInt();
            if (input == 1) {
                displayMemberMenu();
            }
            if (input == 2) {
                displaySponsorMenu();
            }
            if (input == 3) {
                displayEventMenu();
            }
            if (input == 4) {
                totalfundsRecieved();
            }


        }

        public void totalfundsRecieved() {
            Scanner in = new Scanner(System.in);
            System.out.println("Here are your total funds");
            System.out.println("Funds recieved by sponsors");
            System.out.println("Funds recieved are " + " $ " + Sponsor.sponsorfunds());
            // System.out.println("Funds recieved by Sponsors"+ " $ " + String.valueOf(Member.memberFunds()));
            System.out.println();
            System.out.println("Press enter to continue");
            in.nextLine();
            System.out.println();
            displayMenu();


        }

        @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
        public void displayMemberMenu() {

            Scanner in = new Scanner(System.in);
            System.out.println();
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
            String mem = Member.memberList();
            System.out.println(mem);
            System.out.println();
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


        public void displaySponsorMenu() {
            Scanner in = new Scanner(System.in);
            System.out.println("Press 1 for adding Sponsor");
            System.out.println("Press 2 to see a list of sponsors");
            System.out.println("Press 3 to remove a sponsor");
            System.out.println("Press 4 to see total funds received from sponsors");
            System.out.println("Press 5 for Main Menu");
            int input = in.nextInt();
            if (input == 1) {
                addSponsor();
            }
            if (input == 2) {
                listofSponsors();
            }
            if (input == 3) {
                removeSponsor();
            }

            if (input == 4) {
                fundsRecieved();
            }
            if (input == 5) {
                displayMenu();
            }

        }

        //1
        public void addSponsor() {
            Scanner in = new Scanner(System.in);
            System.out.println("What is the name of the sponsor");
            String name = in.nextLine();
            System.out.println("Total funds given by the sponsor?");
            int funds = in.nextInt();
            Sponsor newSpon = new Sponsor(name, funds);
            System.out.println("Sponsor added successfully!");
            System.out.println("Press enter to continue ");
            in.nextLine();
            displaySponsorMenu();

        }

        //2
        public void listofSponsors() {
            Scanner in = new Scanner(System.in);
            System.out.println("Here is the list of all sponsors");
            String sponsor1 = Sponsor.sponsorList();
            System.out.println(sponsor1);
            System.out.println("Press enter to continue ");
            in.nextLine();
            displaySponsorMenu();
        }

        //3
        public void removeSponsor() {
            Scanner in = new Scanner(System.in);
            System.out.println("What is the name of the sponsor?");
            String name = in.nextLine();
            in.nextLine();
            displaySponsorMenu();

        }

        //4
        public void fundsRecieved() {
            System.out.println("Funds recieved by Sponsors are as follows");
            Sponsor.sponsorList();
            System.out.println("Total funds recieved are " + " $ " + Sponsor.sponsorfunds());
        }


        public void displayEventMenu() {
            Scanner in = new Scanner(System.in);
            System.out.println("Here you can add new events");
            System.out.println("Press 1 to create a new event");
            System.out.println("Press 2 to see upcoming events");
            System.out.println("Press 3 to go back to the main menu");
            int input = in.nextInt();
            if (input == 1) {
                addEvent();
            }
            if (input == 2) {
                upcomingEvents();
            }
            if (input == 3) {
                displayMenu();
            }


        }

        //1
        public void addEvent() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of the event");
            String event = in.nextLine();
            System.out.println("Enter the date dd-mm-yyyy");
            String date = in.nextLine();
            Events newEvent = new Events(event, date);
            System.out.println("Event created Successfully");
            System.out.println("Press enter to continue ");
            in.nextLine();
            displayEventMenu();
        }

        public void upcomingEvents() {
            Scanner in = new Scanner(System.in);
            System.out.println("Here is the list of all Events");
            String event1 = Events.eventList();
            System.out.println(event1);
            System.out.println();
            System.out.println("Press enter to continue ");
            in.nextLine();
            displayEventMenu();


        }


    }

}







