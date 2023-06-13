import React, { useState } from 'react';


const AgregarProducto = ({ createFarmaceutico}) => {
  const [newProducto, setNewProducto] = useState({idproducto: '', nombre: '', referencia: '', caracteristicas: '', efectos_secundarios: '', fecha_vencimiento: '', imagen:'', precio:'', calidad: '', nivelPrecio:''});

  const handleInputChange = (e) => {
    setNewProducto({ ...newProducto, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    createFarmaceutico(newProducto);
    setNewProducto({ idproducto: '', nombre: '', referencia: '', caracteristicas: '', efectos_secundarios: '', fecha_vencimiento: '', imagen:'', precio:'', calidad: '', nivelPrecio:''});
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
                <label className="mb-1">NIT</label>
                  <input
                    type="text"
                    className='form-control'
                    name="idproducto"
                    value={newProducto.idproducto}
                    onChange={handleInputChange}
                    placeholder="nit"
                  />
                   <label className="mb-1">Nombre</label>
                  <input
                    type="text"
                    className='form-control'
                    name="nombre"
                    value={newProducto.nombre}
                    onChange={handleInputChange}
                    placeholder="NOMBRE"
                  />
                   <label className="mb-1">Referencia</label>
                  <input
                    type="text"
                    className='form-control'
                    name="referencia"
                    value={newProducto.referencia}
                    onChange={handleInputChange}
                    placeholder="REFERENCIA"
                  />
                  <label className="mb-1">Caracteristicas</label>
                  <input
                    type="text"
                    className='form-control'
                    name="caracteristicas"
                    value={newProducto.caracteristicas}
                    onChange={handleInputChange}
                    placeholder="CARACTERISTICAS"
                  />
                    <label className="mb-1">Efectos secundarios</label>
                  <input
                    type="text"
                    className='form-control'
                    name="efectos_secundarios"
                    value={newProducto.efectos_secundarios}
                    onChange={handleInputChange}
                    placeholder="EFECTOS SECUNDARIOS"
                  />
                  <label className="mb-1">Fecha vencimiento</label>
                  <input
                    type="text"
                    className='form-control'
                    name="fecha_vencimiento"
                    value={newProducto.fecha_vencimiento}
                    onChange={handleInputChange}
                    placeholder="FECHA VENCIMIENTO"
                  />
                  <label className="mb-1">Imagen</label>
                  <input
                    type="text"
                    className='form-control'
                    name="imagen"
                    value={newProducto.imagen}
                    onChange={handleInputChange}
                    placeholder="IMAGEN"
                  />
                   <label className="mb-1">Calidad</label>
                  <input
                    type="text"
                    className='form-control'
                    name="calidad"
                    value={newProducto.calidad}
                    onChange={handleInputChange}
                    placeholder="CALIDAD"
                  />
                  <label className="mb-1">Precio</label>
                  <input
                    type="text"
                    className='form-control'
                    name="precio"
                    value={newProducto.precio}
                    onChange={handleInputChange}
                    placeholder="PRECIO"
                  />
                    <label className="mb-1">Nivel precio</label>
                  <input
                    type="text"
                    className='form-control'
                    name="nivelPrecio"
                    value={newProducto.nivelPrecio}
                    onChange={handleInputChange}
                    placeholder="NIVEL PRECIO"
                  />
                  <hr/>
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