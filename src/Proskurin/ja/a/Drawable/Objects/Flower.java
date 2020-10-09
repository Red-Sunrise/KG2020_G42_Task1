package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Flower implements Drawable {
    private int x, y, n, r;
    private Color c;

    public Flower(int x, int y, int n, int r, Color c) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.r = r;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public int getY() {
        return y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawFlower(g);
    }

    private void drawFlower(Graphics2D g) {
        g.setStroke(new BasicStroke(2));
        g.setColor(Color.BLACK);
        g.drawLine(x + r / 2, y, x + r / 2, y + 3 * r);
        double da = 2 * Math.PI / n;
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, r, r);
        g.setStroke(new BasicStroke(1));
        for (int i = 0; i < n; i++) {
            g.setColor(c);
            double dx = r * Math.cos(da * i);
            double dy = r * Math.sin(da * i);
            g.fillOval(x + (int) dx, y + (int) dy, r, r);
            g.setColor(Color.BLACK);
            g.drawOval(x + (int) dx, y + (int) dy, r, r);
        }
    }
}
