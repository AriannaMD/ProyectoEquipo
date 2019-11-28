package com.gmail.moralesduranarianna.libros;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "LIBROS")
public class Libro implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "LIBROS_ID")
  private Integer id;
  
  @NotNull
  @Size(min = 1, max = 255)
  @Column(name = "LIBROS_NOMBRE")
  private String nombre;
  
  @NotNull
  @Size(min = 10 , max = 255)
  @Column(name = "LIBROS_AUTOR")
  private String autor;
  
  @NotNull
  @Size(min = 2, max = 255)
  @Column(name = "LIBROS_EDITORIAL")
  private String editorial;
  
  @NotNull
  @Size(min = 2, max = 255)
  @Column(name = "LIBROS_LUGAR")
  private String lugar;
  
  public Integer getId() {
    return id;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public void setAutor(String autor) {
      this.autor = autor;
  }
  public String getAutor() {
      return autor;
  }
  public void setEditorial(String editorial) {
      this.editorial = editorial;
  }
  public String getEditorial() {
      return editorial;
  }
  public void setLugar(String lugar) {
      this.lugar = lugar;
  }
  public String getLugar() {
      return lugar;
  }
  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }
  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Libro)) {
      return false;
    }
    Libro other = (Libro) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.
        equals(other.id))) {
      return false;
    }
    return true;
  }
  @Override
  public String toString() {
    return "com.gmail.moralesduranarianna.Libros[ id=" + id + " ]";
  }
}
