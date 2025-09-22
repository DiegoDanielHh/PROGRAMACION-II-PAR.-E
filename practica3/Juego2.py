import random
class Juego2:
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

class JuegoAdivinaNumero(Juego2):
    def __init__(self, numeroDeVidas):
        super().__init__(numeroDeVidas)
        self.numeroAAdivinar = None

    def validaNumero(self, num):
        if 0 <= num <= 10:
            return True
        else:
            print("Número inválido. Debe estar entre 0 y 10.")
            return False

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)

        while self.numeroDeVidas > 0:
            numero = int(input("Introduce un número del 0 al 10: "))
            if self.validaNumero(numero) == False:
                continue
            
            if numero == self.numeroAAdivinar:
                print("¡Acertaste!")
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
                    print(f"El número era: {self.numeroAAdivinar}")

class JuegoAdivinaPar(JuegoAdivinaNumero):
    def validaNumero(self, num):
        if 0 <= num <= 10:
            if num % 2 == 0:
                return True
            else:
                print("Error, el numero debe ser par.")
                return False
        return False

class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def validaNumero(self, num):
        if 0 <= num <= 10:
            if num % 2 == 1:
                return True
            else:
                print("Error, el número debe ser impar.")
                return False
        return False
    
class Aplicacion:
    def main():
        juego1 = JuegoAdivinaNumero(3)
        juego2 = JuegoAdivinaPar(3)
        juego3 = JuegoAdivinaImpar(3)

        juego1.juega()
        juego2.juega()
        juego3.juega()
Aplicacion.main()
