package funWithJava.marsRover;

import java.util.Scanner;

/**
 * Created by ulvar on 28.08.2016.
 */
public class marsapp {

    public static void main(String[] args) {
        MarsJeep marsJeep = new MarsJeep();
        MyPosition myposition = new MyPosition();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("rr - rotate right...rl - rotate left...m - move");
            String command = input.nextLine();

            if (command.equalsIgnoreCase("rr")) {
                marsJeep.rotateRight();
                System.out.println("angle is: " + marsJeep.angle + " degrees");

            } else if (command.equalsIgnoreCase("rl")) {
                marsJeep.rotateLeft();
                System.out.println("angle is: " + marsJeep.angle + " degrees");
            } else if (command.equalsIgnoreCase("m")) {
                marsJeep.move();

            }
        }
    }
}
