/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telehealth;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Eyobed
 */
public class HealthRecord {

    private LocalDate date;
    private ArrayList<String> symptom = new ArrayList();
    private ArrayList<String> medication = new ArrayList();
    private String patientName;
    private String physicianName;

    public HealthRecord(LocalDate date, String patientName) {
        this.date = date;
        this.patientName = patientName;
        this.physicianName = physicianName;
    }
    
    public void addSymptom(String symptom){
        this.symptom.add(symptom);
    }

    public void setPhysicianName(String physicianName) {
        this.physicianName = physicianName;
    }
    
    public void addMedications(String medications){
        this.medication.add(medications);
    }

    public LocalDate getDate() {
        return date;
    }

    public ArrayList<String> getSymptom() {
        return symptom;
    }

    public ArrayList<String> getMedication() {
        return medication;
    }
    
    
    
    
    
    
   
    
    

}
