import React from "react";

const CardPe = ({ tie, borrarPedido }) => {
  return (

    <div class="col">
      <div class="card border-dark mb-3">
        <div class="card-body">
          <h5 class="card-title">{tie.cliente}</h5>
          <p class="card-text">{tie.direccion}</p>
          <hr/>
          <p class="card-text">{tie.total}</p>
        </div>
        <button class="btn btn-primary" >Ver más detalles</button>
        <div class="card-footer" />
        <button class="btn btn-secondary" onClick={() => borrarPedido(tie.id)}  >Eliminar</button>
        <div class="card-footer" />
      </div>
    </div>


  );
};
export default CardPe;