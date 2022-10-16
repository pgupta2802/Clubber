package model;

import java.util.ArrayList;

public class Sponsor {
    String name;
    int fundsGiven;
    private ArrayList<Sponsor> sponsors = new ArrayList();

    Sponsor(String name, int fundsGiven) {
        this.name = name;
        this.fundsGiven = fundsGiven;
        addSponsor(this);


    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFundsGiven() {
        return fundsGiven;
    }

    public void setFundsGiven(int fundsGiven) {
        this.fundsGiven = fundsGiven;
    }

    public void addFunds(int funds) {
        this.fundsGiven += funds;
    }

    public void addSponsor(Sponsor s) {
        sponsors.add(s);
    }


}
