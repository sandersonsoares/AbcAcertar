/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.applet.AudioClip;

/**
 *
 * @author Sandersoon
 */
public class Letra {
    
    private int id;
    private Som som;
    private char letra;

    public Letra(char letra, int id, Som som) {
        this.letra = letra;
        this.id = id;
        this.som = som;
    }

    public Som getSom() {
        return som;
    }

    public void setSom(Som som) {
        this.som = som;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Letra{" + "id=" + id + ", letra=" + letra + '}';
    }
    
}
