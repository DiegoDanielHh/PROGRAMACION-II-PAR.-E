/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamenu;

/**
 *
 * @author HP AMD Ryzen 5
 */
public class EstudianteInfo {
    private String nombreEstudiante;
    private String matricula;
    private String libroSolicitado;

    public EstudianteInfo(String nombreEstudiante, String matricula, String libroSolicitado) {
        this.nombreEstudiante = nombreEstudiante;
        this.matricula = matricula;
        this.libroSolicitado = libroSolicitado;
    }

    public String getNombreEstudiante() { return nombreEstudiante; }
    public String getMatricula() { return matricula; }
    public String getLibroSolicitado() { return libroSolicitado; }
    
    public void setNombreEstudiante(String nombreEstudiante) { this.nombreEstudiante = nombreEstudiante; }
    public void setMatricula(String matricula) { this.matricula = matricula; }
    public void setLibroSolicitado(String libroSolicitado) { this.libroSolicitado = libroSolicitado; }
    
}
