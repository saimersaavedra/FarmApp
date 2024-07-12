import React from "react";

const CardP = ({ tie, borrarProducto }) => {
  console.log("ola");
  return (
    <div className="col">
      <div className="card border-dark mb-3">
        <img src={tie.imagen} className="card-img-top" alt="" />
        <div className="card-body">
          <h5 className="card-title">{tie.nombre}</h5>
          <p className="card-text">{tie.caracteristicas}</p>
        </div>
        <button className="btn btn-primary">Comprar</button>
        <div className="card-footer" />
        <button className="btn btn-secondary" onClick={() => borrarProducto(tie.id)}>
          Eliminar
        </button>
        <button type="button" class="btn btn-dark" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Ver más</button>
        <div>

          <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
              <div class="modal-content">
                <div class="modal-header">
                  <h1 class="modal-title fs-5" id="exampleModalLabel">Producto</h1>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  <section className='section'>
                    <div className='container'>
                      <div className='card shadow'>
                        <div className='card-body'>
                          <div className='row'>
                            <h6>Detalle del producto</h6>
                            <form >
                              <hr />
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Nit</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.id}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Nombre</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.nombre}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Referencia</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.referencia}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Caracteristicas</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.caracteristicas}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Efecto secundarios</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.efectSecundarios}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Fecha de vencimiento</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.fecha}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Precio</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.precio}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Calidad</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.calidad}</label>
                              </div>
                              <div class="input-group mb-3">
                                <span class="input-group-text" id="basic-addon1">Nivel-Precio</span>
                                <label
                                  type="text"
                                  className='form-control'
                                  aria-label="Username"
                                  aria-describedby="basic-addon1"
                                >{tie.nivelPrecio}</label>
                              </div>
                              <hr />
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
        <div className="card-footer" />
      </div>
    </div>
  );
};

export default CardP;
