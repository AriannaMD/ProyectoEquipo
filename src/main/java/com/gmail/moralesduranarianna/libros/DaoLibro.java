package com.gmail.moralesduranarianna.libros;

import java.util.List;
import javax.ejb.Stateless;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;


@Stateless
@Dependent
public class DaoLibro {
  
  @Inject
  private EntityManager em;
  public List<Libro> consulta() {
    
    return em.createQuery("SELECT c FROM Libro c ORDER BY c.nombre",
        Libro.class).getResultList();
  }
  public Libro busca(Integer id) {
    return em.find(Libro.class, id);
  }
  public void agrega(Libro modelo) {
    em.persist(modelo);
  }
  public void modifica(Libro modelo) {
    em.merge(modelo);
  }
  public void elimina(Libro modelo) {
    
    final Libro anterior = em.find(Libro.class, modelo.getId());
    
    if (anterior != null) {
      
      em.remove(anterior);
    }
  }
}