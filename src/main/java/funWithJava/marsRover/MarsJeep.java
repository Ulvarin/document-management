package funWithJava.marsRover;

/**
 * Created by ulvar on 28.08.2016.
 */
public class MarsJeep {

    int angle;
    int vertical;
    int horizontal;

    public int getVertical() {
        return vertical;
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void move() {

        if (angle == 0 || angle == 360 || angle == -360) {
            vertical = vertical + 1;
            horizontal = horizontal + 0;
            System.out.println("góra");
            System.out.println("My position is " + horizontal + "," + vertical + "\n");
        } else if (angle == 90 || angle == -270) {
            vertical = vertical + 0;
            horizontal = horizontal + 1;
            System.out.println("prawo");
            System.out.println("My position is " + horizontal + "," + vertical + "\n");
        } else if (angle == -90 || angle == 270) {
            vertical = vertical + 0;
            horizontal = horizontal + -1;
            System.out.println("lewo");
            System.out.println("My position is " + horizontal + "," + vertical + "\n");
        } else if (angle == 180 || angle == -180) {
            vertical = vertical - 1;
            horizontal = horizontal + 0;
            System.out.println("dół");
            System.out.println("horizontal " + horizontal + "\nvertical: " + vertical + "\n");
        }

    }

    private void angleReset() {
        if (angle >= 360 || angle <= -360) {
            angle = 0;
            if (angle == 0) {
                System.out.println("Algle have 0/360 degrees");

            }
        }
    }

    public void rotateRight() {
        angle = angle + 90;
        angleReset();
    }

    public void rotateLeft() {
        angle = angle - 90;
        angleReset();
    }

}

