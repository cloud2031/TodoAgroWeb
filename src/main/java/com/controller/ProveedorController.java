
package com.controller;

import com.ejb.ProductoFacadeLocal;
import com.model.Proveedor;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class ProveedorController implements Serializable {
    
     @EJB
    private ProveedorController proveedorFacade;
    List<Proveedor> listaProveedor;
    private Proveedor proveedor;
    String mensaje="";
    
    @PostConstruct
    public void init(){
        this.proveedor= new Proveedor();
        
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    

}
    

