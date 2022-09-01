/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author labc205
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private sexo Sexo;

    public Persona(int id, String nombre, String apellido, String email, sexo Sexo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Sexo = Sexo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public sexo getSexo() {
        return Sexo;
    }

    public void setSexo(sexo Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", Sexo=" + Sexo + '}';
    }
    
    
    
    
}
