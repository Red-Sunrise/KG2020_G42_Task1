package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Home implements Drawable {
    private int width, height, widthHome, heightHome, indent;
    private Color window, roof, house;

    public Home(int width, int height, int widthHome, int heightHome, int indent, Color window, Color roof, Color wall) {
        this.width = width;
        this.height = height;
        this.widthHome = widthHome;
        this.heightHome = heightHome;
        this.indent = indent;
        this.window = window;
        this.roof = roof;
        this.house = wall;
    }

    public Color getHouse() {
        return house;
    }

    public void setHouse(Color house) {
        this.house = house;
    }

    public Color getRoof() {
        return roof;
    }

    public void setRoof(Color roof) {
        this.roof = roof;
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

    public int getWidthHome() {
        return widthHome;
    }

    public void setWidthHome(int widthHome) {
        this.widthHome = widthHome;
    }

    public int getHeightHome() {
        return heightHome;
    }

    public void setHeightHome(int heightHome) {
        this.heightHome = heightHome;
    }

    public int getIndent() {
        return indent;
    }

    public void setIndent(int indent) {
        this.indent = indent;
    }

    public Color getWindow() {
        return window;
    }

    public void setWindow(Color window) {
        this.window = window;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        drawWall(graphics2D);
        drawWindow(graphics2D);
        drawRoof(graphics2D);
        drawDoor(graphics2D);
    }

    private void drawWindow(Graphics2D graphics2D) {
        int locationWindow = heightHome / 6 - indent;
        //левое
        graphics2D.setColor(window);
        graphics2D.fillRect(width / 4 + widthHome / 8, height / 2 + locationWindow, widthHome / 4, heightHome / 3);
        //правое
        graphics2D.fillRect(width / 4 + 5 * widthHome / 8, height / 2 + locationWindow, widthHome / 4, heightHome / 3);
        graphics2D.setColor(Color.BLACK);
        //левое окно вертикальная и горизонтальная линия
        graphics2D.drawLine(width / 4 + widthHome / 4, height / 2 + locationWindow, width / 4 + widthHome / 4, height / 2 + heightHome / 2 - indent);
        graphics2D.drawLine(width / 4 + widthHome / 8, height / 2 + 2 * locationWindow + indent, width / 4 + 3 * widthHome / 8, height / 2 + 2 * locationWindow + indent);
        //правое окно вертикальная и горизонтальная линия
        graphics2D.drawLine(width / 4 + 3 * widthHome / 4, height / 2 + locationWindow, width / 4 + 3 * widthHome / 4, height / 2 + heightHome / 2 - indent);
        graphics2D.drawLine(width / 4 + 5 * widthHome / 8, height / 2 + 2 * locationWindow + indent, width / 4 + 7 * widthHome / 8, height / 2 + 2 * locationWindow + indent);
        graphics2D.setColor(Color.BLACK);
    }

    private void drawRoof(Graphics2D graphics2D) {
        int[] x = {width / 4, width / 4 + widthHome / 2, width / 4 + widthHome};
        int[] y = {height / 2, height / 2 - heightHome / 2, height / 2};
        int n = 3;
        graphics2D.drawLine(x[0], y[0], x[1], y[1]);
        graphics2D.drawLine(x[2], y[0], x[1], (y[1]));
        Polygon polygon = new Polygon(x, y, n);
        graphics2D.setColor(roof);
        graphics2D.fillPolygon(polygon);
        graphics2D.setColor(Color.BLACK);
    }

    private void drawWall(Graphics2D graphics2D) {
        graphics2D.setColor(house);
        graphics2D.fillRect(width / 4, height / 2, widthHome, heightHome);
        graphics2D.setColor(Color.BLACK);
    }

    private void drawDoor(Graphics2D graphics2D) {
        graphics2D.setColor(new Color(173, 223, 173));
        graphics2D.fillRect(getWidth() / 4 + 3 * widthHome / 8, getHeight() / 2 + heightHome / 2, widthHome / 4, heightHome / 2);

        graphics2D.setColor(new Color(122, 74, 31));
        graphics2D.fillOval(getWidth() / 2 - widthHome / 5, getHeight() / 2 + 3 * heightHome / 4, widthHome / 32, widthHome / 32);

        graphics2D.setColor(Color.BLACK);
    }
}
