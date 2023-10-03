window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki



   cargarEmpleados();
   const datatablesSimple = document.getElementById('datatablesSimple');
   if (datatablesSimple) {
            new simpleDatatables.DataTable(datatablesSimple);
        }


    async function cargarEmpleados() {

        const request = await fetch('indice', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
        });
        const empleados = await request.json();

        let listadoHTML = '';
        for (let empleado of empleados){
            let empleadoHTML = '<tr><td>' + empleado.nempleado + '</td><td>' + empleado.nombre + '</td><td>'
             + empleado.apellidos + '</td><td>' + empleado.fingreso + '</td><td>' + empleado.salario + '</td></tr>';
            listadoHTML += empleadoHTML;
        }

                document.querySelector('tbody').outerHTML = listadoHTML;

    }

});
