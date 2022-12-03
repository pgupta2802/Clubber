package model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

//This class creates sponsors with their name and the amount of funds given
//This also creates an array of all the sponsors
public class Sponsor extends JSONObject {
    static ArrayList<Sponsor> sponsors = new ArrayList();
    private static int counts = 0;
    private final String name;
    private final String description = "Sponsor was created";
    private int fundsGiven;

    //requires:String name , funds given
    //Effects : instantiates a new Sponsor with the given fields
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

    //Effects: Adds sponsor funds to the total funds, gives the total number of funds
    public static int sponsorfunds() {
        int funds = 0;
        for (int i = 0; i < sponsors.size(); i++) {
            funds += sponsors.get(i).getFundsGiven();
        }
        return funds;
    }

    public static ArrayList<Sponsor> getSponsors() {
        return sponsors;

    }

    public static void changecount() {
        counts = 1;
    }

    //JSON Methods
    public static JSONObject toJson() {
        JSONObject sponsorData = new JSONObject();
        sponsorData.put("Sponsors", sponsorsToJson());

        return sponsorData;


    }


    // EFFECTS: returns things in this workroom as a JSON array
    private static JSONArray sponsorsToJson() {
        JSONArray jsonArray = new JSONArray();

        for (Sponsor t : getSponsors()) {
            jsonArray.put(t.spontoJson());
        }

        return jsonArray;
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
        if (counts == 1) {
            Event event1 = new Event("Sponsor was added");
            EventLog.getInstance().logEvent(event1);

        }

    }

    private JSONObject spontoJson() {
        JSONObject json = new JSONObject();
        json.put("name", getName());
        json.put("Funds", getFundsGiven());
        return json;
    }


}
