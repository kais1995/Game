/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;



public class Player extends GameObject{
    
    Random r = new Random();
    
    
    public Player(int x, int y, ID id) {
        super(x, y, id);


    }
    
    public void tick(){
        x += velX;
        y += velY;
    }
    
    public void render(Graphics g){ //the box in the game
        if (id == ID.Player) g.setColor(Color.white);
        else if (id == ID.Player2) g.setColor(Color.blue);
        g.fillRect(x, y, 32, 32);
        
    }
    
    
}
