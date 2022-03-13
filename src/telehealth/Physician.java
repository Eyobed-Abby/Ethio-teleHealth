/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import java.time.LocalDate;

/**
 *
 * @author Eyobed
 */
public class Physician extends User {

    public static int General_ID;
    private String id;

    public Physician(String password) {
        this.password = password;
        id = "PH" + General_ID;
        General_ID++;
    }

    public Physician(String name, String gender,String password) {
        this.password = password;
        this.name = name;
        
        this.gender = gender;
        id = "PH" + General_ID;
        General_ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void updateHealthRecord(String patientID, LocalDate date, String symptoms, String medications){
        Patient pt = null;
        for(Patient p: this.patients){
           if(p.getId().equals(patientID)){
               pt = p;
               break;
           } 
        }
        
        HealthRecord newRecord = new HealthRecord(date, pt.getName());
        newRecord.addSymptom(symptoms);
        newRecord.addMedications(medications);
        
        pt.getHealthRecord().add(newRecord);
    }

    public String getId() {
        return id;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    
}
