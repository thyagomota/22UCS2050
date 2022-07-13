/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - Maze class
 * Your name(s):
 */

import java.awt.*;
import java.util.*;

class Maze implements Drawable {

    private int         size;
    private boolean     cells[][];
    static final int    MIN_SIZE       = 10;
    static final double PERCENT_BLANKS = .75;

    Maze() {
        init(Maze.MIN_SIZE);
    }

    Maze(int size) {
        init(size);
    }

    private void init(int size) {
        if (size < MIN_SIZE)
            this.size = Maze.MIN_SIZE;
        else
            this.size = size;
        this.cells = new boolean[this.size][this.size];
        generate();
    }

    void generate() {
        Random r = new Random();
        for (int x = 0; x < this.size; x++)
            for (int y = 0; y < this.size; y++)
                if (r.nextDouble() > Maze.PERCENT_BLANKS)
                    this.cells[x][y] = true;
        this.cells[0][0] = false;
        this.cells[this.size - 1][this.size - 1] = false;
    }

    boolean isWall(final Location location) {
        if (location.getX() < 0 || location.getX() > this.size - 1)
            return true;
        if (location.getY() < 0 || location.getY() > this.size - 1)
            return true;
        return this.cells[location.getX()][location.getY()];
    }

    @Override
    public String toString() {
        String str = "";
        for (int y = 0; y < this.size; y++) {
            for (int x = 0; x < this.size; x++)
                str += this.cells[x][y] ? "X" : "0";
            str += "\n";
        }
        return str;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        int cellWidth = MazeGUI.WIDTH / size;
        int cellHeight = MazeGUI.HEIGHT / size;
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (cells[x][y])
                    g.fillRect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
            }
        }
    }
}