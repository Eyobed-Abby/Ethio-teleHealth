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
public class User {
    protected String name;
    protected int age;
    protected String gender;
    protected String password;
    protected static ArrayList<Patient> patients = new ArrayList();
    protected static ArrayList<Physician> physicians = new ArrayList();
    private boolean isPhysician, isPatient;
    
    public static Patient getPatient(String ID){
        for(int i = 0; i < patients.size(); i++){
            if(patients.get(i).getId().equals(ID)){
                return patients.get(i);
            }
        }
        return null;
    }
    
    public static Physician getPhysician(String ID){
        for(int i = 0; i < physicians.size(); i++){
            if(physicians.get(i).getId().equals(ID)){
                return physicians.get(i);
            }
    }
        return null;}
    
    public static Patient getPatinetUsingName(String name){
         for(int i = 0; i < patients.size(); i++){
            if(patients.get(i).getName().equals(name)){
                return patients.get(i);
            }
        }
         return null;
    }
    public static Physician getPhysicianUsingName(String name){
         for(int i = 0; i < physicians.size(); i++){
            if(physicians.get(i).getName().equals(name)){
                return physicians.get(i);
            }
        }
         return null;
    }
    
//    public abstract void setName(String name);
//    public abstract void setAge(int age);
//    public abstract boolean login(String id, String password);
//    public abstract boolean resetPassword(String newPassword, String confirmPassword);
    
}
