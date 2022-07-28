/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Obra;

/**
 *
 * @author PC-1
 */
public interface IObraServicio {
    
    public Obra crear(Obra obra);
    public Obra buscarPorCodigo(int codigoObra);
    public int buscarPosicion(Obra obra);
    public List<Obra> listar();
    
}
