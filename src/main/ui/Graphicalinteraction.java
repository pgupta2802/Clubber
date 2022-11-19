package ui;

import model.Events;
import model.Member;
import model.Sponsor;
import persistence.JsonReader;
import persistence.JsonWriter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

//This is the java swinc , which implements the GUI
//It has all the methods required for making a graphiuc friendly interface


public class Graphicalinteraction implements ActionListener {
    public static void main(String[] args) {
        new Graphicalinteraction();

    }

    private static final String destination = "./data/Members.json";
    private static final String JSON_STORE_MEM = "./data/Members.json";
    private static final String JSON_STORE_EVE = "./data/Events.json";
    private static final String JSON_STORE_SPO = "./data/Sponsors.json";
    private JsonWriter jsonWriter;
    private JsonReader jsonSponsor;
    private JsonReader jsonMember;
    private JsonReader jsonEvent;
    int count = 0;
    int eventCounter = 0;
    int sponsorCounter = 0;
    int countloadMem = 0;

    JFrame loadingEventDataFrame = new JFrame();
    JButton addingNewSponsorButton = new JButton();


    JButton memberButton = new JButton();
    JButton printEventsButton = new JButton();
    JButton addingNewMemberButton = new JButton();
    JFrame addMemberFrame = new JFrame();
    JTextField memberName = new JTextField();
    JTextField memberDesignationtext = new JTextField();
    JTextField memberFeesPaid = new JTextField();
    JTextField memberTask = new JTextField();
    JTextField memberTaskComplete = new JTextField();
    JTextField memberEmail = new JTextField();
    JButton submitMemberButton = new JButton();
    JButton universalMainMenuButton = new JButton();


    JButton printListMemberButton = new JButton();
    JButton removingMember = new JButton();
    JTextField eventNameText = new JTextField();
    JTextField eventdateText = new JTextField();

    JTextField sponsorNameText = new JTextField();

    JTextField sponsorfundText = new JTextField();

    JButton submitNewEventButton = new JButton();
    JFrame addingSponsorFrame = new JFrame();


    JButton events = new JButton();
    JButton addingNewEventsButton = new JButton();
    JFrame addingNewEventsFrame = new JFrame();
    JButton printSponsorbuttonnotFrame = new JButton();


    JButton sponsors = new JButton();
    JFrame welcomeFrame = new JFrame();


    JFrame loadingDataFrame = new JFrame();


    JFrame memberFrame = new JFrame();
    JFrame eventFrame = new JFrame();
    JFrame addEventFrame = new JFrame();


    JFrame sponsorsFrame = new JFrame();
    JButton submitNewSponsorButton = new JButton();

    // Constructor - creayes an instance of GU
    Graphicalinteraction() {
//        jsonMember = new JsonReader(JSON_STORE_MEM);
//        jsonEvent = new JsonReader(JSON_STORE_EVE);
//        jsonSponsor = new JsonReader(JSON_STORE_SPO);

        welcomePanel();

    }

    //rests to default after every use
    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    void reset() {
        sponsorNameText = new JTextField();

        sponsorfundText = new JTextField();
        loadingEventDataFrame = new JFrame();
        addingSponsorFrame = new JFrame();
        memberButton = new JButton();
        printEventsButton = new JButton();
        addingNewMemberButton = new JButton();
        addMemberFrame = new JFrame();
        memberName = new JTextField();
        memberDesignationtext = new JTextField();
        memberFeesPaid = new JTextField();
        memberTask = new JTextField();
        memberTaskComplete = new JTextField();
        memberEmail = new JTextField();
        submitMemberButton = new JButton();
        universalMainMenuButton = new JButton();
        printListMemberButton = new JButton();
        removingMember = new JButton();
        eventNameText = new JTextField();
        eventdateText = new JTextField();
        addingNewSponsorButton = new JButton();
        printSponsorbuttonnotFrame = new JButton();

        submitNewEventButton = new JButton();


        events = new JButton();
        addingNewEventsButton = new JButton();
        addingNewEventsFrame = new JFrame();


        sponsors = new JButton();
        welcomeFrame = new JFrame();
        submitNewSponsorButton = new JButton();


        loadingDataFrame = new JFrame();


        memberFrame = new JFrame();
        eventFrame = new JFrame();
        addEventFrame = new JFrame();

        sponsorsFrame = new JFrame();


    }

    //Effects: Crfeates the main menu panel
    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void welcomePanel() {
//        if (loader) {
//
//            try {
//                jsonMember.readMember(JSON_STORE_MEM);
//                System.out.println("Loaded " + " from " + JSON_STORE_MEM);
//                jsonEvent.readEvents(JSON_STORE_EVE);
//                System.out.println("Loaded " + " from " + JSON_STORE_EVE);
//                jsonSponsor.readSponsor(JSON_STORE_SPO);
//                System.out.println("Loaded " + " from " + JSON_STORE_SPO);
//
//            } catch (Exception e) {
//                System.out.println("Unable to read from file: ");
//            }
//
//            loader = false;

        reset();
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 100);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Main Menu");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 60));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);


        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 250, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        memberButton.setHorizontalAlignment((JLabel.CENTER));
        memberButton.addActionListener(this);
        memberButton.setText("Member");
        memberButton.setFocusable(false);
        button1.add(memberButton);


        JPanel button2 = new JPanel();
        button2.setBackground(new Color(0, 0, 0));
        button2.setBounds(300, 310, 150, 50);

        button2.setLayout(new BorderLayout());

        events.setHorizontalAlignment((JLabel.CENTER));
        events.addActionListener(this);
        events.setText("Events");
        events.setFocusable(false);
        events.setBackground(Color.cyan);
        button2.add(events);


        JPanel button3 = new JPanel();
        button3.setBackground(new Color(0, 0, 0));
        button3.setBounds(300, 370, 150, 50);
        button3.setLayout(new BorderLayout());

        sponsors.setHorizontalAlignment((JLabel.CENTER));
        sponsors.addActionListener(this);
        sponsors.setText("Sponsors");
        sponsors.setFocusable(false);
        sponsors.setBackground(Color.cyan);
        button3.add(sponsors);
        ubcImage();


//        this.setTitle();
        welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        welcomeFrame.setSize(800, 800);
        welcomeFrame.setVisible(true);
        welcomeFrame.setResizable(false);
        welcomeFrame.setLayout(null);
        welcomeFrame.getContentPane().setBackground(new Color(0, 0, 0));

        welcomeFrame.add(secondPanel);
        welcomeFrame.add(firstPanel());
        welcomeFrame.add(button1);
        welcomeFrame.add(button2);
        welcomeFrame.add(button3);


    }

    //Effects - adds ubc image
    private void ubcImage() {
        ImageIcon imageIcon = new ImageIcon("data/ubc.jpeg");
        Image ubcimage = imageIcon.getImage();
        Image modifiedubcImage = ubcimage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(modifiedubcImage);
        JLabel label = new JLabel();
        label.setBounds(0, 0, 200, 200);
        label.setIcon(imageIcon);
        welcomeFrame.add(label);
//        welcomeFrame.setVisible(true);


    }
//Effects-  action performed tracks yhe user input

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == memberButton) {
            welcomeFrame.dispose();
            memberFrame();
        } else if (e.getSource() == addingNewMemberButton) {
            welcomeFrame.dispose();
            addMemberMethod();
        } else if (e.getSource() == submitMemberButton) {
            operationsOnSubmitMembers();
        } else if (e.getSource() == universalMainMenuButton) {
            welcomePanel();
        } else if (e.getSource() == events) {
            eventFrameMethod();
        } else if (e.getSource() == addingNewEventsButton) {
            eventFrame.dispose();
            addEventFrameMethod();
        } else if (e.getSource() == submitNewEventButton) {
            operationsOnSubmitEvents();
        } else if (e.getSource() == sponsors) {
            welcomeFrame.dispose();
            sponsorFrameMethod();
        } else if (e.getSource() == addingNewSponsorButton) {
            addSponsorFrameMethod();
        } else if (e.getSource() == submitNewSponsorButton) {
            operationsOnSubmitSponsorEvents();
        } else if (e.getSource() == printListMemberButton) {
            loadingdataMethod();
        } else if (e.getSource() == printEventsButton) {
            loadingEventMethod();
        }


    }

    //effects- submits everything of sposnsor
    private void operationsOnSubmitSponsorEvents() {

        String sponsorName = sponsorNameText.getText();

        String sponsorFunds = sponsorfundText.getText();
        int funds = Integer.parseInt(sponsorFunds);

        saveSponsor(sponsorName, funds);
    }

    private void saveSponsor(String sponsorName, int funds) {

        try {
            JsonReader reader = new JsonReader(JSON_STORE_SPO);

            if (sponsorCounter == 0) {
                Sponsor c3 = reader.readSponsor(JSON_STORE_SPO);
                sponsorCounter++;
            }
            Sponsor c = new Sponsor(sponsorName, funds);
            JsonWriter writer1 = new JsonWriter(JSON_STORE_SPO);
            writer1.open();
            writer1.writeSponsor();
            writer1.close();
        } catch (IOException c) {
            System.out.println("  Error     ! IO Exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    //Efffects- submits everything of events
    private void operationsOnSubmitEvents() {

        String eventName = eventNameText.getText();

        String eventDate = eventdateText.getText();
        saveEvent(eventName, eventDate);


    }

    //Effects - save the events
    private void saveEvent(String eventName, String eventDate) {

        try {
            JsonReader reader = new JsonReader(JSON_STORE_EVE);

            if (eventCounter == 0) {
                Events c3 = reader.readEvents(JSON_STORE_EVE);
                eventCounter++;
            }

            Events c = new Events(eventName, eventDate);
            JsonWriter writer1 = new JsonWriter(JSON_STORE_EVE);
            writer1.open();
            writer1.writeEvents();
            writer1.close();


        } catch (IOException c) {
            System.out.println("  Error     ! IO Exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    //effects - operation os memberds
    private void operationsOnSubmitMembers() {

        String membername = memberName.getText();

        String memberDesignation = memberDesignationtext.getText();

        String feespaid = memberFeesPaid.getText();
        boolean feespaidboll = Boolean.parseBoolean(feespaid);

        String task = memberTask.getText();
        String taskcomplete = memberTaskComplete.getText();
        String email = memberEmail.getText();

        saveMember(membername, memberDesignation, feespaidboll, task, taskcomplete, email);


    }

    //Effects - saves the memebers to the file
    private void saveMember(String membername, String membberDesignation, boolean feespaid, String
            task, String taskcomplete, String email) {

        try {
            JsonReader reader = new JsonReader(destination);
            if (count == 0) {
                Member c3 = reader.readMember(destination);
                count++;
            }
            Member c = new Member(membername, membberDesignation, feespaid, email, task, taskcomplete);
            JsonWriter writer1 = new JsonWriter(destination);
            writer1.open();
            writer1.writeMembers();
            writer1.close();


        } catch (IOException c) {
            System.out.println("Error! IO Exception");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    //Effects - addts the top most panel to everything
    public JPanel firstPanel() {
        JPanel firstPanel = new JPanel();
        firstPanel.setBackground(new Color(255, 255, 255));
        firstPanel.setBounds(0, 0, 800, 30);
        firstPanel.setLayout(new BorderLayout());


        JLabel heading = new JLabel();
        heading.setText("UBC                                      AMS -EST-1918");
        heading.setHorizontalAlignment(JLabel.RIGHT);
        heading.setFont(new Font("Serif Bold", Font.PLAIN, 20));
        heading.setForeground(new Color(195, 195, 195));
        firstPanel.add(heading);

        return firstPanel;

    }

    //Effects events frames method is vreated
    public void eventFrameMethod() {
        eventFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventFrame.setSize(800, 800);
        eventFrame.setVisible(true);
        eventFrame.setResizable(false);
        eventFrame.setLayout(null);
        eventFrame.getContentPane().setBackground(new Color(0, 0, 0));
        eventFrame.add(firstPanel());
        eventFrame.add(eventframeheading());//done
        eventFrame.add(addingNewEventButtonEventsMenu());
        eventFrame.add(printListEventButton());


    }

    //effects same as above
    public void sponsorFrameMethod() {
        sponsorsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sponsorsFrame.setSize(800, 800);
        sponsorsFrame.setVisible(true);
        sponsorsFrame.setResizable(false);
        sponsorsFrame.setLayout(null);
        sponsorsFrame.getContentPane().setBackground(new Color(0, 0, 0));
        sponsorsFrame.add(firstPanel());
        sponsorsFrame.add(sponsorframeheading());//done
        sponsorsFrame.add(addingNewSponsorButtonEventsMenu());
        sponsorsFrame.add(printListEventButton());

    }

    public JPanel printListSponsorButton() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 310, 150, 50);
        button1.setLayout(new BorderLayout());


        printSponsorbuttonnotFrame.setHorizontalAlignment((JLabel.CENTER));
        printSponsorbuttonnotFrame.addActionListener(this);
        printSponsorbuttonnotFrame.setText("My Events");
        printSponsorbuttonnotFrame.setFocusable(false);
        button1.add(printSponsorbuttonnotFrame);
        return button1;


    }


    public JPanel addingNewSponsorButtonEventsMenu() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 250, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        addingNewSponsorButton.setHorizontalAlignment((JLabel.CENTER));
        addingNewSponsorButton.addActionListener(this);
        addingNewSponsorButton.setText("Add Sponsors");
        addingNewSponsorButton.setFocusable(false);
        button1.add(addingNewSponsorButton);
        return button1;


    }

    public JPanel sponsorframeheading() {
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 50);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Sponsor's Menu");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 30));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;

    }

    public JPanel printListEventButton() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 310, 150, 50);
        button1.setLayout(new BorderLayout());


        printEventsButton.setHorizontalAlignment((JLabel.CENTER));
        printEventsButton.addActionListener(this);
        printEventsButton.setText("My Events");
        printEventsButton.setFocusable(false);
        button1.add(printEventsButton);
        return button1;


    }

    public void loadingEventMethod() {
        loadingEventDataFrame.add(universalmainMenuButtonPanel());
        loadingEventDataFrame.add(headingforloadingData());
        loadingEventDataFrame.add(firstPanel());
        addingEventList();


        loadingEventDataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadingEventDataFrame.setSize(800, 800);
        loadingEventDataFrame.setVisible(true);
        loadingEventDataFrame.setResizable(false);
        loadingEventDataFrame.setLayout(null);
        loadingEventDataFrame.getContentPane().setBackground(new Color(0, 0, 0));
    }


    public void addingEventList() {

        try {
            JsonReader reader = new JsonReader(JSON_STORE_EVE);

            if (eventCounter == 0) {
                Events c3 = reader.readEvents(JSON_STORE_EVE);
                eventCounter++;
            }


            JPanel eventListPanel = new JPanel();
            eventListPanel.setBackground(new Color(0, 0, 0));
            eventListPanel.setBounds(0, 300, 800, 600);
            eventListPanel.setLayout(new BorderLayout());

            for (int i = 0; i < Events.getEvents().size(); i++) {

                JLabel eve = new JLabel();

                eve.setForeground(Color.green);
                eve.setLayout(new BorderLayout());
                eve.setBounds(0, 150 + 40 * i, 800, 50);

                eve.setText(Events.getEvents().get(i).getEventname() + "      "
                        + Events.getEvents().get(i).getEventdate());

                eventListPanel.add(eve);
            }
            loadingEventDataFrame.add(eventListPanel);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void addSponsorFrameMethod() {

        addingSponsorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addingSponsorFrame.setSize(800, 800);
        addingSponsorFrame.setVisible(true);
        addingSponsorFrame.setResizable(false);
        addingSponsorFrame.setLayout(null);
        addingSponsorFrame.getContentPane().setBackground(new Color(0, 0, 0));
        addingSponsorFrame.add(firstPanel());
        addingSponsorFrame.add(addSponsorFrameHeading());
        addingSponsorFrame.add(getSponsorNameUser());
        addingSponsorFrame.add(getSponsorFundText());
        addingSponsorFrame.add(submitNewSponsor());
        addingSponsorFrame.add(universalmainMenuButtonPanel());


    }

    private JPanel submitNewSponsor() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(255, 0, 0));
        button1.setBounds(350, 600, 150, 50);
        button1.setLayout(new BorderLayout());

        submitNewSponsorButton.addActionListener(this);
        submitNewSponsorButton.setText("Submit");
        submitNewSponsorButton.setFocusable(false);
        button1.add(submitNewSponsorButton);
        return button1;


    }

    public JTextField getSponsorNameUser() {
        sponsorNameText.setPreferredSize((new Dimension(250, 40)));
        sponsorNameText.setBounds(0, 200, 200, 30);
        sponsorNameText.setText("Enter name here");
        return sponsorNameText;
    }

    public JTextField getSponsorFundText() {
        sponsorfundText.setPreferredSize((new Dimension(250, 40)));
        sponsorfundText.setBounds(0, 250, 200, 30);
        sponsorfundText.setText("Enter Funds here");
        return sponsorfundText;
    }

    public JPanel addSponsorFrameHeading() {

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 100);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Here You Can ADD A New Sponsor");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 40));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;
    }

    public void addEventFrameMethod() {
        addEventFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addEventFrame.setSize(800, 800);
        addEventFrame.setVisible(true);
        addEventFrame.setResizable(false);
        addEventFrame.setLayout(null);
        addEventFrame.getContentPane().setBackground(new Color(0, 0, 0));
        addEventFrame.add(firstPanel());
        addEventFrame.add(addEventFrameHeading());
        addEventFrame.add(getEventNameUser());
        addEventFrame.add(getEventdateText());

        addEventFrame.add(submitNewEvent());
        addEventFrame.add(universalmainMenuButtonPanel());


    }
    //idbijr

    private JPanel submitNewEvent() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(255, 0, 0));
        button1.setBounds(350, 600, 150, 50);
        button1.setLayout(new BorderLayout());

        submitNewEventButton.addActionListener(this);
        submitNewEventButton.setText("Submit");
        submitNewEventButton.setFocusable(false);
        button1.add(submitNewEventButton);
        return button1;


    }

    public JTextField getEventNameUser() {
        eventNameText.setPreferredSize((new Dimension(250, 40)));
        eventNameText.setBounds(0, 200, 200, 30);
        eventNameText.setText("Enter name here");
        return eventNameText;
    }

    public JTextField getEventdateText() {
        eventdateText.setPreferredSize((new Dimension(250, 40)));
        eventdateText.setBounds(0, 250, 200, 30);
        eventdateText.setText("Enter name here");
        return eventdateText;
    }

    public JPanel addEventFrameHeading() {

        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 100);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Here You Can ADD A New Event");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 40));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;
    }

    public JPanel eventframeheading() {
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 50);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Event's Menu");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 30));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;

    }

    public JPanel addingNewEventButtonEventsMenu() {
        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 250, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        addingNewEventsButton.setHorizontalAlignment((JLabel.CENTER));
        addingNewEventsButton.addActionListener(this);
        addingNewEventsButton.setText("Add Events");
        addingNewEventsButton.setFocusable(false);
        button1.add(addingNewEventsButton);
        return button1;


    }


    public void memberFrame() {

        memberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        memberFrame.setSize(800, 800);
        memberFrame.setVisible(true);
        memberFrame.setResizable(false);
        memberFrame.setLayout(null);
        memberFrame.getContentPane().setBackground(new Color(0, 0, 0));
        memberFrame.add(firstPanel());
        memberFrame.add(memberframeheading());
        memberFrame.add(addingNewMemberButton());
        memberFrame.add(printListMemberButton());


        memberFrame.add(universalmainMenuButtonPanel());


    }


    public void addMemberMethod() {


        addMemberFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMemberFrame.setSize(800, 800);
        addMemberFrame.setVisible(true);
        addMemberFrame.setResizable(false);
        addMemberFrame.setLayout(null);
        addMemberFrame.getContentPane().setBackground(new Color(0, 0, 0));
        addMemberFrame.add(firstPanel());
        addMemberFrame.add(addmemberFrameHeading());
        addMemberFrame.add(getMemberNameUser());
        addMemberFrame.add(getmemberDesignation());
        addMemberFrame.add(getmemberTask());
        addMemberFrame.add(getmemberTaskComplete());
        addMemberFrame.add(getmemberEmail());
        addMemberFrame.add(getmemberDesignation());
        addMemberFrame.add(getmemberFeesPaid());
        addMemberFrame.add(submitNewMember());
        addMemberFrame.add(universalmainMenuButtonPanel());


    }

    public void loadingdataMethod() {
        loadingDataFrame.add(universalmainMenuButtonPanel());
        loadingDataFrame.add(headingforloadingData());
        loadingDataFrame.add(firstPanel());
        addingmembersList();


        loadingDataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loadingDataFrame.setSize(800, 800);
        loadingDataFrame.setVisible(true);
        loadingDataFrame.setResizable(false);
        loadingDataFrame.setLayout(null);
        loadingDataFrame.getContentPane().setBackground(new Color(0, 0, 0));


    }

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    public void addingmembersList() {

        try {
            JsonReader reader = new JsonReader(destination);
            if (count == 0) {
                Member c3 = reader.readMember(destination);
                count++;
            }


            JPanel memberlistPanel = new JPanel();
            memberlistPanel.setBackground(new Color(0, 0, 0));
            memberlistPanel.setBounds(0, 300, 800, 600);
            memberlistPanel.setLayout(new BorderLayout());

            for (int i = 0; i < Member.getMembers().size(); i++) {

                JLabel mem = new JLabel();

                mem.setForeground(Color.green);
                mem.setLayout(new BorderLayout());
                mem.setBounds(0, 150 + 40 * i, 800, 50);

                mem.setText(Member.getMembers().get(i).getName() + "      " + Member.getMembers().get(i).getName()
                        + "      " + Member.getMembers().get(i).getDesignation() + "      "
                        + Member.getMembers().get(i).feesIspaid()
                        + "      " + Member.getMembers().get(i).getEmail()
                        + "      " + Member.getMembers().get(i).getTask()
                        + "      " + Member.getMembers().get(i).getTaskStatus());


                memberlistPanel.add(mem);
            }
            loadingDataFrame.add(memberlistPanel);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public JPanel headingforloadingData() {
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 50);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Here is the list ");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 30));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;


    }


    public JTextField getMemberNameUser() {
        memberName.setPreferredSize((new Dimension(250, 40)));
        memberName.setBounds(0, 200, 200, 30);
        memberName.setText("Enter name here");
        return memberName;
    }

    public JPanel submitNewMember() {

        JPanel button1 = new JPanel();
        button1.setBackground(new Color(255, 0, 0));
        button1.setBounds(350, 600, 150, 50);
        button1.setLayout(new BorderLayout());

        submitMemberButton.addActionListener(this);
        submitMemberButton.setText("Submit");
        submitMemberButton.setFocusable(false);
        button1.add(submitMemberButton);
        return button1;


    }


    public JTextField getmemberDesignation() {
        memberDesignationtext.setPreferredSize((new Dimension(250, 40)));
        memberDesignationtext.setBounds(0, 240, 200, 30);
        memberDesignationtext.setText("Enter Designation here");
        return memberDesignationtext;
    }

    public JTextField getmemberTask() {
        memberTask.setPreferredSize((new Dimension(250, 40)));
        memberTask.setBounds(0, 280, 200, 30);
        memberTask.setText("Enter Task here");
        return memberTask;
    }

    public JTextField getmemberTaskComplete() {
        memberTaskComplete.setPreferredSize((new Dimension(250, 40)));
        memberTaskComplete.setBounds(0, 320, 200, 30);
        memberTaskComplete.setText("Task done or not done");
        return memberTaskComplete;
    }

    public JTextField getmemberEmail() {
        memberEmail.setPreferredSize((new Dimension(250, 40)));
        memberEmail.setBounds(0, 360, 200, 30);
        memberEmail.setText("Enter Email here");
        return memberEmail;
    }

    public JTextField getmemberFeesPaid() {
        memberFeesPaid.setPreferredSize((new Dimension(250, 40)));
        memberFeesPaid.setBounds(0, 420, 200, 30);
        memberFeesPaid.setText("Fees paid?  true/false only");
        return memberFeesPaid;
    }


    public JPanel addmemberFrameHeading() {
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 100);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Here You Can ADD A New Member");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 40));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;

    }

    public JPanel memberframeheading() {
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(new Color(0, 0, 0));
        secondPanel.setBounds(0, 80, 800, 100);
        secondPanel.setLayout(new BorderLayout());

        JLabel mainmenu = new JLabel("Member's Menu");
        mainmenu.setFont(new Font("Serif Bold", Font.PLAIN, 60));
        mainmenu.setForeground(new Color(195, 195, 195));
        mainmenu.setHorizontalAlignment((JLabel.CENTER));
        secondPanel.add(mainmenu);

        return secondPanel;


    }


    public JPanel addingNewMemberButton() {

        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 250, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        addingNewMemberButton.setHorizontalAlignment((JLabel.CENTER));
        addingNewMemberButton.addActionListener(this);
        addingNewMemberButton.setText("Add Member");
        addingNewMemberButton.setFocusable(false);
        button1.add(addingNewMemberButton);
        return button1;


    }


    public JPanel printListMemberButton() {

        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 310, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        printListMemberButton.setHorizontalAlignment((JLabel.CENTER));
        printListMemberButton.addActionListener(this);
        printListMemberButton.setText("LOAD MEMBERS");
        printListMemberButton.setFocusable(false);
        button1.add(printListMemberButton);
        return button1;


    }


    public JPanel removingMemberButton() {

        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(300, 370, 150, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        removingMember.setHorizontalAlignment((JLabel.CENTER));
        removingMember.addActionListener(this);
        removingMember.setText("Remove a Member");
        removingMember.setFocusable(false);
        button1.add(removingMember);
        return button1;


    }


    public JPanel universalmainMenuButtonPanel() {

        JPanel button1 = new JPanel();
        button1.setBackground(new Color(0, 0, 0));
        button1.setBounds(690, 30, 100, 50);
        button1.setLayout(new BorderLayout());


//        JButton member = new JButton();
        universalMainMenuButton.setHorizontalAlignment((JLabel.CENTER));
        universalMainMenuButton.addActionListener(this);
        universalMainMenuButton.setText("Main Menu");
        universalMainMenuButton.setFocusable(false);
        button1.add(universalMainMenuButton);
        return button1;


    }


}




