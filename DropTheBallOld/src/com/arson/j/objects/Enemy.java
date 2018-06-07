package com.arson.j.objects;



//this pulls our positioning from the class with the extends
import com.arson.j.GlobalPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Enemy extends GlobalPosition {

    private String enemyimage = "/images/enemyimage.png";


    int velX = 0;
    int velY = 0;


//click the light bulb to auto-create a constructor

    public Enemy(int x, int y) {
        super(x, y);
    }

    public void update() {

        if(x<0){
            x=0;
        }
        if (y<0){
            y=0;
        }
        if (x>930){
            x=930;
        }
        if (y>595){
            y=595;
        }


    }

    public void draw (Graphics2D g2d){

        g2d.drawImage(getEnemyImage(), x, y, null);

    }

    public Image getEnemyImage () {

        ImageIcon i = new ImageIcon(getClass().getResource(enemyimage));
        return i.getImage();

    }
}


