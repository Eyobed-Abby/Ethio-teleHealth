/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import java.util.ArrayList;

/**
 *
 * @author Eyobed
 */
public class Patient extends User {

    private String language, picture_location;
    public static int General_ID;
    private String id;
    private String sympotoms;
    private ArrayList<HealthRecord> healthRecord = new ArrayList();

    
    public Patient(String password) {
        id = "PT" + General_ID;
        this.password = password;
        General_ID++;
    }

    public Patient(String name, String gender, int age) {
//        this.password = password;
        this.setName(name);
        this.gender = gender;
        setAge(age);
        id = "PT" + General_ID;
        General_ID++;
    }

    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPicture_location() {
        return picture_location;
    }

    public void setPicture_location(String picture_location) {
        this.picture_location = picture_location;
    }

    public int getAge() {
        return age;
    }

  
    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getPassword(){
        return this.password;
    }

    
    public boolean resetPassword(String newPassword, String confirmPassword){
        if(newPassword.equals(confirmPassword)){
            this.password = newPassword;
            return true;
        }
        return false;
    }
    
    
    public boolean login(String id, String password) {
        for (Patient p : patients) {
            if(p.id.equals(id) && p.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public ArrayList<HealthRecord> getHealthRecord() {
        return healthRecord;
    }

    public void setHealthRecord(ArrayList<HealthRecord> healthRecord) {
        this.healthRecord = healthRecord;
    }

    
}
