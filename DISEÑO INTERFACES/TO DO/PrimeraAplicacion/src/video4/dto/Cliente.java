/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package video4.dto;

import java.util.Date;

/**
 *
 * @author DAM
 */
public class Cliente {
    private String nombre;
    private String apellidos;
    private Date fechaAlta;
    private String provincia;

    public Cliente(String nombre, String apellidos, Date fechaAlta, String provincia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaAlta = fechaAlta;
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    
    public String[] toArrayString(){
        String[] s = new String[4];
        s[0] = this.nombre;
        s[1] = this.apellidos;
        s[2] = this.fechaAlta.toString();
        s[3] = this.provincia;
        return s;
    }
}
