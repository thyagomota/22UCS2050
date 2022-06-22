/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg 01 - Route class
 * Your name(s):
 */

public class Route {

    private Node   start;
    private static final double MAX_JUMP = 5; // in km

    // TODO: implement the parameter-less constructor
    public Route() {

    }

    // TODO: return the number of waypoints in the route
    public int size() {
        return 0;
    }

    // TODO: a route should not accept jumps from one waypoint to another greater than MAX_KUMP; return true/false depending whether the waypoint was successfully added or not
    public boolean add(final Waypoint waypoint) {
        return false;
    }

    // TODO: return the waypoint at the specified index location
    public Waypoint get(int index) {
        return null;
    }

    // TODO: return a string representation of a route from its start to its end
    @Override
    public String toString() {
        return "";
    }
}