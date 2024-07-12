import Pedidos from "../../componentes/pedido/Pedido";

const Pedido = () => {
  return (
    <div className="container-sm" >
      <div>
        <div class="card mb-3">
          <div class="card-body">
            <h5 class="card-title">Pedidos registrados</h5>
            <p class="card-text">todas las facturas hechas por usuarios.</p>
          </div>
        </div>
      </div>
            <Pedidos/>
    </div>
  )
}

export default Pedido;