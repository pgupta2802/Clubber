package ui;

import model.Events;
import model.Member;
import model.Sponsor;
import persistence.JsonReader;
import persistence.JsonWriter;

import java.io.FileNotFoundException;
import java.util.Scanner;

//This is the club class
//This  creates the club object and runs everything
public class Clubber {

    private static final String JSON_STORE_MEM = "./data/Members.json";
    private static final String JSON_STORE_EVE = "./data/Events.json";
    private static final String JSON_STORE_SPO = "./data/Sponsors.json";
    private JsonWriter jsonWriter;
    private JsonReader jsonSponsor;
    private JsonReader jsonMember;
    private JsonReader jsonEvent;

    public Clubber() {


        runClubber(true);
    }


    public void runClubber(boolean b) {
        jsonMember = new JsonReader(JSON_STORE_MEM);
        jsonEvent = new JsonReader(JSON_STORE_EVE);
        jsonSponsor = new JsonReader(JSON_STORE_SPO);

        boolean keepGoing = b;
        if (keepGoing == false) {
            System.out.println("Thank you for using Clubber!!");
        } else {

            displayMenu();


        }
    }
//Effects:Displays the menu

    public void displayMenu() {
        System.out.println("Welcome To Clubber");
        Scanner in = new Scanner(System.in);
        System.out.println("Here You can Store a List of your Sponsors, Members, Events");
        System.out.println("Menu");
        System.out.println("Press 1 for Member");
        System.out.println("Press 2 for Sponsor");
        System.out.println("Press 3 for Event");
        System.out.println("Press 4 for Total funds recieved");
        System.out.println("Press 5 for Exiting clubber. Please save data before leaving.");
        int input = in.nextInt();
        displayMenuOption(input);
    }

    // Effects: displays the menu option
    public void displayMenuOption(int input) {
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
        if (input == 5) {
            //System.out.println("Thank you for Using clubber!!");
            boolean b = false;
            runClubber(b);
        }


    }
//Effects: returns the total funds recieved

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
//Effects: used to display the member menu

    public void displayMemberMenu() {

        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("This is member Menu");
        System.out.println("Press 1 for Adding new member");
        System.out.println("Press 2 for Retrieving the list of member");
        System.out.println("Press 3 for Removing a member");
        System.out.println("Press 4 for Task Assigned menu");
        System.out.println("Press 5 for Members who have paid their fees");
        System.out.println("Press 6 for Main Menu");
        System.out.println("Press 7 for saving data . It will add new changes!!");
        System.out.println("Press 8 for Loading data");
        int input = in.nextInt();
        displayMemberInput(input);
    }

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void displayMemberInput(int input) {
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
            taskAssignedMenu();
        }
        if (input == 5) {
            listofFeesPaid();
        }
        if (input == 6) {
            displayMenu();
        }
        if (input == 7) {
            jsonWriter = new JsonWriter(JSON_STORE_MEM);
            try {
                saveDataMember();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Data saved");
            displayMemberMenu();
        }
        if (input == 8) {
            loadDaataMember();
            System.out.println("Data loaded");
            System.out.println();
            displayMemberMenu();
        }
    }


    private void taskAssignedMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("This is the Task Menu");
        System.out.println("Press 1 to view te tasks assigned to members");
        System.out.println("Press 2 to view a members who have completed their task");
        System.out.println("Press 3 to assign new task to member");
        System.out.println("Press 4 to go back to Members menu");

        int input = in.nextInt();
        if (input == 1) {
            viewTaskAsssigned();
        }
        if (input == 2) {
            membersTaskCompleted();

        }
        if (input == 3) {
            assignNewtask();
        }

        if (input == 4) {
            displayMemberMenu();
        }


    }

    private void membersTaskCompleted() {
        System.out.println("Here are all members who have completed their task");
        System.out.println(Member.taskCompletedMembers());
        System.out.println();
        taskAssignedMenu();
    }

    private void viewTaskAsssigned() {
        System.out.println("Here are all the tasks assigned to members");
        System.out.println(Member.taskAssignedList());
        System.out.println();
        taskAssignedMenu();
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
        System.out.println("Has the member completed the task? done/not done");
        String taskStatus = in.nextLine();
        Member newMem = new Member(name, desg, fees, email, task, taskStatus);
        System.out.println("Member added");
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
        taskAssignedMenu();
    }

    public void removeMember() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of member ");
        String name = in.nextLine();
        System.out.println("Enter the designation");
        String desig = in.nextLine();
        Member.removemyMember(name, desig);
        System.out.println(name + "Removed Successfully");
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
        System.out.println("Press 6 for saving data. New changes will be added!");
        System.out.println("Press 7 for Loading data");
        int input = in.nextInt();
        displaySponsorMenuOption(input);
    }

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void displaySponsorMenuOption(int input) {
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
        if (input == 6) {
            jsonWriter = new JsonWriter(JSON_STORE_SPO);
            try {
                saveDataSponsor();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Data saved");
            displaySponsorMenu();
        }
        if (input == 7) {
            loadDataSponsor();
            System.out.println("Data loaded");
            displaySponsorMenu();
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
        Sponsor.removemySponsor(name);
        System.out.println(name + "Removed Successfully");
        in.nextLine();
        displaySponsorMenu();

    }

    //4
    public void fundsRecieved() {
        System.out.println("Funds recieved by Sponsors are as follows");
        Sponsor.sponsorList();
        System.out.println("Total funds recieved are " + " $ " + Sponsor.sponsorfunds());
        System.out.println();
        displaySponsorMenu();
    }


    //@SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void displayEventMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Here you can add new events");
        System.out.println("Press 1 to create a new event");
        System.out.println("Press 2 to see upcoming events");
        System.out.println("Press 3 to go back to the main menu");
        System.out.println("Press 4 to save data");
        System.out.println("Press 5 to reload previous data");
        int input = in.nextInt();
        displayEventMenuOption(input);
    }

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void displayEventMenuOption(int input) {
        if (input == 1) {
            addEvent();
        }
        if (input == 2) {
            upcomingEvents();
        }
        if (input == 3) {
            displayMenu();
        }
        if (input == 4) {
            jsonWriter = new JsonWriter(JSON_STORE_EVE);
            try {
                saveDataEvents();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            displayEventMenu();
        }
        if (input == 5) {
            loadDataEvent();
            System.out.println("Data loaded");
            displayEventMenu();
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


    public void saveDataMember() throws FileNotFoundException {
//        try {
        JsonWriter.open();
        JsonWriter.writeMembers();
//        JsonWriter.writeSponsor();
//        JsonWriter.writeEvents();

        JsonWriter.close();
        System.out.println("Saved " + " to " + JSON_STORE_MEM);

//        } catch (FileNotFoundException e) {
//            System.out.println("Unable to write to file: " + JSON_STORE);
//        }
//    }

    }

    public void saveDataEvents() throws FileNotFoundException {
        JsonWriter.open();
        JsonWriter.writeEvents();
        JsonWriter.close();
        System.out.println("Saved " + " to " + JSON_STORE_EVE);
        System.out.println("Data saved");

    }

    public void saveDataSponsor() throws FileNotFoundException {
        JsonWriter.open();
        JsonWriter.writeSponsor();
        JsonWriter.close();
        System.out.println("Saved " + " to " + JSON_STORE_SPO);


    }

    public void loadDataSponsor() {
        try {
            // jsonSponsor = new JsonReader(JSON_STORE_SPO);
            jsonSponsor.readSponsor(JSON_STORE_SPO);
            System.out.println("Loaded " + " from " + JSON_STORE_SPO);
        } catch (Exception e) {
            System.out.println("Unable to read from file: ");
        }
    }


    public void loadDaataMember() {
        try {
            // jsonSponsor = new JsonReader(JSON_STORE_SPO);
            jsonMember.readMember(JSON_STORE_MEM);
            System.out.println("Loaded " + " from " + JSON_STORE_MEM);
        } catch (Exception e) {
            System.out.println("Unable to read from file: ");
        }
    }

    public void loadDataEvent() {
        try {
            jsonEvent.readEvents(JSON_STORE_EVE);
            System.out.println("Loaded " + " from " + JSON_STORE_EVE);
        } catch (Exception e) {
            System.out.println("Unable to read from file: ");
        }
    }


}
















