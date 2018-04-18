package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author mpluas
 */
public class Libros implements Serializable {

    private String isbn;
    private String titulo;
    private String descripcion;
    private String nombreAutor;
    private String publicacion;
    private String fechaRegistro;
    private int categoriaId;
    private String editorialNit;
    
    public Libros() {
    }

    public Libros(String isbn, String titulo, String descripcion, String nombreAutor, String publicacion, String fechaRegistro, int categoriaId, String editorialNit) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombreAutor = nombreAutor;
        this.publicacion = publicacion;
        this.fechaRegistro = fechaRegistro;
        this.categoriaId = categoriaId;
        this.editorialNit = editorialNit;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getCategoriaId() {
        return categoriaId;
    }

    public void setCategoriaId(int categoriaId) {
        this.categoriaId = categoriaId;
    }

    public String getEditorialNit() {
        return editorialNit;
    }

    public void setEditorialNit(String editorialNit) {
        this.editorialNit = editorialNit;
    }
    
}
