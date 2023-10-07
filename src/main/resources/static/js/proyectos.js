window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    cargarProyectos();
    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }
});

        async function cargarProyectos() {

                const request = await fetch('proyectos', {
                    method: 'GET',
                    headers: {
                        'Accept': 'application/json',
                        'Content-Type': 'application/json'
                    }
                });
                const proyectos = await request.json();

                let listadoHTML = '';
                for (let proyecto of proyectos){
                    let botonEliminar = '<a href="#" onclick="eliminarProyecto(' + proyecto.cproyecto + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                    let botonEditar = '<a href="#" onclick="editarProyecto(' + proyecto.cproyecto + ')" class="btn btn-info btn-circle btn-sm"><i class="fas fa-info-circle"></i></a>';


                    let proyectoHTML = '<tr><td>' + proyecto.cproyecto + '</td><td>' + proyecto.nombre + '</td><td>' + proyecto.descripcion + '</td><td>' + botonEliminar + '  ' + botonEditar + '</td></tr>';
                    listadoHTML += proyectoHTML;
                }

                        document.querySelector('tbody').outerHTML = listadoHTML;

        }

        async function eliminarProyecto(cproyecto) {
                if (!confirm('ATENCIÓN - ¿Desea eliminar este Proyecto?')) {return;}

                 alert(cproyecto);

                 const request = await fetch('eliminarproyecto/' + cproyecto, {
                    method: 'DELETE',
                    headers: {
                        'Accept': 'application/json',
                        'Content-type': 'application/json'
                    }
                 });

                 location.reload();
        }


