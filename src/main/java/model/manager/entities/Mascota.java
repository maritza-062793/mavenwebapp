/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.manager.entities;

/**
 *
 * @author KEV
 */
public class Mascota {
    private String id_mascota;
    private String tipo_mascota;
    private String nombres;
    private String edad;
    private String raza;
    private String duenio;

    public Mascota(String id_mascota, String tipo_mascota, String nombres, String edad, String raza, String duenio) {
        this.id_mascota = id_mascota;
        this.tipo_mascota = tipo_mascota;
        this.nombres = nombres;
        this.edad = edad;
        this.raza = raza;
        this.duenio = duenio;
    }

   

    
    
    public String getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(String id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getTipo_mascota() {
        return tipo_mascota;
    }

    public void setTipo_mascota(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    
}
