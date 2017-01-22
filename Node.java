/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author s3kulkar
 */
public class Node {
    private int nId=0;
    private int nId2=0;

    public Node(int a,int b){
        this.nId = a;
        this.nId2= b;
    }
  
    public int toInt(){
        return this.nId;
        
    }
    public int toInt2(){
        return this.nId2;
    }

}