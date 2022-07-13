/*
 * CS 2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg02 - Location Class
 * Your name(s):
 */

class Location {

    private int x;
    private int y;

    Location() {
        x = y = 0;
    }

    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

    // TODO: two locations are considered to be the same if their correspondent coordinate values match
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
