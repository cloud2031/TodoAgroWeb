
package com.ejb;

import com.model.cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class clienteFacade extends AbstractFacade<cliente> implements clienteFacadeLocal {

    @PersistenceContext(unitName = "primePooltodoagro")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public clienteFacade() {
        super(cliente.class);
    }
    
}
