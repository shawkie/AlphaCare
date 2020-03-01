/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;


public class PatientModel {
    //Basic attributes
    private String name;
    private String address;
    private String birthdate;
    
    //record attribute
    private String[] record;

    public PatientModel(String name, String address, String birthdate) {
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
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

    @Override
    public String toString() {
        return "PatientModel{" + "name=" + name + ", address=" + address + ", birthdate=" + birthdate + '}';
    }
    
}
