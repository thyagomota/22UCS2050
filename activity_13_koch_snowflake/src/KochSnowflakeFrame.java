/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 13 - KochSnowflakeFrame class
 */

import javax.swing.*;
import java.awt.*;

public class KochSnowflakeFrame extends JFrame {

    static final int WIDTH  = 1024;
    static final int HEIGHT = 600;

    KochSnowflakeFrame(int xStart, int yStart, int depth, double size, Color color) {
        setSize(WIDTH, HEIGHT);
        setTitle("Kock Snowflake");
        setContentPane(new KochSnowflake(xStart, yStart, depth, size, color));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KochSnowflakeFrame(300, 420, 3, 18, Color.BLACK);
        //new KochSnowflakeFrame(20, 20, 3, 20, Color.BLACK);
    }

}