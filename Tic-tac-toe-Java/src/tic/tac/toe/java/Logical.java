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
public class Logical {
    
    GameAI game = new GameAI();
    
    
    public void run(){
     game.createMatrix();
     game.playerStep();
    }
    
}
