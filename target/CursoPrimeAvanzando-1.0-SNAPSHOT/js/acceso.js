function acceder(){

if (document.form.password.value=='123456' && document.form.login.value=='administrador'){ 
        document.form.submit(); 
    } 
    else{ 
         alert("Porfavor ingrese nombre de usuario y contraseña correctos."); 
    } 
} 