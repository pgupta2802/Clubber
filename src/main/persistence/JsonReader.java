package persistence;

import model.Events;
import model.Member;
import model.Sponsor;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

//This class is used to read files
//this files uses the pre existing json files and reads them
public class JsonReader {


    private String source;

    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    //Effects: Starts reading the sponsor
    public Sponsor readSponsor(String s) throws Exception {
        String jsondata = readSponsorFile(source);
        JSONObject jsonObject = new JSONObject(jsondata);
        return parseSponsor(jsonObject);

    }

    //Effects: returns the content of the file in string
    private String readSponsorFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

    //Effects: parses the sponsor
    private Sponsor parseSponsor(JSONObject jsonObject) throws Exception {
        JSONObject json = new JSONObject();
        json = jsonObject;
        addSponsors(json);
        return null;

    }

    //Effects:add the sponsors in the array
    private Sponsor addSponsors(JSONObject jsonObject) throws Exception {
        JSONArray jsonArray = jsonObject.getJSONArray("Sponsors");
        for (Object json : jsonArray) {
            JSONObject nextSponsor = (JSONObject) json;
            addSponsorToList(nextSponsor);
        }
        return null;
    }

    //Effects: helps in adding the sponsors
    private void addSponsorToList(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        int funds = jsonObject.getInt("Funds");
        Sponsor newSponsor = new Sponsor(name, funds);
    }

    //Effects: reads the member
    public Member readMember(String s) throws Exception {
        String jsondata = readMemberFile(source);
        JSONObject jsonObject = new JSONObject(jsondata);
        return parseMember(jsonObject);

    }

    //Effects: reads the member file
    private String readMemberFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

    //Effects: parses the member file
    private Member parseMember(JSONObject jsonObject) throws Exception {
        JSONObject json = new JSONObject();
        json = jsonObject;
        addMembers(json);
        return null;
    }

    //Effects: adds the member as a json object
    private Sponsor addMembers(JSONObject jsonObject) throws Exception {
        JSONArray jsonArray = jsonObject.getJSONArray("Members");
        for (Object json : jsonArray) {
            JSONObject nextMember = (JSONObject) json;
            addMembersToList(nextMember);
        }
        return null;
    }

    //adds the members to the list
    private void addMembersToList(JSONObject jsonObject) throws Exception {
        String designation = jsonObject.getString("Designation");
        boolean feesPaid = jsonObject.getBoolean("FeesPaid");
        String task = jsonObject.getString("Task");
        String taskComplete = jsonObject.getString("Task_Complete");
        String email = jsonObject.getString("Email");
        String name = jsonObject.getString("name");
        Member newMember = new Member(name, designation, feesPaid, task, taskComplete, email);


    }

    //Effects: used to read the events
    public Events readEvents(String s) throws Exception {
        String jsondata = readEventsFile(source);
        JSONObject jsonObject = new JSONObject(jsondata);
        return parseEvents(jsonObject);

    }

    //Effects: used to read events as a file
    private String readEventsFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

    //Effects: adds the events as a parse
    private Events parseEvents(JSONObject jsonObject) throws Exception {
        JSONObject json = new JSONObject();
        json = jsonObject;
        addEvents(json);
        return null;

    }

    //Effects: adds the events to the list
    private void addEventsToList(JSONObject jsonObject) throws Exception {
        String name = jsonObject.getString("name");
        String date = jsonObject.getString("Date");
        Events newEvent = new Events(name, date);
    }

    //Effects:adds the events
    private Events addEvents(JSONObject jsonObject) throws Exception {
        JSONArray jsonArray = jsonObject.getJSONArray("Events");
        for (Object json : jsonArray) {
            JSONObject nextEvent = (JSONObject) json;
            addEventsToList(nextEvent);
        }
        return null;
    }


}




