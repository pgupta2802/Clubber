package persistence;

import model.Events;
import model.Member;
import model.Sponsor;
import org.json.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class JsonWriter {

    public static final int tab = 4;
    private static PrintWriter fileWriter;
    private static String destination;


    public JsonWriter(String destination) {

        this.destination = destination;
    }

    public static void open() throws FileNotFoundException {
        fileWriter = new PrintWriter(new File(destination));

    }

//    public static void write() {
//
//        JSONObject json = Sponsor.toJson();
//        saveToFile(json.toString(tab));
//
//    }

    public static void writeSponsor() {
        JSONObject json = Sponsor.toJson();
        saveToFile(json.toString(tab));


    }

    public static void writeMembers() {

        JSONObject json = Member.toJson();
        saveToFile(json.toString(tab));

    }

    public static void writeEvents() {

        JSONObject json = Events.toJson();
        saveToFile(json.toString(tab));

    }

    public static void close() {
        fileWriter.close();
    }

    private static void saveToFile(String json) {
        fileWriter.print(json);


    }


}
