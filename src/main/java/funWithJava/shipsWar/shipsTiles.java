package funWithJava.shipsWar;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ulvar on 27.08.2016.
 */
public class shipsTiles {
    //mapa
    int[][] tiles;


    //

    public static void main(String[] args) {
        shipsTiles shipsTiles = new shipsTiles();
        shipsTiles.tryToHit();
    }

    public int[][] tryToHit() {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] tileToHit = new int[a][b];
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(Arrays.toString(tileToHit));
        return tileToHit;

    }

    public boolean checkIfHit() {
        int[][] statek1;
        statek1 = new int[2][2];
        if (tryToHit() == statek1) ;
        return true;
    }

}
