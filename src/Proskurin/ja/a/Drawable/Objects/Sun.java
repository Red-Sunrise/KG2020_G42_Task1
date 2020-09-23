package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Sun implements Drawable {
    private int x, y, r, R, countRay;
    private Color color;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void set_r(int r) {
        this.r = r;
    }
    public void setR(int R){
        this.R=R;
    }

    public void setCountRay(int countRay) {
        this.countRay = countRay;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int get_r() {
        return r;
    }
    public int getR(){
        return R;
    }

    public int getCountRay() {
        return countRay;
    }

    public Color getColor() {
        return color;
    }

    public Sun(int x, int y, int r, int r1, int countRay, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.countRay = countRay;
        this.color = color;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        graphics2D.setColor(color);
        graphics2D.fillOval(x - r, y - r, r + r, r + r);
        double alpha = 2 * Math.PI / countRay;
        double dx1, dx2, dy1, dy2,angle;
        for (int i = 0; i < countRay; i++) {
            angle=alpha*i;
            dx1 = r * Math.cos(angle);
            dy1 = r * Math.sin(angle);
            dx2 = R * Math.cos(angle);
            dy2 = R * Math.sin(angle);
            graphics2D.setColor(Color.orange);
            graphics2D.drawLine((int) dx1 + x, (int) dy1 + y, (int) dx2 + x, (int) dy2 + y);
        }
    }
}

