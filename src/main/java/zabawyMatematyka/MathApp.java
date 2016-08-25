package zabawyMatematyka;

import java.util.Scanner;

/**
 * Created by ulvar on 25.08.2016.
 */
public class MathApp {

    public double inPutLine() {
        Scanner scanner = new Scanner(System.in);

        double input = 0;
        try {
            input = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            System.out.println("możesz używać tylko liczb, zacznij od nowa: \n");
            printOptions();

        }


        // System.out.println("Wybrałes liczbę:" + input +"\n" );
        return input;
    }

    public void printOptions() {

        System.out.println("1. Rozwiąż równanie kwadratowe " + "\n" +
                "2. Oblicz sinusX " + "\n" +
                "3. Oblicz cosinusX " + "\n" +
                "4. Oblicz 2 do potęgi ");

        double choice = inPutLine();

        if (choice == 1) {
            System.out.println("Wybrałeś obliczanie równania kwadratowego, podaj dane" + "\n");
            squareEquationXXX();
        } else if (choice == 2) {
            System.out.println("Wybrałeś obliczanie sinusa, podaj kąt " + "\n");
            sinusX();
        } else if (choice == 3) {
            System.out.println("Wybrałeś obliczanie cosinusa, podaj kąt " + "\n");
            cosinusX();
        } else if (choice == 4) {
            System.out.println("Wybrałeś obliczanie dwójki do potęgi, podaj potęgę." + "\n");
            twoSquaredX();
        } else {
            System.out.println("Please input correct number 1-4");
            printOptions();

        }


    }

    public void tryAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Czy chcesz spróbować jeszcze raz?  TAK / NIE");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("tak") ||
                choice.equalsIgnoreCase("t") ||
                choice.equalsIgnoreCase("yes") ||
                choice.equalsIgnoreCase("y")) ;
        {


            printOptions();
        }

    }


    public void squareEquationXXX() {
        System.out.println("Podaj a");
        double a = inPutLine();

        if (a == 0) {
            System.out.println(" a nie może równać się zero \n ");
            squareEquationXXX();
        }

        System.out.println("Podaj b");
        double b = inPutLine();
        System.out.println("Podaj c");
        double c = inPutLine();
        double temp = Math.sqrt(b * b - 4 * a * c);
        double roz1 = (-b + temp) / (2 * a);
        double roz2 = (-b - temp) / (2 * a);
        if (temp > 0) {
            System.out.println("Równanie ma dwa rozwiazania " + roz1 + " i " + roz2);


        } else if (temp == 0) {
            System.out.println("Równanie ma jedno rozwiazanie " + (-b / 2 * a));


        } else {
            System.out.println("Równanie nie posiada rozwiazań ");

        }
        tryAgain();
    }

    public void sinusX() {
        double degrees = inPutLine();
        double radians = Math.toRadians(degrees);
        double angleSinus = Math.sin(radians);
        System.out.format("Wartość Pi wynosi %.4f%n", Math.PI);
        System.out.format("Sinus kąta %.1f  to %.4f%n", degrees, angleSinus);
        tryAgain();

    }

    public void cosinusX() {
        double degrees = inPutLine();
        double radians = Math.toRadians(degrees);
        double angleCosinus = Math.cos(radians);
        System.out.format("Wartość Pi wynosi %.4f%n", Math.PI);
        System.out.format("Cosinus kąta %.1f  to %.4f%n", degrees, angleCosinus);
        tryAgain();
    }

    public void twoSquaredX() {
        double square = inPutLine();
        double outcome = Math.pow(2, square);
        System.out.format("2 do potęgi " + square + " to " + outcome + "%n");
        tryAgain();

    }


}


