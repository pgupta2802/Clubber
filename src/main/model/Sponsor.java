package model;

import java.util.ArrayList;

//requires:
public class Sponsor {
    static ArrayList<Sponsor> sponsors = new ArrayList();
    private final String name;
    private int fundsGiven;

    //requires:String name , funds given
    //Effects : instaniates a new Sponsor with the given fields
    public Sponsor(String name, int fundsGiven) {
        this.name = name;
        this.fundsGiven = fundsGiven;
        addSponsor(this);


    }

    //Effects: returns a list of all the sponsors
    public static String sponsorList() {
        String sponsor1 = "";
        for (int i = 0; i < sponsors.size(); i++) {
            sponsor1 += sponsors.get(i).getName() + " " + sponsors.get(i).getFundsGiven();

        }
        return sponsor1;


    }

    //Effects - Removes the given Sponsor
    public static void removemySponsor(String name) {
        for (int i = 0; i < sponsors.size(); i++) {
            if (sponsors.get(i).getName().equals(name)) {
                sponsors.remove(i);
            }

        }
    }

    //Effects:
    public static int sponsorfunds() {
        int funds = 0;
        for (int i = 0; i < sponsors.size(); i++) {
            funds += sponsors.get(i).getFundsGiven();
        }
        return funds;
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


}
