/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
/**
 *
 * @author kusur
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Hello");
        b.setBounds(130,100,100,40);
        
        f.add(b);
        
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
    
}
