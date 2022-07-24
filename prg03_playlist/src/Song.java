/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg03 - Song class
 * Student(s):
 */

public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private int    rank;
    private int    key;

    public static final int MIN_RANK  = 1;
    public static final int MAX_RANK  = 5;
    public static final int TITLE_KEY  = 1;
    public static final int ARTIST_KEY = 2;
    public static final int RANK_KEY   = 3;

    // TODO #1: implement the constructor
    // if rank is invalid, set it to MIN_RANK
    // if key is invalid, set it to TITLE_KEY
    public Song(String title, String artist, int rank, int key) {

    }

    // TODO #2: implement all getter methods


    // TODO #3: implement the setter method
    // it should only set the key IF the key is valid
    public void setKey(int key) {

    }

    // TODO #4: implement the compareTo override based on the current key value (note that rank should be from higher to lower rank)
    @Override
    public int compareTo(Song other) {
        return 0;
    }

    // TODO #5: implement the toString override
    @Override
    public String toString() {
        return "";
    }
}
