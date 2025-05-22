/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ACER
 */
public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO personDAO){
        this.personDAO = personDAO;
    }
    
    public PersonDAO getPersonDAO(){
        return this.personDAO;
    }
}
