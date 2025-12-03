/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamenu;

/**
 *
 * @author HP AMD Ryzen 5
 */
public class AutorInfo {
    private String nombre;
    private String nacionalidad;
    private String fechaNacimiento;

    public AutorInfo(String nombre, String nacionalidad, String fechaNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    
}
