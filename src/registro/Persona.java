/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro;

/**
 *
 * @author agustin
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private boolean estaPresente;
    private boolean fueSorteado;
    
    public Persona(){
        this.nombre = null;
        this.apellido = null;
        this.estaPresente= false;
        this.fueSorteado= false;
    }

    public Persona(String nombre, String apellido, boolean estaPresente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaPresente = estaPresente;
        this.fueSorteado = false;
    }
    
    /*
    Getters y Setters
    */

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isEstaPresente() {
        return estaPresente;
    }

    public boolean isFueSorteado() {
        return fueSorteado;
    }
    

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstaPresente(boolean estaPresente) {
        this.estaPresente = estaPresente;
    }

    public void setFueSorteado(boolean fueSorteado) {
        this.fueSorteado = fueSorteado;
    }
    
    
    
}
