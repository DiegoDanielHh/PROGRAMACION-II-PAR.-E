/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamenu;

/**
 *
 * @author HP AMD Ryzen 5
 */
public class LibroInfo {
    private String titulo;
    private int anio;
    private String autor;

    public LibroInfo(String titulo, int anio, String autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public int getAnio() { return anio; }
    public String getAutor() { return autor; }
    
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAnio(int anio) { this.anio = anio; }
    public void setAutor(String autor) { this.autor = autor; }
    
}
