package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Road implements Drawable {
    int x;
    int y;
    int rowH;
    int length;


    public Road(int x, int y, int rowH, int length) {
        this.x = x;
        this.y = y;
        this.rowH = rowH;
        this.length = length;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.GRAY);
        g.fillRect(x,y,length,rowH);
        g.setColor(Color.white);
        for (int i = 0; i * 15 < length; i++) {
            if ( i % 2 ==0){
                g.fillRect(x + 15 * i,y+(rowH/2) -3,20,6);
            }
        }

    }
}
