package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenuFrame extends JFrame implements ActionListener {
    JButton member = new JButton();
    JButton events = new JButton();

    @SuppressWarnings({"checkstyle:MethodLength", "checkstyle:SuppressWarnings"})
    MainMenuFrame() {

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
        member.setHorizontalAlignment((JLabel.CENTER));
        member.addActionListener(this);
        member.setText("Member");
        member.setFocusable(false);
        button1.add(member);


        JPanel button2 = new JPanel();
        button2.setBackground(new Color(0, 0, 0));
        button2.setBounds(300, 450, 150, 50);
        button2.setLayout(new BorderLayout());

//        JButton member = new JButton();
        events.setHorizontalAlignment((JLabel.CENTER));
        events.addActionListener(this);
        events.setText("Events");
        events.setFocusable(false);
        button2.add(events);


//        this.setTitle();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0, 0, 0));

        this.add(secondPanel);
        this.add(firstPanel);
        this.add(button1);
        this.add(button2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == member) {
            System.out.println("member");

        }

        if (e.getSource() == events) {
            System.out.println("events");

        }
    }
}
