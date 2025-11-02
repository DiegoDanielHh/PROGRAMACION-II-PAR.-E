class Biblioteca:
    class Horario:
        def __init__(self, dias_apertura, hora_apertura, hora_cierre):
            self.dias_apertura = dias_apertura
            self.hora_apertura = hora_apertura
            self.hora_cierre = hora_cierre
        
        def mostrar_horario(self):
            print(f"Dias: {self.dias_apertura}")
            print(f"Abre: {self.hora_apertura} Cierra {self.hora_cierre}")
    
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros_disponibles = []
        self.autores_registrados = []
        self.prestamos_activos = []
        self.horario = self.Horario("Lunes a Viernes", "08:00", "20:00")
    
    def agregar_libro(self, libro):
        self.libros_disponibles.append(libro)
    
    def agregar_autor(self, autor):
        self.autores_registrados.append(autor)
    
    def prestar_libro(self, estudiante, libro):
        prestamo = Prestamo(estudiante, libro)
        self.prestamos_activos.append(prestamo)
        return prestamo
    
    def mostrar_estado(self):
        print(f"ESTADO")
        print(f"Biblioteca: {self.nombre}")
        print(f"Libros disponibles: {len(self.libros_disponibles)}")
        print(f"Autores registrados: {len(self.autores_registrados)}")
        print(f"Prestamos activos: {len(self.prestamos_activos)}")
        if self.horario:
            print("Horario de atencion: ")
            self.horario.mostrar_horario()
    
    def cerrar_biblioteca(self):
        self.prestamos_activos = []
        print("Biblioteca cerrada, no existen prestamos")

class Libro:
    def __init__(self, titulo, isbn, contenido_paginas):
        self.titulo = titulo
        self.isbn = isbn
        self.paginas = []
        
        for i in range(len(contenido_paginas)):
            nueva_pagina = Pagina(i+1, contenido_paginas[i])
            self.paginas.append(nueva_pagina)
    
    def leer(self):
        print("Se está leyendo:")
        for pagina in self.paginas:
            print(f"Pagina {pagina.numero}: {pagina.contenido}")

class Pagina:
    def __init__(self, numero, contenido):
        self.numero = numero
        self.contenido = contenido

class Autor:
    def __init__(self, nombre, nacionalidad):
        self.nombre = nombre
        self.nacionalidad = nacionalidad
    
    def mostrar_info(self):
        print(f"Info del autor: ")
        print(f"Autor: {self.nombre}")
        print(f"Nacionalidad: {self.nacionalidad}")

class Estudiante:
    def __init__(self, codigo, nombre):
        self.codigo = codigo
        self.nombre = nombre
    
    def mostrar_info(self):
        print(f"Info del est: ")
        print(f"Estudiante: {self.nombre}")
        print(f"Código: {self.codigo}")

class Prestamo:
    def __init__(self, estudiante, libro):
        self.estudiante = estudiante
        self.libro = libro
        self.fecha_prestamo = "26/10/2025"
        self.fecha_devolucion = None
    
    def mostrar_info(self):
        print(f"Info del prestamo")
        print(f"Libro: {self.libro.titulo}")
        print(f"Estudiante: {self.estudiante.nombre}")
        print(f"Fecha de prestamo: {self.fecha_prestamo}")
        if self.fecha_devolucion:
            print(f"Fecha de devolución: {self.fecha_devolucion}")
        else:
            print("Estado: Activo")

print("SISTEMA DE BIBLIOTECA UNIVERSITARIA")

#COMPOSICION
biblioteca = Biblioteca("Universidad Mayor de San Andrés")

# AGREGACIÓN
autor1 = Autor("Gabriel García Márquez", "Colombiana")
autor2 = Autor("Mario Vargas Llosa", "Peruana")

biblioteca.agregar_autor(autor1)
biblioteca.agregar_autor(autor2)

# COMPOSICIÓN
libro1 = Libro("Don Quijote", "123-456-789", ["Érase una vez ........", "Sancho ........", "Don Quijote............"])

libro2 = Libro("El señor de los anillos", "987-654-321", ["Un día ...............", "Los Hobbits ............", "En efecto .........."])

# AGREGACIÓN
biblioteca.agregar_libro(libro1)
biblioteca.agregar_libro(libro2)

# ASOCIACIÓN
estudiante1 = Estudiante("JB007", "Juan Pérez")
estudiante2 = Estudiante("ABC123", "Pedro Picapiedra")
prestamo1 = biblioteca.prestar_libro(estudiante1, libro1)
prestamo2 = biblioteca.prestar_libro(estudiante2, libro2)

# RESULTADOS
biblioteca.mostrar_estado()
estudiante1.mostrar_info()
prestamo1.mostrar_info()
autor1.mostrar_info()
libro1.leer()