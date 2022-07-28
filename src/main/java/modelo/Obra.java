/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PC-1
 */
public class Obra {
    
    private int codigo;
    private String nombre;
    private String obra;
    private Autor autor;

    public Obra(int codigo, String nombre, String obra, Autor autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.obra = obra;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObra() {
        return obra;
    }

    public void setObra(String obra) {
        this.obra = obra;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Obra{" + "codigo=" + codigo + ", nombre=" + nombre + ", obra=" + obra + ", autor=" + autor + '}';
    }
    
    
    
}
