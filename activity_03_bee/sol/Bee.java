/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 03 - Bee
 */

public class Bee {

    public static final int WORKER = 0;
    public static final int DRONE  = 1;
    public static final int QUEEN  = 2;

    private String beehive;
    private int    type;
    private int    x, y;

    public Bee(String beehive) {
        type = WORKER;
        this.beehive = beehive;
        x = y = 0;
    }

    public Bee(String beehive, int type) {
        if (type == WORKER || type == DRONE || type == QUEEN)
            this.type = type;
        else
            this.type = WORKER;
        this.beehive = beehive;
        x = y = 0;
    }

    public String getBeehive() {
        return beehive;
    }

    public int getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private String getTypeAsString() {
        if (type == WORKER)
            return "worker";
        else if (type == DRONE)
            return "drone";
        else
            return "queen";
    }

    @Override
    public String toString() {
        String out = getTypeAsString() + " from \"" + beehive + "\" is ";
        if (isInsideHive())
            out += "inside the hive!";
        else
            out += "outside the hive @ (" + x + ", " + y + ")";
        return out;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isInsideHive() {
//        if (x == 0 && y == 0)
//            return true;
//        return false;
        return x == 0 && y == 0;
    }
}
