package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Background implements Drawable {
    private int width, height;
    private Color field, sky;

    public Background(int width, int height, Color field, Color sky) {
        this.width = width;
        this.height = height;
        this.field = field;
        this.sky = sky;
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

    public Color getField() {
        return field;
    }

    public void setField(Color field) {
        this.field = field;
    }

    public Color getSky() {
        return sky;
    }

    public void setSky(Color sky) {
        this.sky = sky;
    }

    @Override
    public void draw(Graphics2D graphics2D) {

        graphics2D.setColor(field);
        graphics2D.fillRect(0, height * 2 / 3, width, height);

        graphics2D.setColor(sky);
        graphics2D.fillRect(0, 0, width, height * 2 / 3);

        graphics2D.setColor(Color.BLACK);
    }
}
