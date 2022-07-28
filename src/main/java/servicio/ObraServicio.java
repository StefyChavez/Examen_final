/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Obra;

/**
 *
 * @author PC-1
 */
public class ObraServicio implements IObraServicio{
    
    private static List<Obra> obraList = new ArrayList<>();

    @Override
    public Obra crear(Obra obra) {
        this.obraList.add(obra);
        return obra;
    }


    @Override
    public Obra buscarPorCodigo(int codigoObra) {
        Obra obra =null;
        for(var o:this.obraList){
            if(codigoObra==o.getCodigo()){
                obra=o;
                break;
            }
        }
        return obra;
    }

    @Override
    public List<Obra> listar() {
        return this.obraList;
    }

    @Override
    public int buscarPosicion(Obra obra) {
        int posicion=-1;
        for(var e:this.obraList){
            posicion++;
            if(e.getCodigo()==obra.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
