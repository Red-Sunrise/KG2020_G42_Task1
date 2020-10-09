package Proskurin.ja.a;

import Proskurin.ja.a.Drawable.Drawable;
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
        Tree tree1 = new Tree(getWidth() / 32, 2*getHeight() / 7, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Tree tree2 = new Tree(7 * getWidth() / 11, 2*getHeight() / 7, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Tree tree3 = new Tree(5 * getWidth() / 6, 2*getHeight() / 7, getWidth() / 12, getHeight() / 4, getWidth() / 64, treeTrunk, treeLeaves);
        Background background = new Background(getWidth(), getHeight(), field, sky);
        Home home = new Home((int)(getWidth()*0.9), (int)(getHeight()*0.9), getWidth() / 3, 5 * getHeight() / 13, 10, window, Color.GRAY, wall);
        Sun sun = new Sun(0, 0, getWidth() / 10, getWidth() / 5, 50, Color.YELLOW);
        Cloud cloud = new Cloud(getWidth() / 4, getHeight() / 50, getWidth() / 9, getHeight() / 9);
        Road road = new Road(0,getHeight()-(int)(getHeight()/7.2),(int)(getHeight()/7.2),getWidth());

        background.draw(gr);
        for (int i = 0; i < 30; i++) {
            cloud.setX(getWidth() / 4 + random.nextInt(50) + i / 2 * width + getWidth() / 36);
            cloud.setY(i / 2 * random.nextInt(50));
            while (true) {
                if (cloud.getY() > getHeight() / 3) {
                    cloud.setY(getHeight() / 50 * random.nextInt(25) + i * random.nextInt(20));
                } else break;
            }
            while (true) {
                if (cloud.getX() > getWidth()) {
                    cloud.setX(getWidth() / 4 * random.nextInt(60)+getWidth()/18+i*5);
                    cloud.setY(getHeight()/40+random.nextInt(100)/2*random.nextInt(5));
                }
                else break;
                    }
            cloud.draw(gr);
            }
        int c;
        Flower flowers1=new Flower(5 * getWidth() / 6,(int)(getHeight()/1.44),8,10,Color.white);
        int flower1x=5 * getWidth() / 6;
        int flowers1y=(int)(getHeight()/1.44);
        for(int i =1; i<=100;i++){
            c=random.nextInt(0xFFFFFF);
            flowers1.setC(new Color(c));
            flowers1.draw(gr);
            if(i % 2 == 0){
                flowers1.setX(flower1x + random.nextInt(getWidth()/6));
                flowers1.setY(flowers1y + random.nextInt(getHeight()/7));
            }
            else{
                flowers1.setX(flower1x - random.nextInt(getWidth()/4));
                flowers1.setY(flowers1y - random.nextInt());
            }
            if(flowers1.getY() >=(int)(getHeight()/1.24)){
                flowers1.setY(flowers1y + random.nextInt(getHeight()/7));
            }
        }
        Flower flowers2=new Flower(5 * getWidth() / 6,(int)(getHeight()/1.44),8,10,Color.white);
        int flower2x=getWidth()/28;
        int flowers2y=(int)(getHeight()/1.44);
        for(int i =1; i<=100;i++){
            c=random.nextInt(0xFFFFFF);
            flowers2.setC(new Color(c));
            flowers2.draw(gr);
            if(i % 2 == 0){
                flowers2.setX(flower2x + random.nextInt(getWidth()/6));
                flowers2.setY(flowers2y + random.nextInt(getHeight()/7));
            }
            else{
                flowers2.setX(flower2x - random.nextInt(getWidth()/10));
                flowers2.setY(flowers2y - random.nextInt());
            }
            if(flowers2.getY() >=(int)(getHeight()/1.24)){
                flowers2.setY(flowers2y + random.nextInt(getHeight()/7));
            }
        }
        tree1.draw(gr);
        tree2.draw(gr);
        tree3.draw(gr);
        home.draw(gr);
        sun.draw(gr);
        road.draw(gr);

    }
}
