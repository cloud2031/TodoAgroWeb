
package com.controller;

import com.ejb.ProductoFacadeLocal;
import com.model.Producto;
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
public class ProductoController implements Serializable {

    @EJB
    private ProductoFacadeLocal productoFacade;
    List<Producto> listaProducto;
    private Producto producto;
    String mensaje = "";

    @PostConstruct
    public void init() {
        this.producto = new Producto();

    }

    public Producto getProducto() {
        return producto;
    }

    public List<Producto> getListaProducto() {
        this.listaProducto = this.productoFacade.findAll();
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public void guardar() {
        try {
            this.productoFacade.create(producto);
            this.producto = new Producto();
            this.mensaje = "Almacenado Con exito";
        } catch (Exception e) {
            e.printStackTrace();
            this.mensaje = "Error " + e.getMessage();

        }
        FacesMessage mens = new FacesMessage(this.mensaje);

        FacesContext.getCurrentInstance().addMessage(null, mens);
    }

    public void eliminar(Producto c) {
        try {
            this.productoFacade.remove(c);
            this.producto = new Producto();
            this.mensaje = "Eliminado Con exito";
        } catch (Exception e) {
            e.printStackTrace();
            this.mensaje = "Error " + e.getMessage();

        }
        FacesMessage mens = new FacesMessage(this.mensaje);

        FacesContext.getCurrentInstance().addMessage(null, mens);
    }

    public void actualizar() {
        try {
            this.productoFacade.edit(producto);
            this.producto = new Producto();
            this.mensaje = "Actualizado Con exito";
        } catch (Exception e) {
            e.printStackTrace();
            this.mensaje = "Error " + e.getMessage();

        }
        FacesMessage mens = new FacesMessage(this.mensaje);

        FacesContext.getCurrentInstance().addMessage(null, mens);
    }

    public void cargarID(Producto c) {
        this.producto = c;

    }

    public void limpiar() {
        this.producto = new Producto();
    }
}
