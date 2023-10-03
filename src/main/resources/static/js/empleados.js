window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    cargarEmpleados();
    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }

    async function cargarEmpleados() {

            const request = await fetch('empleados', {
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            });
            const empleados = await request.json();


            let listadoHTML = '';
            for (let empleado of empleados){
                let botonEliminar = '<a href="#" onclick="eliminarUsuario(' + empleado.nempleado + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                let botonEditar = '<a href="#" onclick="editarUsuario(' + empleado.nempleado + ')" class="btn btn-info btn-circle btn-sm"><i class="fas fa-info-circle"></i></a></td>';

                let empleadoHTML = '<tr><td>' + empleado.nempleado + '</td><td>'
                                              + empleado.nombre + '</td><td>'
                                              + empleado.apellidos + '</td><td>'
                                              + empleado.dni + '</td><td>'
                                              + empleado.fingreso + '</td><td>'
                                              + empleado.salario + '</td><td>'
                                               + botonEliminar + '  ' + botonEditar + '</td></tr>';
                listadoHTML += empleadoHTML;
            }

                    document.querySelector('tbody').outerHTML = listadoHTML;

        }

    async function eliminarUsuario(id) {
        if (!confirm('ATENCIÓN - ¿Desea eliminar este Empleado?')) {return;}

         alert(id);

         const request = awit fetch('eliminar/' + id, {
            method: 'DELETE'
            headers: {
                'Accept': 'application/json',
                'Content-type': 'application/json'
            }
         });

         location.reload();
    }

});
