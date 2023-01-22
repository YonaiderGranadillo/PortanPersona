$(document).ready(function() {
  // on ready
});


async function registrarUsuario(){
let datos={};
datos.nombre= document.getElementById('txtnombre').value;
datos.apellido= document.getElementById('txtapellido').value;
datos.email= document.getElementById('txtemail').value;
datos.password= document.getElementById('txtpassword').value;

let repetirpassword = document.getElementById('txtrepetirpassword').value;

if(repetirpassword != datos.password){
   alert('Las contraseñas no coinciden');
return;

}

  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body:JSON.stringify(datos)
  });
}

