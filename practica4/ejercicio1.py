from abc import ABC, abstractmethod
class Empleado(ABC):
    def __init__(self, nombre):
        self.nombre=nombre
    @abstractmethod
    def CalcularSalarioMensual(self):
        pass
    def toString(self):
        return f"Nombre: {self.nombre}"
class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, nombre, salario_anual):
        super().__init__(nombre)
        self.salario_anual=salario_anual
    
    def CalcularSalarioMensual(self):
        return self.salario_anual/12
    
    def toString(self):
        return f"Empleado iempo completo - {super().toString()}, Salario anual: {self.salario_anual}Bs"

class EmpleadoTiempoHorario(Empleado):
    def __init__(self, nombre, horas_trabajadas, tarifa_por_hora):
        super().__init__(nombre)
        self.horas_trabajadas=horas_trabajadas
        self.tarifa_por_hora=tarifa_por_hora
    
    def CalcularSalarioMensual(self):
        return self.horas_trabajadas*self.tarifa_por_hora
    
from abc import ABC, abstractmethod
class Empleado(ABC):
    def __init__(self,nombre):
        self.nombre=nombre
    
    @abstractmethod
    def CalcularSalarioMensual(self):
        pass
    
    def toString(self):
        return f"Nombre: {self.nombre}"

class EmpleadoTiempoCompleto(Empleado):
    def __init__(self, nombre, salario_anual):
        super().__init__(nombre)
        self.salario_anual=salario_anual
    
    def CalcularSalarioMensual(self):
        return self.salario_anual/12
    
    def toString(self):
        return f"Empleado tiempo completo - {super().toString()}, Salario anual: {self.salario_anual}Bs"

class EmpleadoTiempoHorario(Empleado):
    def __init__(self, nombre, horas_trabajadas, tarifa_por_hora):
        super().__init__(nombre)
        self.horas_trabajadas=horas_trabajadas
        self.tarifa_por_hora=tarifa_por_hora
    
    def CalcularSalarioMensual(self):
        return self.horas_trabajadas*self.tarifa_por_hora
    
    def toString(self):
        return f"Empleado tiempo horario - {super().toString()}, Horas: {self.horas_trabajadas}, Tarifa: {self.tarifa_por_hora}Bs/hora"

empleados = []
print("Ingrese datos de 3 empleados de tiempo completo:")
for i in range(3):
    print(f"\nEmpleado {i+1}:")
    nombre=input("Nombre: ")
    salario_anual=float(input("Salario anual: "))
    empleados.append(EmpleadoTiempoCompleto(nombre, salario_anual))
    
print("\nIngrese datos de 2 empleados de tiempo horario:")
for i in range(2):
    print(f"\nEmpleado {i+1}:")
    nombre = input("Nombre: ")
    horas_trabajadas = float(input("Horas trabajadas: "))
    tarifa_por_hora = float(input("Tarifa por hora: "))
    empleados.append(EmpleadoTiempoHorario(nombre, horas_trabajadas, tarifa_por_hora))

print("\nRESULTADS:")
for empleado in empleados:
    print(empleado.toString())
    print(f"Salario mensual: {empleado.CalcularSalarioMensual():.2f}Bs")