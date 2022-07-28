/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Autor;
import servicio.AutorServicio;

/**
 *
 * @author PC-1
 */
public class AutorControl {
    
    private final AutorServicio autorServicio = new AutorServicio();
    
    
    public Autor crear(String [] args){
        Autor autor = new Autor(Integer.valueOf(args[0]),args[1]);
        this.autorServicio.crear(autor);
        return autor;
    }
    
    public Autor buscarAutor(String arg){
        return this.autorServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public List<Autor> listar(){
        return this.autorServicio.listar();
    }
}
