import React from 'react';
import FilaTabla from './FilaTabla';

const TablaFarma = ({data, deleteFarmaceutico}) => {
    return (
        <div>
            <div class="p-3 mb-2 bg-secondary text-white"><h3>FARMACEUTICOS</h3></div>
            <table class="table table-striped-columns">
                <thead>
                    <th>Cedula</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Telefono</th>
                    <th>Correo Electronico</th>
                    <th>Dirección</th>
                    <th>Nivel</th>
                </thead>
                <tbody>
                    {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <FilaTabla
                            key ={tie.cedula}
                            tie = {tie}
                            deleteFarmaceutico = {deleteFarmaceutico}             
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