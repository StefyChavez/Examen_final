/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Autor;

/**
 *
 * @author PC-1
 */
public interface IAutorServicio {
    
    public Autor crear(Autor autor);
    public Autor buscarPorCodigo(int codigoAutor);
    public int buscarPosicion(Autor autor);
    public List<Autor> listar();
    
}
