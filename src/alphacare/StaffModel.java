/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphacare;

/**
 * Model that will hold information on medical staff.
 * @author hamtaro
 */
public class StaffModel {
    private int id;
    private String name;
    private String position;
    
    public StaffModel(int identification, String name, String position) {
        this.id = identification;
        this.name = name;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int newId){
        this.id = newId;
    }
    
    @Override
    public String toString() {
        return "StaffModel{" + "name=" + name + ", position=" + position + '}';
    }
}
