
package com.ejb;

import com.model.cliente;
import java.util.List;
import javax.ejb.Local;


@Local
public interface clienteFacadeLocal {

    void create(cliente cliente);

    void edit(cliente cliente);

    void remove(cliente cliente);

    cliente find(Object id);

    List<cliente> findAll();

    List<cliente> findRange(int[] range);

    int count();
    
}
