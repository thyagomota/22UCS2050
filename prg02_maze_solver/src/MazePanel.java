/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - MazePanel class
 * Your name(s):
 */

import javax.swing.*;
import java.awt.*;

class MazePanel extends JPanel {

    private MazeGUI gui;

    MazePanel(final MazeGUI gui) {
        this.gui = gui;
    }

    @Override
    public void paintComponent(Graphics g) {
        // draw maze
        Maze maze = this.gui.getMaze();
        maze.draw(g);

        // draw path
        Path path = this.gui.getPath();
        if (path != null)
            path.draw(g);
    }
}