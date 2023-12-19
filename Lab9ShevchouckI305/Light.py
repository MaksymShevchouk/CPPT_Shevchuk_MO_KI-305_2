# клас комфорка
class Light:
    # конструктор
    def __init__(self):
        self.__power = 20

    # метод повертає потужність світла
    def getPower(self):
        return self.__power

    # метод втановлює потужності світла
    def setPower(self, newPower):
        self.__power = newPower
