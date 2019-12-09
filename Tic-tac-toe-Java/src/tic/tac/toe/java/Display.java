/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.java;

/**
 *
 * @author barcz
 */
public class Display {
    
    private int counter=0;
    
    public void displayOut(int matrixX,int matrixY,int[] matrix){
        counter=0;
        
        
        for (int i=0;i<matrixY;i++){
            for (int j=0;j<matrixX;j++){
                System.out.print(" "+matrix[counter]);
                counter++;
            }
            System.out.println("");
        }
    
    }
    
}
