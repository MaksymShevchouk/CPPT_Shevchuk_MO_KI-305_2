package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

interface Glow {
    void LampGlowing();
}

/**
 * Class <code>EconomLamp</code> implements Econom Lamp
 */
public class EconomLamp extends Lamp implements Glow {
     /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */ 
    private boolean TheLampIsIntact;
    private int PowerLight;
    
    public EconomLamp() throws FileNotFoundException {
        TypeOfLamp = new Type();
        LightOfLamp = new Light();
        PowerOn = new Button();
        PowerOff = new Button();

        TheLampIsIntact = true;
        PowerLight = 30;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     * 
     * @param <code>resource</code> Button clicks resource
     * @throws FileNotFoundException
     */
    public EconomLamp(int resource, int uPowerLight) throws FileNotFoundException {
        TypeOfLamp = new Type();
        LightOfLamp = new Light();
        PowerOn = new Button(resource);
        PowerOff = new Button(resource);

        TheLampIsIntact = true;
        PowerLight = uPowerLight;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method provides information about the appearance of the Lamp
     */
    public void getInfoLamp() {
        System.out.println("Light color is " + TypeOfLamp.getColor());
        System.out.println("Lamp size is " + TypeOfLamp.getSize());
        fout.println("Light color is " + TypeOfLamp.getColor());
        fout.println("Lamp size is " + TypeOfLamp.getSize());
        fout.flush();
    }


    /**
     * Method of modeling the lamp glowing
     */
    public void LampGlowing() {
        System.out.println("The lamp is glow up.");
        fout.println("The lamp is glow up.");
        fout.flush();
    } 
    


    /**
     * Method change the power light
     * 
     * @param <code>additionalPow</code> The value of the power light
     */
    public void setPower(int additionalPow) {
        PowerLight = additionalPow;
    }

    /**
     * Method how the lamp works
     */
    public void lampWorking(int time) {
        if (TheLampIsIntact) {
            System.out.println("The lamp is working " + time +" min.");
            fout.println("The lamp is working " + time +" min.");
        } else {
            System.out.println("The lamp is NOT working.");
            fout.println("The lamp is NOT working.");
        }
        fout.flush();
    }

    /**
     * Method print light power
     */
    public void getPower() {
        System.out.println("Power light: " + PowerLight);
        fout.println("Power light: " + PowerLight);
        fout.flush();
    }

}
