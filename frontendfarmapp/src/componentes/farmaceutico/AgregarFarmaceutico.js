import React, { useState } from 'react';


const AgregarFarmaceutico = ({ createFarmaceutico }) => {
  const [newFarmaceutico, setNewFarmaceutico] = useState({ cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: '' });

  const handleInputChange = (e) => {
    setNewFarmaceutico({ ...newFarmaceutico, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    createFarmaceutico(newFarmaceutico);
    setNewFarmaceutico({ cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: '' });
  };

  return (
    <section className='section'>
      <div className='container'>
        <div className='card shadow'>
          <div className='card-body'>
            <div className='row'>
            <h6>Registrar farmaceutico</h6>
            <form onSubmit={handleSubmit}>
            <hr />
              <label className="mb-1">Cedula</label>
                  <input
                    type="text"
                    className='form-control'
                    name="cedula"
                    value={newFarmaceutico.cedula}
                    onChange={handleInputChange}
                    placeholder="CEDULA"
                  />
                   <label className="mb-1">Nombre</label>
                  <input
                    type="text"
                    className='form-control'
                    name="nombre"
                    value={newFarmaceutico.nombre}
                    onChange={handleInputChange}
                    placeholder="NOMBRE"
                  />
                   <label className="mb-1">Apellido</label>
                  <input
                    type="text"
                    className='form-control'
                    name="apellido"
                    value={newFarmaceutico.apellido}
                    onChange={handleInputChange}
                    placeholder="APELLIDO"
                  />
              <label className="mb-1">Telefono</label>
                <input
                  type="text"
                  className='form-control'
                  name="telefono"
                  value={newFarmaceutico.telefono}
                  onChange={handleInputChange}
                  placeholder="TELEFONO"
                />
                 <label className="mb-1">Correo electronico</label>
                <input
                  type="text"
                  className='form-control'
                  name="correo"
                  value={newFarmaceutico.correo}
                  onChange={handleInputChange}
                  placeholder="CORREO ELECTRONICO"
                />
                 <label className="mb-1">Direccion</label>
                <input
                  type="text"
                  className='form-control'
                  name="direccion"
                  value={newFarmaceutico.direccion}
                  onChange={handleInputChange}
                  placeholder="DIRECCION"
                />
                 <label className="mb-1">Nivel</label>
                <input
                  type="text"
                  className='form-control'
                  name="nivel"
                  value={newFarmaceutico.nivel}
                  onChange={handleInputChange}
                  placeholder="NIVEL"
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

export default AgregarFarmaceutico;