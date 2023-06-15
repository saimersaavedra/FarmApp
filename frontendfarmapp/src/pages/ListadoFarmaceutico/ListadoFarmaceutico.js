import FarmaceuticoListado from "../../componentes/farmaceutico/FarmaceuticoListado";

const ListadoFarmaceutico = () => {
  return (
    <div className="container-sm" >
      <div>
        <div class="card mb-3">
          <div class="card-body">
            <h5 class="card-title">Farmaceuticos registrados.</h5>
            <p class="card-text">Trabajadores con resgistro en el local, se pueden realizar updates a los us..</p>
            <p class="card-text"><small class="text-body-secondary">ultima actualización hace 1 minuto..</small></p>
          </div>
        </div>
      </div>
            <FarmaceuticoListado/>
    </div>
  )
}

export default ListadoFarmaceutico;