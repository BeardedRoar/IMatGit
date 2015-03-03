/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 * Use this class to reset the handler, good for testing.
 * 
 * @author Joel
 */
public class HandlerReset {
    
    /**
     * Main method, does the cleaning.
     * 
     * @param args 
     */
    public static void main(String args[]){
        IMatDataHandler handler = IMatDataHandler.getInstance();
        handler.reset();
        handler.resetFirstRun();
        handler.shutDown();
    }
}
