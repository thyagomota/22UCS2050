/*
 * CS2050 - Computer Science II - Summer 2022
 * Instructor: Thyago Mota
 * Description: Activity 03 - BeeDriver
 */

import java.util.Random;

public class BeeDriver {

    public static void main(String[] args) {
        final int TOTAL_BEES = 15;
        final String beehiveName = "honey comb";
        Bee beeHive[] = new Bee[TOTAL_BEES];
        beeHive[0] = new Bee(beehiveName, Bee.QUEEN);
        for (int i = 1; i < TOTAL_BEES; i++) {
            if (new Random().nextInt(100) + 1 <= 10)
                beeHive[i] = new Bee(beehiveName, Bee.DRONE);
            else
                beeHive[i] = new Bee(beehiveName, Bee.WORKER);
        }

        for (int i = 0; i < TOTAL_BEES; i++) {
            int x = new Random().nextInt(21) - 10;
            int y = new Random().nextInt(21) - 10;
            beeHive[i].move(x, y);
            System.out.println(beeHive[i]);
        }

    }
}