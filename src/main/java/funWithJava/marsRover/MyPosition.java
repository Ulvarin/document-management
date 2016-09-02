package funWithJava.marsRover;

/**
 * Created by ulvar on 28.08.2016.
 */
public class MyPosition {
    MarsJeep marsJeep = new MarsJeep();


    public void roverPosition(){
        marsJeep.getVertical();
        marsJeep.getHorizontal();
        System.out.println(marsJeep.getVertical() +"..." +marsJeep.getHorizontal() + "pozycja z myposition");
    }


}
