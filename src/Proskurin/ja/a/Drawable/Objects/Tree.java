package Proskurin.ja.a.Drawable.Objects;

import Proskurin.ja.a.Drawable.Drawable;

import java.awt.*;

public class Tree implements Drawable {
    private int xCircle, yCircle,r, heightTree, widthTreeTrunk;
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
        int d, xLeftCornerTree,yTopTree,xMiddleBotTree;
        d = 2 * r;
        xMiddleBotTree = xCircle + r;
        xLeftCornerTree = xMiddleBotTree - (widthTreeTrunk / 2);
        yTopTree = yCircle + d;

        graphics2D.setColor(treeTrunk);
        graphics2D.fillRect(xLeftCornerTree, yTopTree, widthTreeTrunk, heightTree);

        graphics2D.setColor(treeLeaves);
        graphics2D.fillOval(xCircle, yCircle, d, d);

        graphics2D.setColor(Color.BLACK);


    }
}
