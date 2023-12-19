# клас корпус
class Type:
    #конструктор
    def __init__(self):
        self.__color = "White"
        self.__radius = 5

    # метод встановлює колір світла
    def setColor(self, newColor):
        self.__color = newColor

    # метод повертає колір світла
    def getColor(self):
        return self.__color

    # метод встановлює радіус
    def setRadius(self, newRadius):
        self.__radius = newRadius
    
    def getRadius(self):
        return self.__radius

    # метод повертає розмір лампочки
    def getSize(self):
        return 3.14 * self.__radius * self.__radius
