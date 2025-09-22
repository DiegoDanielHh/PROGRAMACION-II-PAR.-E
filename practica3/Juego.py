import random
class Juego:
    def __init__(self, numeroDeVidas):
        self.numeroDeVidas = numeroDeVidas
        self.vidasIniciales = numeroDeVidas
        self.record = 0

    def reiniciaPartida(self):
        self.numeroDeVidas = self.vidasIniciales

    def actualizaRecord(self):
        if self.numeroDeVidas > self.record:
            self.record = self.numeroDeVidas
            print(f"Nuevo récord, tienes {self.record} vidas restantes")

    def quitaVida(self):
        self.numeroDeVidas -= 1
        if self.numeroDeVidas > 0:
            return True
        else:
            return False

class JuegoAdivinaNumero(Juego):
    def __init__(self, numeroDeVidas):
        super().__init__(numeroDeVidas)
        self.numeroAAdivinar = None

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)

        while self.numeroDeVidas > 0:
            numero = int(input("Introduce un número del 0 al 10: "))

            if numero == self.numeroAAdivinar:
                print("Acertaste!")
                self.actualizaRecord()
                break
            else:
                if numero < self.numeroAAdivinar:
                    print("El número es mayor.")
                else:
                    print("El número es menor.")

                if self.quitaVida():
                    print(f"Te quedan {self.numeroDeVidas} vidas. Intenta de nuevo.")
                else:
                    print("Te quedaste sin vidas. GAME OVER.")
                    print(f"El númro correcto era: {self.numeroAAdivinar}")
                    
class Aplicacion:
    def main():
        juego = JuegoAdivinaNumero(3)
        juego.juega()
Aplicacion.main()

