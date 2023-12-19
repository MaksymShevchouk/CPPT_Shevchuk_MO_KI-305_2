from EconomLamp import EconomLamp

# основна програма
if __name__ == "__main__":
    # об'єкт на основі класу газова плита
    lamp = EconomLamp()

    # використання методів класу за допомогою створеного об'єкта
    lamp.getInfoLook()
    lamp.repaintLight("Red")
    lamp.resizeLight(7)
    lamp.getInfoLook()
    lamp.getLightPower()
    lamp.powerOn()
    lamp.powerOff()
    lamp.lampWorking(30)
    lamp.getPower()
    lamp.setPower(15)
    lamp.getPower()