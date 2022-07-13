/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 13 - KochSnowflake class
 */

import javax.swing.*;
import java.awt.*;

public class KochSnowflake extends JPanel {

    private int    depth;
    private double size;
    private int    xPixel, yPixel;
    private double direction; // remember: this value is in degrees (not radians!)
    private Color  color;

    static final int    MIN_DEPTH     = 0;
    static final double MIN_SIZE     = 10;

    KochSnowflake(int xPixel, int yPixel, int depth, double size, Color color) {
        super();

        // TODOd: finish implementation according to instructions
        this.xPixel = xPixel;
        this.yPixel = yPixel;
        this.depth = depth;
        this.size = size;
    }

    // TODOd: implement helper method according to instructions
    private void drawLine(Graphics g) {
        int xPixelNew = (int) Math.round(xPixel + Math.cos(Math.toRadians(direction)) * size);
        int yPixelNew = (int) Math.round(yPixel + Math.sin(Math.toRadians(direction)) * size);
        g.drawLine(xPixel, yPixel, xPixelNew, yPixelNew);
        xPixel = xPixelNew;
        yPixel = yPixelNew;
    }

    // TODOd: implement helper method according to instructions
    private void rotate(int degrees) {
        direction += degrees;
    }

    // TODO: implement drawCurve according to instructions
    private void drawCurve(Graphics g, int depth) {
        if (depth == 0)
            drawLine(g);
        else {
            drawCurve(g, depth - 1);
            rotate(60);
            drawCurve(g, depth - 1);
            rotate(-120);
            drawCurve(g, depth - 1);
            rotate(60);
            drawCurve(g, depth - 1);
        }
    }

    // TODO: implement drawSnowflake according to instructions
    private void drawSnowflake(Graphics g) {
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        drawSnowflake(g);
        //drawCurve(g, depth);
    }
}