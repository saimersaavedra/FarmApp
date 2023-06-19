import React, { useState } from 'react';


const AgregarProducto = ({ createFarmaceutico }) => {
  const [newProducto, setNewProducto] = useState({ idproducto: '', nombre: '', referencia: '', caracteristicas: '', efectSecundarios: '', fecha_vencimiento: '', imagen: '', precio: '', calidad: '', nivelPrecio: '' });

  const handleInputChange = (e) => {
    setNewProducto({ ...newProducto, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    createFarmaceutico(newProducto);
    setNewProducto({ idproducto: '', nombre: '', referencia: '', caracteristicas: '', efectSecundarios: '', fecha_vencimiento: '', imagen: '', precio: '', calidad: '', nivelPrecio: '' });
  };

  return (
    <section className='section'>
      <div className='container'>
        <div className='card shadow'>
          <div className='card-body'>
            <div className='row'>
              <h6>Registrar producto</h6>
              <hr />
              <form onSubmit={handleSubmit}>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">NIT</span>
                  <input
                    type="text"
                    className='form-control'
                    name="idproducto"
                    value={newProducto.idproducto}
                    onChange={handleInputChange}
                    placeholder="NIT"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Nombre</span>
                  <input
                    type="text"
                    className='form-control'
                    name="nombre"
                    value={newProducto.nombre}
                    onChange={handleInputChange}
                    placeholder="NOMBRE"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Referencia</span>
                  <input
                    type="text"
                    className='form-control'
                    name="referencia"
                    value={newProducto.referencia}
                    onChange={handleInputChange}
                    placeholder="REFERENCIA"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Caracteristicas</span>
                  <input
                    type="text"
                    className='form-control'
                    name="caracteristicas"
                    value={newProducto.caracteristicas}
                    onChange={handleInputChange}
                    placeholder="CARACTERISTICAS"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Efectos secundarios</span>
                  <input
                    type="text"
                    className='form-control'
                    name="efectSecundarios"
                    value={newProducto.efectSecundarios}
                    onChange={handleInputChange}
                    placeholder="EFECTOS SECUNDARIOS"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Fecha de vencimiento</span>
                  <input
                    type="text"
                    className='form-control'
                    name="fecha_vencimiento"
                    value={newProducto.fecha_vencimiento}
                    onChange={handleInputChange}
                    placeholder="FECHA VENCIMIENTO"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon1">Imagen</span>
                  <input 
                  type="text"
                  className='form-control'
                  name="imagen"
                  value={newProducto.imagen}
                  onChange={handleInputChange}
                  placeholder="IMAGEN"
                  id="inputGroupFile01" />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Calidad</span>
                  <select class="form-select" id="inputGroupSelect01">
                    <option selected>Elegir...</option>
                    <option 
                      type="text"
                      className='form-control'
                      name="calidad"
                      value={newProducto.calidad}
                      onChange={handleInputChange}
                      placeholder="CALIDAD"
                      >
                        Alta
                      </option>
                    <option
                       type="text"
                       className='form-control'
                       name="calidad"
                       value={newProducto.calidad}
                       onChange={handleInputChange}
                       placeholder="CALIDAD"
                      >
                        Media
                      </option>
                    <option
                      type="text"
                      className='form-control'
                      name="calidad"
                      value={newProducto.calidad}
                      onChange={handleInputChange}
                      placeholder="CALIDAD"
                      >
                        Baja
                      </option>
                  </select>
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Precio</span>
                  <input
                   type="text"
                   className='form-control'
                   name="precio"
                   value={newProducto.precio}
                   onChange={handleInputChange}
                   placeholder="PRECIO"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <label class="input-group-text" for="inputGroupSelect01">Nivel-Precio</label>
                  <select class="form-select" id="inputGroupSelect01">
                    <option selected>Elegir...</option>
                    <option type="text"
                      className='form-control'
                      name="nivelPrecio"
                      value={newProducto.nivelPrecio}
                      onChange={handleInputChange}
                      placeholder="NIVEL PRECIO">Alto</option>
                    <option type="text"
                      className='form-control'
                      name="nivelPrecio"
                      value={newProducto.nivelPrecio}
                      onChange={handleInputChange}
                      placeholder="NIVEL PRECIO">Medio</option>
                    <option type="text"
                      className='form-control'
                      name="nivelPrecio"
                      value={newProducto.nivelPrecio}
                      onChange={handleInputChange}
                      placeholder="NIVEL PRECIO">Bajo</option>
                  </select>
                </div>
                <hr />
                <button className='btn btn-primary shadow w-100' type="submit">Agregar</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
  );
};

export default AgregarProducto;