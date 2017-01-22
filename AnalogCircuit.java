/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author s3kulkar
 */
import java.util.Scanner;
import java.util.ArrayList;

public class AnalogCircuit {

    private static AnalogCircuit instance = null;
    
    ArrayList<Resistor> res;
    
    public static AnalogCircuit getInstance() {
        if (instance == null) {
            instance = new AnalogCircuit();
        }
        return instance;
    }

    private AnalogCircuit() {
       res=new ArrayList<Resistor>();
    }

    public void add(Resistor r) {
        res.add(r);
    }
    
    
    public int length(){
        return res.size();
    }

    @Override
    public String toString() {
    String allres = "";
    
    for(int j=0; j<res.size();j++){
        if(res.size() == j+1){
            allres = allres + (res.get(j).toString() );
        }else{
            allres = allres + (res.get(j).toString() + "\n");
        }
        
    }
    return allres;
    }
}
