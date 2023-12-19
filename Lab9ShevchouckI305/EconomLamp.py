from Lamp import Lamp

# клас економ лампочка
class EconomLamp(Lamp):
    # конструктор
    def __init__(self):
        super().__init__()
        self.__theLampIsIntact = True
        self.__powerLight = 30

    # метод додає потужність світлу
    def setPower(self, additionalPow):
        self.__powerLight += additionalPow

    # метод симулює роботу лампочки
    def lampWorking(self, time):
        if self.__theLampIsIntact:
            print("The lamp is working " + str(time) +" min.")
        else:
            print("The lamp is NOT working.")

    # метод повертає потужність світла
    def getPower(self):
        print("Power light: " + str(self.__powerLight))