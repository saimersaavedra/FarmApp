import React, {useState, useEffect } from 'react';
import { Button, Modal } from 'react-bootstrap';

const ModalTurista = ({ show, handleClose, tur, modificarTurista}) => {

  const [newTurista, setNewTurista] = useState({cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: '' });
  useEffect(() => {
    if(show){
      setNewTurista(tur);
    }
  }, [show, tur]);

  const handleInputChange = (e) => {
    setNewTurista({ ...newTurista, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    modificarTurista(newTurista);
    setNewTurista({ cedula: '', nombre: '', apellido: '', telefono: '', correo: '', direccion: '', nivel: ''});
    handleClose();
  };


    return (
        <>
         
        <Modal show={show} onHide={handleClose}>
          <Modal.Header closeButton>
            <Modal.Title>Actualización de datos</Modal.Title>
          </Modal.Header>
          <Modal.Body>
          <section className='section'>
      <div className='container'>
        <div className='card shadow'>
          <div className='card-body'>
            <div className='row'>
            <form onSubmit={handleSubmit}>
            <hr />
              <label className="mb-1">Cedula</label>
                  <input
                    type="text"
                    className='form-control'
                    name="cedula"
                    value={newTurista.cedula}
                    onChange={handleInputChange}
                    placeholder="CEDULA"
                  />
                   <label className="mb-1">Nombre</label>
                  <input
                    type="text"
                    className='form-control'
                    name="nombre"
                    value={newTurista.nombre}
                    onChange={handleInputChange}
                    placeholder="NOMBRE"
                  />
                   <label className="mb-1">Apellido</label>
                  <input
                    type="text"
                    className='form-control'
                    name="apellido"
                    value={newTurista.apellido}
                    onChange={handleInputChange}
                    placeholder="APELLIDO"
                  />
              <label className="mb-1">Telefono</label>
                <input
                  type="text"
                  className='form-control'
                  name="telefono"
                  value={newTurista.telefono}
                  onChange={handleInputChange}
                  placeholder="TELEFONO"
                />
                 <label className="mb-1">Correo electronico</label>
                <input
                  type="text"
                  className='form-control'
                  name="correo"
                  value={newTurista.correo}
                  onChange={handleInputChange}
                  placeholder="CORREO ELECTRONICO"
                />
                 <label className="mb-1">Direccion</label>
                <input
                  type="text"
                  className='form-control'
                  name="direccion"
                  value={newTurista.direccion}
                  onChange={handleInputChange}
                  placeholder="DIRECCION"
                />
                 <label className="mb-1">Nivel</label>
                <input
                  type="text"
                  className='form-control'
                  name="nivel"
                  value={newTurista.nivel}
                  onChange={handleInputChange}
                  placeholder="NIVEL"
                />
                   <hr/>
                </form>
              </div>
            </div>
          </div>
      </div>
    </section>
    </Modal.Body>
          <Modal.Footer>
            <Button variant="secondary" onClick={handleClose}>
              Cerrar
            </Button>
            <Button variant="primary" onClick={handleSubmit}>
              Guardar cambios
            </Button>
          </Modal.Footer>
        </Modal>
      </>
    );
};

export default ModalTurista;