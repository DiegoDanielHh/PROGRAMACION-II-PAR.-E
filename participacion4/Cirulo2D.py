from multimethod import multimethod
import math
class Circulo:
    @multimethod
    def __init__(self):
        self._x = 0
        self._y = 0
        self._radio = 1
    @multimethod
    def __init__(self, radio: float):
        self._x = 0
        self._y = 0
        self._radio = radio
    @multimethod
    def __init__(self, x: float, y: float, radio: float):
        self._x = x
        self._y = y
        self._radio = radio

    def getX(self):
        return self._x

    def getY(self):
        return self._y

    def getRadio(self):
        return self._radio

    def getArea(self):
        return math.pi * (self._radio ** 2)

    def getPerimetro(self):
        return 2 * math.pi * self._radio

    def contiene(self, otro):
        distancia = math.sqrt((self._x - otro._x) ** 2 + (self._y - otro._y) ** 2)
        return distancia + otro._radio <= self._radio

    def sobrepone(self, otro):
        distancia = math.sqrt((self._x - otro._x) ** 2 + (self._y - otro._y) ** 2)
        return distancia < (self._radio + otro._radio)

c1 = Circulo()             
c2 = Circulo(3.0)           
c3 = Circulo(1.0, 3.0, 6.0) 

print(f"C1 tiene centro en: ({c1.getX()}, {c1.getY()}) y radio: {c1.getRadio()}")
print(f"C2 tiene centro en: ({c2.getX()}, {c2.getY()}) y radio: {c2.getRadio()}")
print(f"C3 tiene centro en: ({c3.getX()}, {c3.getY()}) y radio: {c3.getRadio()}")

print(f"Área de C3: {c3.getArea()}")
print(f"Perímetro de C3: {c3.getPerimetro()}")
print(f"¿C3 contiene a C2? {c3.contiene(c2)}")
print(f"¿C3 se sobrepone con C1? {c3.sobrepone(c1)}")
