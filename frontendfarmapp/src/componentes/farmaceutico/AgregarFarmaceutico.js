import React, { useState } from 'react';


const AgregarFarmaceutico = ({createFarmaceutico}) => {
  const [newFarmaceutico, setNewFarmaceutico] = useState({cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: ''});

  const handleInputChange = (e) => {
    setNewFarmaceutico({ ...newFarmaceutico, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    createFarmaceutico(newFarmaceutico);
    setNewFarmaceutico({cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: ''});
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        name="cedula"
        value={newFarmaceutico.cedula}
        onChange={handleInputChange}
        placeholder="CEDULA"
      />
      <input
        type="text"
        name="nombre"
        value={newFarmaceutico.nombre}
        onChange={handleInputChange}
        placeholder="NOMBRE"
      />
      <input
        type="text"
        name="apellido"
        value={newFarmaceutico.apellido}
        onChange={handleInputChange}
        placeholder="APELLIDO"
      />
      <input
        type="text"
        name="telefono"
        value={newFarmaceutico.telefono}
        onChange={handleInputChange}
        placeholder="TELEFONO"
      />
      <input
        type="text"
        name="correo"
        value={newFarmaceutico.correo}
        onChange={handleInputChange}
        placeholder="CORREO ELECTRONICO"
      />
      <input
        type="text"
        name="direccion"
        value={newFarmaceutico.direccion}
        onChange={handleInputChange}
        placeholder="DIRECCION"
      />
      <input
        type="text"
        name="nivel"
        value={newFarmaceutico.nivel}
        onChange={handleInputChange}
        placeholder="NIVEL"
      />
      <button type="submit" class="btn btn-success">Agregar</button>
    </form>
  );
};

export default AgregarFarmaceutico;