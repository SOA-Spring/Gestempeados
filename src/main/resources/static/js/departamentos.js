window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    cargarDepartamentos();
    const datatablesSimple = document.getElementById('datatablesSimple');


    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }

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
                let departamentoHTML = '<tr><td>' + departamento.cdepartamento + '</td><td>' + departamento.departamento + '</td><td>' + " - " + '</td></tr>';
                listadoHTML += departamentoHTML;
            }

                    document.querySelector('tbody').outerHTML = listadoHTML;

        }
});
