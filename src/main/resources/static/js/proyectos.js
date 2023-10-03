window.addEventListener('DOMContentLoaded', event => {
    // Simple-DataTables
    // https://github.com/fiduswriter/Simple-DataTables/wiki

    cargarProyectos();
    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }

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
                    let proyectoHTML = '<tr><td>' + proyecto.cproyecto + '</td><td>' + proyecto.nombre + '</td><td>' + proyecto.descripcion + '</td><td>' + " - " + '</td></tr>';
                    listadoHTML += proyectoHTML;
                }

                        document.querySelector('tbody').outerHTML = listadoHTML;

            }
});
