/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Autor;

/**
 *
 * @author PC-1
 */
public class AutorServicio implements IAutorServicio {
    
    private static List<Autor> autorList = new ArrayList<>();

    @Override
    public Autor crear(Autor autor) {
        this.autorList.add(autor);
        return autor;
    }


    @Override
    public Autor buscarPorCodigo(int codigoAutor) {
        Autor autor=null;
        for(var a:this.autorList){
            if(codigoAutor==a.getCodigo()){
                autor=a;
                break;
            }
        }
        return autor;
    }

    @Override
    public List<Autor> listar() {
        return this.autorList;
    }

    @Override
    public int buscarPosicion(Autor autor) {
        int posicion=-1;
        for(var e:this.autorList){
            posicion++;
            if(e.getCodigo()==autor.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
