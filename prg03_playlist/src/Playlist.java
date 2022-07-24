/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Prg03 - PlayList class
 * Student(s):
 */

import java.io.*;
import java.util.*;

public class Playlist {

    public static final String FILE_NAME = "playlist.csv";
    public static final int OPTION_PRINT = 1;
    public static final int OPTION_ADD   = 2;
    public static final int OPTION_KEY   = 3;
    public static final int OPTION_QUIT  = 4;
    public static Scanner sc = new Scanner(System.in);

    private BinaryTree<Song> binTree;
    private int key;

    public Playlist() throws FileNotFoundException {
        binTree = new BinaryTree<>();
        key = Song.TITLE_KEY;
        loadSongs();
    }

    // TODO #7: opens the csv file for reading and parses all songs into the (already instantiated) BinaryTree object (you should use the binTree instance variable)
    private void loadSongs() throws FileNotFoundException {

    }

    // TODO #8: opens the csv file for writing and iterates over the BinaryTree object, writing its songs to the csv file
    public void saveSongs() throws FileNotFoundException {

    }

    @Override
    public String toString() {
        return binTree.toString();
    }

    // TODO #9: reads info for a song adding it into the binary tree
    public void addSong() {

    }

    // TODO #10: read choice for the key; then, iterates over the songs and adds them into a new binary tree; once this copy procedure is over, clears the current tree and set it to the newly created tree
    public void setKey() {
        
    }

    public static int getOption() {
        while (true) {
            System.out.println("Options: 1:print 2:add 3:set key 4:quit");
            System.out.print("? ");
            String line = sc.nextLine();
            try {
                int option = Integer.parseInt(line);
                if (option == OPTION_PRINT || option == OPTION_ADD || option == OPTION_KEY || option == OPTION_QUIT)
                    return option;
            }
            catch (NumberFormatException ex) {  }
            System.out.println("Error!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to my playlist!");
        Playlist playList = new Playlist();
        boolean quit = false;
        while (!quit) {
            int option = getOption();
            switch (option) {
                case OPTION_PRINT:
                    System.out.println(playList);
                    break;
                case OPTION_ADD:
                    playList.addSong();
                    break;
                case OPTION_KEY:
                    playList.setKey();
                    break;
                case OPTION_QUIT:
                    System.out.println("Saving playlist changes...");
                    playList.saveSongs();
                    System.out.println("Done!");
                    quit = true;
            }
        }
        System.out.println("Bye!");
    }
}
