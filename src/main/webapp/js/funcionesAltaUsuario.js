/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function resetearFormulario(){
    document.getElementById("FormularioAlta").reset();
    var avisoContraseña = document.getElementById("avisoContraseña");
    var btnEnviarDatos = document.getElementById("btnEnviarDatos");
    
    btnEnviarDatos.disabled = true;
    avisoContraseña.innerHTML = "---------";
    avisoContraseña.style.color = "black";
}

function usuarioGeneradoAutomaticamnte(){
    
    var curp = document.getElementById("txtCodigoSeguridad");
    var nombre = document.getElementById("txtNombre");
    var apellidos = document.getElementById("txtApellidos");
    
    var usuarioGeneradoAutomaticamente = document.getElementById("txtUsuarioGeneradoAutomaticamente");
    
    
    var resultadoCombinado = curp.value.slice(0,3) + nombre.value.slice(0,3) + apellidos.value.slice(0,3) + "@correo.com";
    
    usuarioGeneradoAutomaticamente.value = resultadoCombinado;
    
    if(curp.value.length ==0 || nombre.value.length ==0 || apellidos.value.length == 0){
         usuarioGeneradoAutomaticamente.value = "";
    }
} 
function coincidirContraseña(){
    
   var txtContraseña = document.getElementById("txtContraseña");
   var txtRepetirContraseña = document.getElementById("txtRepetirContraseña");
   var avisoContraseña = document.getElementById("avisoContraseña");
   var btnEnviarDatos = document.getElementById("btnEnviarDatos");
   
   btnEnviarDatos.disabled = true; //Boton empezando apagado
   
   if(txtContraseña.value.length == 0 || txtRepetirContraseña.value.length ==0){
        avisoContraseña.innerHTML = "Ninguna de las contraseñas pueden quedar vacias";
        avisoContraseña.style.color = "red"; 
        btnEnviarDatos.disabled = true;
        
    }else if(txtContraseña.value != txtRepetirContraseña.value){
        avisoContraseña.innerHTML = "Las contraseñas no coinciden";
        avisoContraseña.style.color = "red";
        btnEnviarDatos.disabled = true;
        
    }else{
        avisoContraseña.innerHTML = "Las contraseñas coinciden";
        avisoContraseña.style.color = "green";
        btnEnviarDatos.disabled = false;
      }
      
          
}