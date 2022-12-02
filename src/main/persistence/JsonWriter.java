package persistence;

import model.Events;
import model.Member;
import model.Sponsor;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//This class is used to write the data on console using json
//It creates three separate files of JSON
public class JsonWriter {

    public static final int tab = 4;
    private static PrintWriter fileWriter;
    private static String destination;


    public JsonWriter(String destination) {

        JsonWriter.destination = destination;
    }

    //Effects: opens the fileWriter
    public static void open() throws FileNotFoundException {
        fileWriter = new PrintWriter(new File(destination));

    }

    //Effects: opens to write the sponsor class
    public static void writeSponsor() {
        JSONObject json = Sponsor.toJson();
        saveToFile(json.toString(tab));


    }
//Effects: writes the members in json file

    public static void writeMembers() {

        JSONObject json = Member.toJson();
        saveToFile(json.toString(tab));

    }
//Effects: writes the events in json

    public static void writeEvents() {

        JSONObject json = Events.toJson();
        saveToFile(json.toString(tab));

    }
//Effects: closes the file writer

    public static void close() {
        fileWriter.close();
    }

    //Effects : saves the data to the files
    private static void saveToFile(String json) {
        fileWriter.print(json);


    }


}
