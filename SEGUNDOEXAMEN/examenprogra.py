class MiTeleferico:
    def __init__(self):
        self.lineas = []
        self.cantidadIngresosos = 0
    
    def agregarPersonaFila(self, p, linea):
        linea.filaPersonas.append(p)
    
    def agregarCabina(self, linea):
        linea.cantidadCabinas = linea.cantidadCabinas + 1
        linea.cabinas.append(Cabina(linea.cantidadCabinas))

    def verificarCabinas(self):
        for linea in self.lineas:
            for i in linea.cabinas:
                if len(i.personasAbordo) > 10:
                    return False
                if sum(p.peso for p in i.personasAbordo) > 859:
                    return False
        return True

    def calcularIngresoTotal(self):
        total = 0
        for linea in self.lineas:
            for c in linea.cabinas:
                for p in c.personasAbordo:
                    if p.edad < 25 or p.edad > 60:
                        total = total + 1.5
                    else:
                        total = total + 3
        return total

    def lineaMayorIngresoRegular(self):
        may = None
        ingresom = -1
        
        for linea in self.lineas:
            ingreso = 0
            for k in linea.cabinas:
                for p in k.personasAbordo:
                    if 25 <= p.edad <= 60: 
                        ingreso = ingreso + 3
            if ingreso > ingresom:
                ingresom = ingreso
                may = linea
        return may

class Linea:
    def __init__(self, color):
        self.color = color
        self.filaPersonas = []
        self.cabinas = []
        self.cantidadCabinas = 0
        
    def agregarPersona(self, p):
        self.filaPersonas.append(p)
    
    def agregarCabina(self, nroCab):
        self.cabinas.append(Cabina(nroCab))

    def agregarPrimeraPersonaCabina(self, nroCabina, persona):
        for j in self.cabinas:
            if j.nroCabina == nroCabina:
                if len(j.personasAbordo) >= 10:
                    return (f"la cabina esta llena")
                
                pesoActual = sum(p.peso for p in j.personasAbordo)
                
                if pesoActual + persona.peso > 850:
                    return f"hay sobrepreso"
                j.agregarPersona(persona)
                return f"se agrego a una perosna"
        return f"no se encontro la cabina"



class Cabina:
    def __init__(self, nroCabina):
        self.nroCabina = nroCabina
        self.personasAbordo = []
        
    def agregarPersona(self, p):
        self.personasAbordo.append(p)

class Persona:
    def __init__(self, nombre, edad, peso):
        self.nombre = nombre
        self.edad = edad
        self.peso = peso

mtel1 = MiTeleferico()

linAmarilla = Linea("Amarilla")
linRoja = Linea("Roja")
linVerde = Linea("Verde")

mtel1.lineas.append(linAmarilla)
mtel1.lineas.append(linRoja)
mtel1.lineas.append(linVerde)

mtel1.agregarCabina(linAmarilla)
mtel1.agregarCabina(linAmarilla)

mtel1.agregarCabina(linRoja)

p1 = Persona("juan", 10, 68)
p2 = Persona("pedro", 20, 79)
p3 = Persona("pepe", 22, 70)

print(linAmarilla.agregarPrimeraPersonaCabina(2, p1))
print(linAmarilla.agregarPrimeraPersonaCabina(1, p2))
print(linRoja.agregarPrimeraPersonaCabina(1, p3))

print("verificando: ", mtel1.verificarCabinas())

print("total ingreso:", mtel1.calcularIngresoTotal(),"Bs")

mayor = mtel1.lineaMayorIngresoRegular()
print("linea con mas ingreso:", mayor.color)
