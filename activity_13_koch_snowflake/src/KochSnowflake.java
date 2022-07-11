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

        // TODO: finish implementation according to instructions

    }

    // TODO: implement helper method according to instructions
    private void drawLine(Graphics g) {

    }

    // TODO: implement helper method according to instructions
    private void rotate(int degrees) {
    }

    // TODO: implement drawCurve according to instructions
    private void drawCurve(Graphics g, int depth) {

    }

    // TODO: implement drawSnowflake according to instructions
    private void drawSnowflake(Graphics g) {

    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        drawSnowflake(g);
        //drawCurve(g, depth);
    }
}