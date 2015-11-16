/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Scott
 */
public class MailingListFileReader {
    public static void main(String[] args) throws IOException {
        
       
        File data = new File(File.separatorChar + "temp" + File.separatorChar + "practice.txt");
        if (data.exists()){
        List<Contact> contacts = new ArrayList<>();
        int counter = 0;
        BufferedReader in = null;
        Contact temp = new Contact();
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            
            while (line != null) {
                
                //This only works with the specific format given in the file.
                if(counter==0){
                    temp = new Contact();
                    String[] lineParts = line.split(" ");
                    temp.setFirstName(lineParts[0]);
                    temp.setLastName(lineParts[1]);
                    line = in.readLine();
                    counter++;
                } else if (counter==1) {
                    temp.setStreetAddress(line);
                    line = in.readLine();
                    counter++;
                } else if (counter==2) {
                    String[] lineParts = line.split(" ");
                    temp.setCity(lineParts[0]);
                    temp.setState(lineParts[1]);
                    temp.setZipCode(lineParts[2]);
                    line = in.readLine();
                    counter++;
                    contacts.add(temp);
                    counter = 0;

                }
                        
            }

        } catch (IOException ioe) {
            System.out.println("We have a problem! Cannot read this file.");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Could not close the stream.");
            }
        }
        
        Set <Contact>contactSet = new <Contact>HashSet(contacts);
        contacts = new ArrayList(contactSet);
        
            for (Contact contact : contacts) {
                System.out.println(contact.toString());
            }
        
        //Second Records City
        System.out.println(contacts.get(1).FirstName + " " + contacts.get(1).LastName + " " + "State : " + contacts.get(1).State);
    
    } else {
            System.out.println("File not found: practice.txt");
        }
    }
}