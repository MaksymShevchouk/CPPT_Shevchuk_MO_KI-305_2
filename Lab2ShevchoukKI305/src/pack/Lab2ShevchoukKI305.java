package pack;

import java.io.FileNotFoundException;

/**
 * Class App realize example program to lab work 2
 * 
 * @author Shevchouk Maxim
 * @version 1.1
 * @since version 1.0
 */
public class Lab2ShevchoukKI305 {
    /**
     *
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        Lamp lamp = new Lamp(23232232);

        lamp.getInfoLamp();
        lamp.repaintLight("Red");
        lamp.resizeLamp(7);
        lamp.getInfoLamp();
        lamp.getLightPower();
        lamp.powerOn();
        lamp.powerOff();
    }
}
