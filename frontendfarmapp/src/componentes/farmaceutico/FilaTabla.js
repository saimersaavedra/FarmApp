import React from 'react';

const FilaTabla = ({tie, deleteFarmaceutico}) => 
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
            <button class="btn btn-warning">Actualizar</button>
            </td>
            <td>
            <button class="btn btn-danger" onClick={() => deleteFarmaceutico(tie.cedula)}>Eliminar</button>
            </td>
        </tr>
        
    );
};
export default FilaTabla;