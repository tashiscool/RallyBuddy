/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tash
 */
public class Tasks {
    public Double Estimate;
    public Double Actuals;
    public String State;
    public String Name;
    public String WorkProduct;
    public String TA;
    public Long id;
    public String Description;
    
    public String toString()
    {
        return Name;
    }
}
