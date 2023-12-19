package pack;

import java.io.*;

/**
 * Class <code>StoveForCooking</code> implements stove for cooking
 */
abstract class Lamp {
    protected Type TypeOfLamp;
    protected Light LightOfLamp;
    protected Button PowerOn;
    protected Button PowerOff;
    protected PrintWriter fout;
    static int power;

    /**
     * Method change color of light lamp
     */
    public void repaintLight(String uCollor) {
        TypeOfLamp.setColor(uCollor);
        System.out.println("New color of light is " + uCollor + ".");
        fout.println("New color of light is " + uCollor + ".");
        fout.flush();
    }

    /**
     * Method change radius of lamp
     */
    public void resizeLamp(double uRadius) {
        TypeOfLamp.setRadius(uRadius);
        System.out.println("New radius of lamp is " + uRadius + " cm.");
        fout.println("New radius of lamp is " + uRadius + " cm.");
        fout.flush();
    }

    /**
     * Method provides information about the appearance of the lamp
     */
    public void getRadiusLamp() {
        System.out.println("Radius of lanp: " + TypeOfLamp.getRadius() + " cm.");
        fout.println("Radius of lanp: " + TypeOfLamp.getRadius() + " cm.");
        fout.flush();
    }

    /**
     * Method provides information about the light power of Lamp
     */
    public void getLightPower() {
        System.out.println("Light power is " + LightOfLamp.getPower() + " W.");
        fout.println("Light power is " + LightOfLamp.getPower() + " W.");
        fout.flush();
    }


    abstract void getInfoLamp();


    /**
     * The method provides information about the remaining lamp life
     */
    public void PowerOnResource() {
        System.out.println("The lamp will work for a while " + PowerOn.getResource() + "  time units.");
        fout.println("The lamp will work for a while " + PowerOn.getResource() + "  time units.");
        fout.flush();
    }

    /**
     * The method provides information about the remaining lamp life
     */
    public void PowerOffResource() {
        System.out.println("The lamp will work for a while " + PowerOff.getResource() + "  time units.");
        fout.println("The lamp will work for a while " + PowerOff.getResource() + "  time units.");
        fout.flush();
    }

    /**
     * Method simulate the power on tap
     */
    public void powerOn() {
        PowerOn.clickButton(true);
        System.out.println("You tap the power on button.");
        fout.println("You tap the power on button.");
        fout.flush();
    }

    /**
     * Method simulate the power off tap
     */
    public void powerOff() {
        PowerOff.clickButton(false);
        System.out.println("You tap the power off button.");
        fout.println("You tap the power off button.");
        fout.flush();
    }

    /**
     * The method provides information about the number of lamp switching on and off
     */
    public void OnOffCount() {
        System.out.println("You tap the on/off button " + PowerOn.getCountClicks());
        fout.println("You tap the on/off button " + PowerOn.getCountClicks());
        fout.flush();
    }
}







/**
 * Class <code>Type</code> implements type of lamp
 * 
 * @author Shevchouk Maxim
 * @version 1.0
 */
class Type {
    private String LightColor;
    private double radius;

    /**
     * Constructor
     */
    public Type() {
        LightColor = "White";
        radius = 5;
    }

    /**
     * Method sets new light color of lamp
     * 
     * @param <code>newColor</code> The color value
     */
    public void setColor(String newLightColor) {
        LightColor = newLightColor;
    }

    /**
     * Method sets new radius of type of lamp
     * 
     * @param <code>newSize</code> The Size value
     */
    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    /**
     * Method gets light color of type of lamp
     */
    public String getColor() {
        return LightColor;
    }

    /**
     * Method gets radius of type of radius in cm
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method gets size of type of lamp in cm^2
     */
    public double getSize() {
        return 3.14 * radius * radius;
    }
}








/**
 * Class <code>Light</code> implements Light of stove for cooking
 * 
 * @author Shevchouk Maxim
 * @version 1.0
 */
class Light {
    private double power;

    /**
     * Constructor
     */
    public Light() {
        power = 20;
    }

    /**
     * Constructor
     * 
     * @param <code>uPower</code> The power value
     */
    public Light(int uPower) {
        power = uPower;
    }

    /**
     * Method returns power
     * 
     */
    public double getPower() {
        return power;
    }

    /**
     * Method sets new power of lamp
     * 
     * @param <code>newPower</code> The power value
     */
    public void setPower(double newPower) {
            power = newPower;
    }
}






/**
 * Class <code>Button</code> implements buttons of audio player
 * 
 * @author Shevchouk Maxim
 * @version 1.0
 */
class Button {
    // remaining work resource
    private int remainingWork, count;

    /**
     * Constructor
     */
    public Button() {
        remainingWork = 99999999;
        count = 0;
    }

    /**
     * Constructor
     * 
     * @param <code>res</code> remaining work resource
     */
    public Button(int res) {
        remainingWork = res;
        count = 0;
    }

    /**
     * Method simulates Button clicking
     */
    public void clickButton(boolean type) {
        if (type) {
            remainingWork--;
            count++;
        } else {
            remainingWork--;
            count--;
        }
    }

    /**
     * Method returns resource of lamp
     * 
     */
    public int getResource() {
        return remainingWork;
    }

    /**
     * Method returns how many times the user clicked on the button at one time
     * 
     * @return Button clicks
     */
    public int getCountClicks() {
        return count;
    }

}
