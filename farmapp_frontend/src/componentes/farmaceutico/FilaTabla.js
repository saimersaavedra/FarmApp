import React from 'react';
import {Spinner } from 'react-bootstrap';

const FilaTabla = ({tie, deleteFarmaceutico,  editarTurista, loading}) => 
{
    return (
        <tr>
            <td>{tie.cedula}</td>
            <td>{tie.nombre}</td>
            <td>{tie.apellido}</td>
            <td>{tie.telefono}</td>
            <td>{tie.correo}</td>
            <td>{tie.direccion}</td>
            <td>{tie.nivel}</td>
            <td>
            <button class="btn btn-outline-secondary" onClick={() => editarTurista(tie.cedula)} disabled={loading}>
            {loading && <Spinner animation="border" size="sm" />}
                Actualizar</button>
            </td>
            <td>
            <button class="btn btn-outline-danger" onClick={() => deleteFarmaceutico(tie.cedula)}>Eliminar</button>
            </td>
        </tr>
        
    );
};
export default FilaTabla;