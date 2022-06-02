/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 01 - BSheep
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BSheep {

    static final int MIN_NUM_SHEEP = 2;

    public static void main(String[] args) {

        // TODOd: declare variables
        int n, minX, maxX, minY, maxY;

        // TODOd: instantiate scanner
        // Scanner sc = new Scanner(System.in);
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("test1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(2);
        }

        // TODOd: read and validate the number of sheep
        System.out.print("n? ");
        n = sc.nextInt();
        if (n < MIN_NUM_SHEEP) {
            System.out.println("Number of sheep must be at least " + MIN_NUM_SHEEP);
            System.exit(1);
        }

        // TODO: run a loop to read the sheep coordinates
        System.out.println("Enter the sheep coordinates now!");
        minX = maxX = sc.nextInt();
        minY = maxY = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x < minX)
                minX = x;
            else if (x > maxX)
                maxX = x;
            if (y < minY)
                minY = y;
            else if (y > maxY)
                maxY = y;
        }

        // TODO: display the fence
        System.out.print("Fence coordinates: ");
        System.out.print("{(" + minX + "," + minY + "), ");
        System.out.print("(" + maxX + "," + minY + "), ");
        System.out.print("(" + maxX + "," + maxY + "), ");
        System.out.println("(" + minX + "," + maxY + ")}");
    }
} // end of class definition
