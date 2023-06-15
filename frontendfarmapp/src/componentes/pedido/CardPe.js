import React from "react";

const CardPe = ({ tie, borrarPedido }) => {
  return (

    <div class="col">
      <div class="card border-dark mb-3">
        <div class="card-body">
        <h5 class="card-title">CLIENTE</h5>
        <h5 class="card-title">{tie.cliente}</h5>
          <hr/>
        </div>
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Ver más</button>
        <div>
       
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="exampleModalLabel">{tie.id}</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      <section className='section'>
      <div className='container'>
        <div className='card shadow'>
          <div className='card-body'>
            <div className='row'>
            <h6>Detalle de la factura del pedido</h6>
            <form >
            <hr />
                   <label className="mb-1">DIRECCION</label>
                  <label
                    className='form-control'
                  >
                    {tie.direccion}
                  </label>
                   <label className="mb-1">CLIENTE</label>
                  <label
                    className='form-control'

                  >
                  {tie.cliente}
                  </label>
                   <label className="mb-1">FECHA PEDIDO</label>
                  <label
                    className='form-control'
                  >
                    {tie.fecha}
                  </label>
                   <label className="mb-1">TOTAL</label>
                  <label
                    className='form-control'
                  >{tie.total}</label>
                   <hr/>
                </form>
              </div>
            </div>
          </div>
      </div>
    </section>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
        </div>
        <div class="card-footer" />
        <button class="btn btn-secondary" onClick={() => borrarPedido(tie.id)}  >Eliminar</button>
        <div class="card-footer" />
      </div>
    </div>


  );
};
export default CardPe;