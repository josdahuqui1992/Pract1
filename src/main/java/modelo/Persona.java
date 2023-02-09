/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Jose David Huertas Q
 */
public class Persona {
    private String cod;
    private String Nom;
    private String dire;

    public Persona(String cod, String Nom, String dire) {
        this.cod = cod;
        this.Nom = Nom;
        this.dire = dire;
    }

    public String getDire() {
        return dire;
    }

    public void setDire(String dire) {
        this.dire = dire;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    
    
}
