/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Autor;
import modelo.Obra;
import servicio.AutorServicio;
import servicio.ObraServicio;

/**
 *
 * @author PC-1
 */
public class ObraControl {
    
    private final ObraServicio obraServicio = new ObraServicio();
    private final AutorServicio autorServicio = new AutorServicio();
    
    public Obra crear(String [] args){
        Autor autor = this.autorServicio.buscarPorCodigo(Integer.valueOf(args[0]));
        Obra obra = new Obra(Integer.valueOf(args[0]),args[1],args[2],autor);
        this.obraServicio.crear(obra);
        return obra;
    }
    
    public Obra buscarObra(String arg){
        return this.obraServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    
    public List<Obra> listar(){
        return this.obraServicio.listar();
    }
    
}
