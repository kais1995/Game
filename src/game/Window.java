/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author Kais
 */
public class Window extends Canvas {
    
    public Window(int width, int height, String title, Game game){
        JFrame frame = new JFrame(title); // every frame will refer to the JFRame
        frame.setPreferredSize(new Dimension(width, height)); // setting the preferred sieze of the game
        frame.setMaximumSize(new Dimension(width, height)); // maximum dimensions
        frame.setMinimumSize(new Dimension(width, height)); // minimum dimensions
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit when X is clicked
        frame.setResizable(false); // set resizing of the game to false
        frame.setLocationRelativeTo(null); // game will start in the middle of the screen 
        frame.add(game);
        frame.setVisible(true);
        game.start();
        
        
    }
    
}
