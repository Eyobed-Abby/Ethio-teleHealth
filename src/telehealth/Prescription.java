/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import java.util.Date;

/**
 *
 * @author Eyobed
 */
public class Prescription{
    private Date date;
    private String name, PatientID, physicianID;
    
    public Prescription(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getPhysicianID() {
        return physicianID;
    }

    public void setPhysicianID(String physicianID) {
        this.physicianID = physicianID;
    }
    
   //a method to print the details of the dr. priscription
    

}
