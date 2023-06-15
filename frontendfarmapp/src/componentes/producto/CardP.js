import React from "react";

const CardP = ({ tie, borrarProducto }) => {
  return (

    <div class="col">
      <div class="card border-dark mb-3">
        <img src={tie.imagen} class="card-img-top" alt="" />
        <div class="card-body">
          <h5 class="card-title">{tie.nombre}</h5>
          <p class="card-text">{tie.caracteristicas}</p>
        </div>
        <button class="btn btn-primary" >Comprar</button>
        <div class="card-footer" />
        <button class="btn btn-secondary" onClick={() => borrarProducto(tie.id)}   >Eliminar</button>
        <div class="card-footer" />
      </div>
    </div>


  );
};
export default CardP;