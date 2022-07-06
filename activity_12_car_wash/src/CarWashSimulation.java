/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 12 - CarWashSimulation
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a program that uses a Queue to simulate cars waiting to be served in a car wash facility. Use the dynamic queue implementation discussed in class and available online in our GitHub repository.  Make sure that your implementation uses Java generics. Then complete the TODO’s in CarWashSimulation.   
 */
public class CarWashSimulation {

    private static final int    MIN_TIME_WASH = 5;  // minutes
    private static final int    MAX_TIME_WASH = 15;  // minutes
    private static final int    CHANCE_NEW_CAR = 50; // 1-100% chance
    private static final String DATA_FILENAME = "cars.csv";
    private static String[] data = null;

    public static void loadData() {
        try {
            Scanner in = new Scanner(new FileInputStream(DATA_FILENAME));
            // 1st line has the number of cars
            int total = Integer.parseInt(in.nextLine());
            data = new String[total];
            int i = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                data[i++] = line;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Car getRandomCar() {
        Random r = new Random();
        int i = r.nextInt(data.length);
        String fields[] = data[i].split(",");
        return new Car(fields[0], fields[1], Integer.parseInt(fields[2]));
    }

    public static void run(int minutes) {
        Queue<Car> queue = new Queue<>();
        Random r = new Random();
        Car car = null; // this points to the car being washed
        int timer = 0; // counts the minutes to wash the car
        System.out.println("Simulation starts now for " + minutes + " minutes!");
        for (int i = 0; i < minutes; i++) {
            String padded = String.format("%03d" , i);
            System.out.print(padded + ". ");
            System.out.println(queue);
            // TODO: simulate that a new car arrived using CHANCE_NEW_CAR


            // TODO: if no cars is being washed, get the next car to be served from the queue


            // TODO: if a car is currently being served, decrease the timer and finish servicing the car if timer reaches 0
            
        }
        System.out.println("Simulation completed!");
    }

    public static void main(String[] args) {
        loadData();
        run(100);
    }
}
