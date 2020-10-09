package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;
import java.util.Random;

public class Tree implements Drawable {
    private int xCircle, yCircle, r, heightTree, widthTreeTrunk;
    private Color treeTrunk, treeLeaves;

    public Tree(int xCircle, int yCircle, int r, int heightTree, int widthTreeTrunk, Color treeTrunk, Color treeLeaves) {
        this.xCircle = xCircle;
        this.yCircle = yCircle;
        this.r = r;
        this.heightTree = heightTree;
        this.widthTreeTrunk = widthTreeTrunk;
        this.treeTrunk = treeTrunk;
        this.treeLeaves = treeLeaves;
    }

    public Color getTreeTrunk() {
        return treeTrunk;
    }

    public void setTreeTrunk(Color treeTrunk) {
        this.treeTrunk = treeTrunk;
    }

    public Color getTreeLeaves() {
        return treeLeaves;
    }

    public void setTreeLeaves(Color treeLeaves) {
        this.treeLeaves = treeLeaves;
    }

    public int getxCircle() {
        return xCircle;
    }

    public void setxCircle(int xCircle) {
        this.xCircle = xCircle;
    }

    public int getyCircle() {
        return yCircle;
    }

    public void setyCircle(int yCircle) {
        this.yCircle = yCircle;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getHeightTree() {
        return heightTree;
    }

    public void setHeightTree(int heightTree) {
        this.heightTree = heightTree;
    }

    public int getWidthTreeTrunk() {
        return widthTreeTrunk;
    }

    public void setWidthTreeTrunk(int widthTreeTrunk) {
        this.widthTreeTrunk = widthTreeTrunk;
    }

    @Override
    public void draw(Graphics2D graphics2D) {
        int d, xLeftCornerTree, yTopTree, xMiddleBotTree;
        d = 2 * r;
        xMiddleBotTree = xCircle + r;
        xLeftCornerTree = xMiddleBotTree - (widthTreeTrunk / 2);
        yTopTree = yCircle + d;

        graphics2D.setColor(treeTrunk);
        graphics2D.fillRect(xLeftCornerTree, yTopTree, widthTreeTrunk, heightTree);

        graphics2D.setColor(treeLeaves);
        graphics2D.fillOval(xCircle, yCircle, d, d);

        graphics2D.setColor(Color.BLACK);
        graphics2D.drawRect(xLeftCornerTree, yTopTree, widthTreeTrunk, heightTree);

        graphics2D.drawOval(xCircle, yCircle, d, d);
        //graphics2D.drawOval(xCircle + r / 2, yCircle + r / 2, r, r);
        //graphics2D.drawOval(xCircle + 3 * r / 4, yCircle + 3 * r / 4, r / 2, r / 2);
        drawApple(graphics2D);

    }

    private void drawApple(Graphics2D graphics2D) {
        int xMiddleBotTree = xCircle + r;
        int n = 20;
        double da =2 * Math.PI / n;
        spawnApples(graphics2D,da,xMiddleBotTree,n,r/1.3);
        spawnApples(graphics2D,da,xMiddleBotTree,n, r/2.1);
        spawnApples(graphics2D,da,xMiddleBotTree,n, r/3.1);
        }

    private void spawnApples(Graphics2D graphics2D,double da,int xMiddleBotTree,int n, double r){
        Random random=new Random();
        for (int i = 0; i < n; i++) {
            double dx = r * Math.cos(da * i)+random.nextInt(10);
            double dy = r * Math.sin(da * i)+random.nextInt(10);
            graphics2D.setColor(Color.RED);
            graphics2D.fillOval(xMiddleBotTree + (int) dx, yCircle+this.r + (int) dy, this.r / 8, this.r / 8);
            graphics2D.setColor(Color.BLACK);
            graphics2D.drawOval(xMiddleBotTree + (int) dx, yCircle+this.r + (int) dy, this.r / 8, this.r / 8);
        }
    }
}
