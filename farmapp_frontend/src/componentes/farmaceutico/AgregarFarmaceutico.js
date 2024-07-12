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
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Cedula</span>
                  <input
                    type="text"
                    className='form-control'
                    name="cedula"
                    value={newFarmaceutico.cedula}
                    onChange={handleInputChange}
                    placeholder="CEDULA"
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
                    value={newFarmaceutico.nombre}
                    onChange={handleInputChange}
                    placeholder="NOMBRE"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Apellido</span>
                  <input
                    type="text"
                    className='form-control'
                    name="apellido"
                    value={newFarmaceutico.apellido}
                    onChange={handleInputChange}
                    placeholder="APELLIDO"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Telefono</span>
                  <input
                    type="text"
                    className='form-control'
                    name="telefono"
                    value={newFarmaceutico.telefono}
                    onChange={handleInputChange}
                    placeholder="TELEFONO"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Correo electronico</span>
                  <input
                    type="text"
                    className='form-control'
                    name="correo"
                    value={newFarmaceutico.correo}
                    onChange={handleInputChange}
                    placeholder="CORREO ELECTRONICO"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <span class="input-group-text" id="basic-addon1">Direccion</span>
                  <input
                    type="text"
                    className='form-control'
                    name="direccion"
                    value={newFarmaceutico.direccion}
                    onChange={handleInputChange}
                    placeholder="DIRECCION"
                    aria-label="Username"
                    aria-describedby="basic-addon1"
                  />
                </div>
                <div class="input-group mb-3">
                  <label class="input-group-text" for="inputGroupSelect01">Nivel-empresa</label>
                  <select class="form-select" id="inputGroupSelect01">
                    <option selected>Elegir...</option>
                    <option type="text"
                      className='form-control'
                      name="nivel"
                      value={newFarmaceutico.nivel}
                      onChange={handleInputChange}
                      placeholder="NIVEL">Jefe</option>
                    <option type="text"
                      className='form-control'
                      name="nivel"
                      value={newFarmaceutico.nivel}
                      onChange={handleInputChange}
                      placeholder="NIVEL">Gerente</option>
                    <option type="text"
                      className='form-control'
                      name="nivel"
                      value={newFarmaceutico.nivel}
                      onChange={handleInputChange}
                      placeholder="NIVEL">Empleado</option>
                  </select>
                </div>
                <hr />
                <button className='btn btn-primary shadow w-100' type="submit">Registrar</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>

  );
};

export default AgregarFarmaceutico;