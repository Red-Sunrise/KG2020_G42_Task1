package Proskurin.ja.a;

import Proskurin.ja.a.Drawable.Objects.*;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

// ctrl+o
// alt+insert


public class DrawPanel extends JPanel {

    Color field = new Color(45, 87, 44);
    Color sky = new Color(34, 113, 179);
    Color window = new Color(240, 214, 152);
    Color wall = new Color(219, 133, 57);
    Color treeTrunk = new Color(57, 53, 42);
    Color treeLeaves = new Color(123, 200, 40);
    int width = 140;
    Random random = new Random();

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        Tree tree1 = new Tree(getWidth() / 32, getHeight() / 3, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Tree tree2 = new Tree(7 * getWidth() / 11, getHeight() / 3, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Tree tree3 = new Tree(5 * getWidth() / 6, getHeight() / 3, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Background background = new Background(getWidth(), getHeight(), field, sky);
        Home home = new Home(getWidth(), getHeight(), getWidth() / 3, 5 * getHeight() / 12, 10, window, Color.GRAY, wall);
        Sun sun = new Sun(0, 0, getWidth() / 10, getWidth() / 5, 50, Color.YELLOW);
        Cloud cloud = new Cloud(getWidth() / 4, getHeight() / 50, width, 80);
        background.draw(gr);
        for (int i = 0; i < 10; i++) {
            cloud.setX(getWidth() / 4 + i * width + getWidth()/36);
            cloud.setY(i * random.nextInt(50));
            cloud.draw(gr);
        }
        tree1.draw(gr);
        tree2.draw(gr);
        tree3.draw(gr);
        home.draw(gr);
        sun.draw(gr);
    }
}
