/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author s3kulkar
 */
import java.util.Scanner;
public class UserMain {
//public ArrayList<Resistor> Resistor = new ArrayList<>();
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    AnalogCircuit cir = AnalogCircuit.getInstance();
    
      System.out.println("Enter the amount of resistor");
        
    while(true){
        //Creates a string and splits it in an array.
        String indata = in.nextLine();
        String parts[] = indata.split(" ");
        
        //Checks for voltage.
        if(parts[0].equals("v")){
            double voltmag = Double.parseDouble(parts[3]);
            int voltn1 = Integer.parseInt(parts[1]);
            int voltn2 = Integer.parseInt(parts[2]);
            Resistor c = new Resistor("v",voltmag, voltn1, voltn2);
            cir.add(c);
        }else if(parts[0].equals("r")){
            //Checks for resistor.
            double resmag = Double.parseDouble(parts[3]);
            int resistn1 = Integer.parseInt(parts[1]);
            int resistn2 = Integer.parseInt(parts[2]);
            Resistor c = new Resistor("r",resmag, resistn1, resistn2);
            cir.add(c);
        }else if(parts[0].equals("spice")){
            //Spice function
            System.out.println(cir.toString());
        }else if(parts[0].equals("end")){
            //End function
            System.out.println("All Done!");
            break;
        }
        
    }
        
        
}}
