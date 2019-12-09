/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe.java;

import java.util.Scanner;

/**
 *
 * @author barcz
 */
public class GameAI {
    
    private int matrixX = 3;
    private int matrixY =3;
    private int[] matrix = {1,2,3,4,5,6,7,8,9};
    private int pickupN;
    
    Display display = new Display();
    
    public void createMatrix(){
    display.displayOut(matrixX,matrixY,matrix);
    }
    
    public void playerStep(){
        Scanner s = new Scanner(System.in);
        System.out.println("Pick a number: ");
        pickupN = s.nextInt();
        setupMatrix(pickupN);
        display.displayOut(matrixX, matrixY, matrix);
    }
    
    private void setupMatrix(int pickupN){
        
        matrix[pickupN-1] = 0;
       
    }
    
    
}
