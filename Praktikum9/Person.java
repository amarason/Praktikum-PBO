/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
public class Person {
    public String name;
    private int id;
    
    public Person(String n){
        this.name = n;
    }
    
    public Person(int i, String n){
        id = i;
        name = n;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
}