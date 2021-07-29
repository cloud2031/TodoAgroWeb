package com.ejb;

import com.model.Categoria;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> implements CategoriaFacadeLocal {
    @PersistenceContext(unitName = "primePooltodoagro")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }   
    
    public CategoriaFacade() {
        super(Categoria.class);
    }
    
}
