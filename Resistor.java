/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author s3kulkar
 */

public class Resistor extends Node {

    private double volt;
   
    static int voltId,resId = 0;
    String type = "";

    public Resistor (String e, double volts, int node1, int node2) {
        super(node1,node2);
        this.type = e;
        this.volt = volts;
       
    }

    public int[] getNodes() {
        int [] nodes = new int[2];
        nodes[0] = this.toInt();
        nodes[1] = this.toInt2();
        return nodes;
        
    }


    @Override
    public String toString() {
           int a=this.toInt();
           int b=this.toInt2();
        if (this.type.equals("v")) {
            if (a<b) {
                volt = (volt - (volt * 2));
            }
            voltId++;
            return (this.type.toUpperCase() + voltId + " " + a + " " + b + " DC " + volt);
        } else {
            resId++;
            return (this.type.toUpperCase() + resId + " " + a + " " + b + " " + volt );
        }
    }
}