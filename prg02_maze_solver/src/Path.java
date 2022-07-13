/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - Path class
 * Your name(s):
 */

import java.awt.*;

class Path implements Drawable {

    private Node<Location> head, tail;
    private Maze           maze;

    public Path(final Maze maze) {
        head = tail = null;
        this.maze = maze;
    }

    // TODO: add the given location at the end of the path
    public void append(Location location) {

    }

    // TODO: return the last location of the path (or null if the path is empty)
    public Location getLast() {
        return null;
    }


    // TODO: return true/false depending whether the last location of the path corresponds to the exit location of the maze; the exit location of the maze is always at (maze's size - 1, maze's size - 1)
    public boolean isAtEnd() {
        return false;
    }

    // TODO: return true/false depending whether it is possible to move left from the last location of the path; note that you can query maze to check if a location is a wall or not
    public boolean canMoveLeft() {
        return false;
    }

    // TODO: return true/false depending whether it is possible to move right from the last location of the path; note that you can query maze to check if a location is a wall or not
    public boolean canMoveRight() {
        return false;
    }

    // TODO: return true/false depending whether it is possible to move up from the last location of the path; note that you can query maze to check if a location is a wall or not
    public boolean canMoveUp() {
        return false;
    }

    // TODO: return true/false depending whether it is possible to move down from the last location of the path; note that you can query maze to check if a location is a wall or not
    public boolean canMoveDown() {
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // TODO: returns true/false depending whether the given location is already in the path
    boolean contains(Location location) {
        return false;
    }

    // TODO: returns a cloned path from the callee path object
    @Override
    public Object clone() {
        return null;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        int cellWidth = MazeGUI.WIDTH / this.maze.getSize();
        int cellHeight = MazeGUI.HEIGHT / this.maze.getSize();
        Node<Location> current = head;
        while (current != null) {
            Location location = current.getValue();
            g.fillRect(location.getX() * cellWidth + 1, location.getY() * cellHeight + 1, cellWidth - 2, cellHeight - 2);
            current = current.getNext();
        }
    }
}
