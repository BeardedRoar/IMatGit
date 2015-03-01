package IMat;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joel
 */
public class Main {
    
    public static void main(String[] args){
        final IMatModel model = new IMatModel();
        MainFrame mFrame = new MainFrame(model);
        mFrame.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                model.shutDown();
            }
        });
        mFrame.setVisible(true);
    } //end of main
    
} //end of 

