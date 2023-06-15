import React from 'react';
import FilaTabla from './FilaTabla';

const TablaFarma = ({data, deleteFarmaceutico, editarTurista, loading}) => {
    return (
        <div>
            <table  class="table table-striped table-bordered">
                <thead>
                    <th>Cedula</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>Correo Electronico</th>
                    <th>Dirección</th>
                    <th>Nivel</th>
                    <th>Actualizar</th>
                    <th>Eliminar</th>
                </thead>
                <tbody>
                    {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <FilaTabla
                            key ={tie.cedula}
                            tie = {tie}
                            deleteFarmaceutico = {deleteFarmaceutico} 
                            editarTurista={editarTurista} 
                            loading={loading}  
                                                     />
                        ))
                    ) : (
                        <tr>
                            <td colSpan="6"><img alt = 'cargando' src = 'https://thumbs.gfycat.com/JovialMeagerBull-size_restricted.gif'/></td>
                        </tr>
                    )
                }   
                </tbody>
            </table>
            
        </div>
    );
};
export default TablaFarma;