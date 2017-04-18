/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import interfaces.Inicial;

/**
 *
 * @author Sandersoon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score=0;
        Inicial ini = new Inicial(score);
        ini.setLocationRelativeTo(null);
        ini.setResizable(false);
        ini.setVisible(true);
    }
    
    
    public static void run(int score) {
        Inicial ini = new Inicial(score);
        ini.setLocationRelativeTo(null);
        ini.setResizable(false);
        ini.setVisible(true);
    }
}
