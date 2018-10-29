package com.zetcode;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Baggage extends Actor {

    public Baggage(int x, int y) {
        super(x, y);
        
        initBaggage();
    }
    
    private void initBaggage() {
        
        ImageIcon iicon = new ImageIcon("src/resources/baggage.png");
        Image image = iicon.getImage();
        setImage(image);
    }

    public void move(int x, int y) {
        
        int dx = x() + x;
        int dy = y() + y;
        
        setX(dx);
        setY(dy);
    }
}
