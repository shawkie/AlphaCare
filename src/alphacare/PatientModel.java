/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;


public class PatientModel {
    //Basic attributes
    private String name;
    private String address;
    private String birthdate;
    private int id;
    
    //record attribute
    private ArrayList record;

    public PatientModel(int identification, String name, String address, String birthdate) {
        this.id = identification;
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
        record = new ArrayList();
        inputRecords();
        
    }
    
    private void inputRecords(){
        JSONParser parser = new JSONParser();
        
        try
        {
            Object obj = parser.parse(new FileReader("Records.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray recordsArray = (JSONArray) jsonObject.get("Records");
            Iterator<String> iterator = recordsArray.iterator();
            
            while(iterator.hasNext())
            {
                record.add(iterator);
            }
           
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
//        
//        record.add(name);
//        record.add(address);
//        record.add(birthdate);
    }
    
    public ArrayList getRecord(){
        return record;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public int getId(){
        return id;
    }
    
    public void setId(int newId){
        this.id = newId;
    }
    
    @Override
    public String toString() {
        return "name: " + name + "address: " + address + "birthdate: " + birthdate ;
    }
    
}
