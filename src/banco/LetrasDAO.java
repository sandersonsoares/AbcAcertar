/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import entidade.Letra;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sandersoon
 */
public class LetrasDAO {

    List<Letra> alfabeto;
    
    public LetrasDAO() {
        alfabeto = new ArrayList<>();
    }
    
    public boolean salvar(Letra letra){
        Letra b = buscar(letra);
        if(b == null){
            alfabeto.add(letra);
            return true;
        }
        return false;
    }
    
    public Letra buscar(Letra letra){
        for (Letra l : alfabeto) {
            if(letra.equals(l)){
                return l;
            }
        }
        return null;
    }
    
    public Letra buscarId(int id){
        for (Letra l : alfabeto) {
            if(l.getId() == id){
                return l;
            }
        }
        return null;
    }
    
    public boolean excluir(Letra letra){
       for (Letra l : alfabeto) {
            if(letra.equals(l)){
                alfabeto.remove(l);
                return true;
            }
        }
        return false;
    }
    
    public List<Letra> listarAlfabeto(){
        return alfabeto;
    }
    
}
