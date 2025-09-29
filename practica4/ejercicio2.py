from abc import ABC, abstractmethod
import random
import math
class Coloreado(ABC):
    @abstractmethod
    def comoColorear(self):
        pass

class Figura(ABC):
    def __init__(self, color):
        self.color=color
    
    def setColor(self, color):
        self.color=color
    
    def getColor(self):
        return self.color
    
    def toString(self):
        return f"Color: {self.color}"
    
    @abstractmethod
    def area(self):
        pass
    
    @abstractmethod
    def perimetro(self):
        pass

class Cuadrado(Figura, Coloreado):
    def __init__(self, lado, color):
        super().__init__(color)
        self.lado=lado
    
    def area(self):
        return self.lado**2
    
    def perimetro(self):
        return 4*self.lado
    
    def comoColorear(self):
        return "Colorear los cuatro lados"

class Circulo(Figura):
    def __init__(self, radio, color):
        super().__init__(color)
        self.radio=radio
    
    def area(self):
        return math.pi*(self.radio**2)
    
    def perimetro(self):
        return 2*math.pi*self.radio

figuras = []
lado=random.randint(1, 10)
color="rojo"
cuadrado=Cuadrado(lado, color)
figuras.append(cuadrado)

for i in range(2):
    radio=random.randint(1, 10)
    color="azul"
    circulo=Circulo(radio, color)
    figuras.append(circulo)

for i in range(2):
    if random.randint(1, 2) == 1:
        lado=random.randint(1, 10)
        cuadrado=Cuadrado(lado, "verde")
        figuras.append(cuadrado)
    else:
        radio=random.randint(1, 10)
        circulo=Circulo(radio, "amarillo")
        figuras.append(circulo)

for figura in figuras:
    print(f"Área: {figura.area()}")
    print(f"Perimetro: {figura.perimetro()}")
    if hasattr(figura, 'comoColorear'):
        print(f"{figura.comoColorear()}")
    print()