package model;

import java.util.ArrayList;

//
public class Sponsor {
    String name;
    int fundsGiven;
    static ArrayList<Sponsor> sponsors = new ArrayList();

    public Sponsor(String name, int fundsGiven) {
        this.name = name;
        this.fundsGiven = fundsGiven;
        addSponsor(this);


    }


    public String getName() {
        return this.name;
    }

    public int getFundsGiven() {
        return fundsGiven;
    }

    public void addFunds(int funds) {
        this.fundsGiven += funds;
    }

    //Array Methods
    public void addSponsor(Sponsor s) {
        sponsors.add(s);
    }

    public static String sponsorList() {
        String sponsor1 = "";
        for (int i = 0; i < sponsors.size(); i++) {
            sponsor1 += sponsors.get(i).getName() + " " + sponsors.get(i).getFundsGiven();

        }
        return sponsor1;


    }

    public static void removemySponsor(String name) {
        for (int i = 0; i < sponsors.size(); i++) {
            if (sponsors.get(i).getName().equals(name)) {
                sponsors.remove(i);
            }
            System.out.println("Sponsor " + name + " removed successfully");
        }
    }

    public static int sponsorfunds() {
        int funds = 0;
        for (int i = 0; i < sponsors.size(); i++) {
            funds += sponsors.get(i).getFundsGiven();
        }
        return funds;
    }


}
