package com.mycompany.tareamenu;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;

public class JsonUtil {

    public static List<LibroInfo> leerLibros() {
        try (FileReader r = new FileReader("libros.json")) {
            return new Gson().fromJson(r, new TypeToken<List<LibroInfo>>(){}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    public static List<AutorInfo> leerAutores() {
        try (FileReader r = new FileReader("autores.json")) {
            return new Gson().fromJson(r, new TypeToken<List<AutorInfo>>(){}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    // Aquí usamos EstudianteInfo en lugar de PrestamoInfo
    public static List<EstudianteInfo> leerPrestamos() {
        try (FileReader r = new FileReader("prestamos.json")) {
            return new Gson().fromJson(r, new TypeToken<List<EstudianteInfo>>(){}.getType());
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
    public static boolean guardarLibro(LibroInfo libro) {
        List<LibroInfo> libros = leerLibros();

        // Verificar duplicado por título
        for (LibroInfo l : libros) {
            if (l.getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                return false; // ya existe
            }
        }

        libros.add(libro);
        try (FileWriter writer = new FileWriter("libros.json")) {
            new Gson().toJson(libros, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public static boolean eliminarLibro(String titulo) {
        List<LibroInfo> libros = leerLibros();
        boolean eliminado = libros.removeIf(l -> l.getTitulo().equalsIgnoreCase(titulo));
        try (FileWriter writer = new FileWriter("libros.json")) {
            new Gson().toJson(libros, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eliminado;
    }
    
    public static boolean guardarAutor(AutorInfo autor) {
        List<AutorInfo> autores = leerAutores();

        for (AutorInfo a : autores) {
            if (a.getNombre().equalsIgnoreCase(autor.getNombre())) {
                return false; // ya existe
            }
        }

        autores.add(autor);
        try (FileWriter writer = new FileWriter("autores.json")) {
            new Gson().toJson(autores, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public static boolean eliminarAutor(String nombre) {
        List<AutorInfo> autores = leerAutores();
        boolean eliminado = autores.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
        try (FileWriter writer = new FileWriter("autores.json")) {
            new Gson().toJson(autores, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eliminado;
    }

    public static boolean guardarPrestamo(EstudianteInfo prestamo) {
        List<EstudianteInfo> prestamos = leerPrestamos();

        for (EstudianteInfo p : prestamos) {
            if (p.getMatricula().equalsIgnoreCase(prestamo.getMatricula())) {
                return false; // ya existe
            }
        }

        prestamos.add(prestamo);
        try (FileWriter writer = new FileWriter("prestamos.json")) {
            new Gson().toJson(prestamos, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    
    public static boolean eliminarPrestamo(String matricula) {
        List<EstudianteInfo> prestamos = leerPrestamos();
        boolean eliminado = prestamos.removeIf(p -> p.getMatricula().equalsIgnoreCase(matricula));
        try (FileWriter writer = new FileWriter("prestamos.json")) {
            new Gson().toJson(prestamos, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return eliminado;
    }
    public static boolean modificarLibro(String tituloBuscado, String nuevoTitulo, Integer nuevoAnio, String nuevoAutor) {
        List<LibroInfo> libros = leerLibros();
        boolean modificado = false;

        for (LibroInfo l : libros) {
            if (l.getTitulo().equalsIgnoreCase(tituloBuscado)) {
                // Si el usuario deja un campo vacío, se mantiene el valor anterior
                if (nuevoTitulo != null && !nuevoTitulo.isEmpty()) {
                    l.setTitulo(nuevoTitulo);
                }
                if (nuevoAnio != null) {
                    l.setAnio(nuevoAnio);
                }
                if (nuevoAutor != null && !nuevoAutor.isEmpty()) {
                    l.setAutor(nuevoAutor);
                }
                modificado = true;
                break;
            }
        }

        if (modificado) {
            try (FileWriter writer = new FileWriter("libros.json")) {
                new Gson().toJson(libros, writer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return modificado;
    }
    public static boolean modificarAutor(String nombreBuscado, String nuevoNombre, String nuevaNacionalidad, String nuevaFecha) {
        List<AutorInfo> autores = leerAutores();
        boolean modificado = false;

        for (AutorInfo a : autores) {
            if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                    a.setNombre(nuevoNombre);
                }
                if (nuevaNacionalidad != null && !nuevaNacionalidad.isEmpty()) {
                    a.setNacionalidad(nuevaNacionalidad);
                }
                if (nuevaFecha != null && !nuevaFecha.isEmpty()) {
                    a.setFechaNacimiento(nuevaFecha);
                }
                modificado = true;
                break;
            }
        }

        if (modificado) {
            try (FileWriter writer = new FileWriter("autores.json")) {
                new Gson().toJson(autores, writer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return modificado;
    }
    public static boolean modificarPrestamo(String matriculaBuscada, String nuevoNombre, String nuevaMatricula, String nuevoLibro) {
        List<EstudianteInfo> prestamos = leerPrestamos();
        boolean modificado = false;

        for (EstudianteInfo p : prestamos) {
            if (p.getMatricula().equalsIgnoreCase(matriculaBuscada)) {
                if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                    p.setNombreEstudiante(nuevoNombre);
                }
                if (nuevaMatricula != null && !nuevaMatricula.isEmpty()) {
                    p.setMatricula(nuevaMatricula);
                }
                if (nuevoLibro != null && !nuevoLibro.isEmpty()) {
                    p.setLibroSolicitado(nuevoLibro);
                }
                modificado = true;
                break;
            }
        }

        if (modificado) {
            try (FileWriter writer = new FileWriter("prestamos.json")) {
                new Gson().toJson(prestamos, writer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return modificado;
    }
}
