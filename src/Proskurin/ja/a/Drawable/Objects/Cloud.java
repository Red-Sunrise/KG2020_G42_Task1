package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Cloud implements Drawable {
    private int x,y,width,height;

    public Cloud(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.setColor(Color.WHITE);
        graphics2D.fillOval(x, y, width, height);
        graphics2D.setColor(Color.BLACK);
        graphics2D.drawOval(x, y, width, height);
    }
}
