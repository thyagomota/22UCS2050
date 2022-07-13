/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - MazeSolver class
 * Your name(s):
 */

class MazeSolver {

    private Maze maze;
    private MazeGUI gui;

    MazeSolver(int size) {
        this.maze = new Maze(size);
        this.gui = new MazeGUI(maze);
    }

    void repaint(Path path) {
        gui.setPath(path);
        gui.repaint();
        try {
            Thread.sleep(50);
        } catch (Exception ex) {

        }
    }

    // TODO: implement the exhaustive search algorithm to find a solution to the maze puzzle
    private Path solve() throws CloneNotSupportedException {
        return null;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MazeSolver mazeSolver = new MazeSolver(50);
        Path path = mazeSolver.solve();
        if (path != null) {
            System.out.println("Found a solution!");
            //System.out.println(path);
        }
        else
            System.out.println("A solution does not exist!");
    }
}