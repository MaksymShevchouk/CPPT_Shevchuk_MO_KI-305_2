from Type import Type
from Light import Light
from Button import Button

# клас аудіоплеєр
class Lamp:
    # конструктор
    def __init__(self):
        self.__typeOfLamp = Type()
        self.__lightOfLamp = Light()
        self.__powerOn = Button()
        self.__powerOff = Button()

    # метод змінює колір світла
    def repaintLight(self, uColor):
        self.__typeOfLamp.setColor(uColor)
        print("New color of light is " + uColor + ".")

    # метод змінює колір світла
    def resizeLight(self, uRadius):
        self.__typeOfLamp.setRadius(uRadius)
        print("New radius of lamp is " + str(uRadius) + " cm.")

    # метод повертає повну інформацію про зовнішній вигляд лампочки
    def getInfoLook(self):
        print("Light color is " + str(self.__typeOfLamp.getColor()))
        print("Lamp size is " + str(self.__typeOfLamp.getSize()))

    # метод повертає радіус лампочки
    def getRadiusLamp(self):
        print("Radius of lamp: " +  str(self.__typeOfLamp.getRadius()) + " cm.")

    # метод повертає потужність світла
    def getLightPower(self):
        print("Light power is " +  str(self.__lightOfLamp.getPower()) + " W.")

    # метод виводить ресурс кнопки включання
    def PowerOnResource(self):
        print("The lamp will work for a while " + str(self.__powerOn.getResource()) + "  time units.")

    # метод виводить ресурс кнопки виключання
    def PowerOffResource(self):
        print("The lamp will work for a while " + str(self.__powerOff.getResource()) + "  time units.")
   
    # метод симулює натискання на кнопку включення
    def powerOn(self):
        self.__powerOn.clickButton(True)
        print("You tap the power on button.")

    # метод симулює натискання на кнопку виключення
    def powerOff(self):
        self.__powerOff.clickButton(False)
        print("You tap the power off button.")

    # метод надає інформацію про кількість увімкнень та вимкнень лампочки
    def OnOffCount(self):
        print("You tap the on/off button " + str(self.__powerOn.getCountClicks()))
