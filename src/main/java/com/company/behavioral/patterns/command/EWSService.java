package com.company.behavioral.patterns.command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// This class is the receiver.
public class EWSService {

    private final List<String> members = new ArrayList<String>();
    private final HashMap<String, List<String>> mailingList = new HashMap<>();

    // Add a new member to mailing list.
    public void addMember(String emailAddress, String listName){
        if (!mailingList.containsKey(listName)){
            mailingList.put(listName, new ArrayList<>());
        }
        mailingList.get(listName).add(emailAddress);

        System.out.println("Added " + emailAddress + " to " + listName);
    }

    public void sendEmail(String[] mailingList, String content){

    }

    // Remove member from mailing list.
    public void removeMember(String emailAddress, String listName){

        if (mailingList.containsKey(listName)) {
            members.remove(emailAddress);
            System.out.println("Removed " + emailAddress + " from" + listName);
        }
        else {
            throw new IllegalArgumentException("There is no '" + listName + "' mailing list.");
        }
    }

    public void sendForLater(){

    }
}
