package com.controller;

import com.ejb.clienteFacadeLocal;
import com.model.cliente;
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

public class clientecontroller implements Serializable {
    
    @EJB
    private clienteFacadeLocal clienteFacade;
    List<cliente> listacliente;
    private cliente cliente;
    String mensaje="";

    
    
    @PostConstruct
    public void init(){
        this.cliente= new cliente();
        
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public List<cliente> getListaCliente() {
        this.listacliente = this.clienteFacade.findAll();
        return listacliente;
    }

    public void setListaCliente(List<cliente> listacliente) {
        this.listacliente = listacliente;
    }
    
    public void guardar(){
        try{
            this.clienteFacade.create(cliente);
            this.cliente= new cliente();
            this.mensaje ="Almacenado Con exito";
        }catch(Exception e){
            e.printStackTrace();
            this.mensaje= "Error "+ e.getMessage();
            
        }
        FacesMessage mens = new FacesMessage(this.mensaje);
            
        FacesContext.getCurrentInstance().addMessage(null, mens);
    }
    
    public void eliminar(cliente c){
        try{
            this.clienteFacade.remove(c);
            this.cliente = new cliente();
            this.mensaje ="Eliminado Con exito";
        }catch(Exception e){
            e.printStackTrace();
            this.mensaje= "Error "+ e.getMessage();
            
        }
        FacesMessage mens = new FacesMessage(this.mensaje);
            
        FacesContext.getCurrentInstance().addMessage(null, mens);
    }
     public void actualizar(){
        try{
            this.clienteFacade.edit(cliente);
            this.cliente = new cliente();
            this.mensaje ="Actualizado Con exito";
        }catch(Exception e){
            e.printStackTrace();
            this.mensaje= "Error "+ e.getMessage();
            
        }
        FacesMessage mens = new FacesMessage(this.mensaje);
            
        FacesContext.getCurrentInstance().addMessage(null, mens);
    }
    public void cargarID(cliente c ){
        this.cliente= c;
        
    }
    public void limpiar(){
        this.cliente = new cliente();
    }
    
    
}

    

