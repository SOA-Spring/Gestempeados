window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    cargarDepartamentos();
    const datatablesSimple = document.getElementById('datatablesSimple');


    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }
});

        async function cargarDepartamentos() {

            const request = await fetch('departamentos', {
                method: 'GET',
                headers: {
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            });
            const departamentos = await request.json();

            let listadoHTML = '';
            for (let departamento of departamentos){
                let botonEliminar = '<a href="#" onclick="eliminarDepartamento(' + departamento.cdepartamento + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                                let botonEditar = '<a href="#" onclick="editarDepartamento(' + departamento.cdepartamento + ')" class="btn btn-info btn-circle btn-sm"><i class="fas fa-info-circle"></i></a></td>';

                let departamentoHTML = '<tr><td>' + departamento.cdepartamento + '</td><td>' + departamento.departamento + '</td><td>' + botonEliminar + '  ' + botonEditar +  '</td></tr>';
                listadoHTML += departamentoHTML;
            }

                    document.querySelector('tbody').outerHTML = listadoHTML;

        }

        async function eliminarDepartamento(cdepartamento) {
            if (!confirm('ATENCIÓN - ¿Desea eliminar este Departamento?')) {return;}

             alert(cdepartamento);

             const request = await fetch('eliminardepart/' + cdepartamento, {
                method: 'DELETE',
                headers: {
                    'Accept': 'application/json',
                    'Content-type': 'application/json'
                }
             });

             location.reload();
        }


