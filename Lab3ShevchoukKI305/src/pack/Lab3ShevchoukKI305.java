package pack;

import java.io.FileNotFoundException;

/**
 * Class App realize example program to lab work 3
 * 
 * @author Shevchouk Maxim
 * @version 1.1
 * @since version 1.0
 */
public class Lab3ShevchoukKI305 {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        EconomLamp lamp = new  EconomLamp(23232232, 30);
        lamp.getInfoLamp();
        lamp.repaintLight("Red");
        lamp.resizeLamp(7);
        lamp.getInfoLamp();
        lamp.getLightPower();
        lamp.powerOn();
        lamp.powerOff();
        lamp.lampWorking(30);
        lamp.getPower();
        lamp.setPower(45);
        lamp.getPower();
        lamp.LampGlowing();
    }
}
