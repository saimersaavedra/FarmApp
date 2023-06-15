import React from 'react';
import Card from './CardPe';

const CardPedidos = ({data, borrarPedido}) => {
    return (
        <div>
            <div class="row row-cols-1 row-cols-md-3 g-4"  >
                {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <Card
                            key ={tie.id_pedido}
                            tie = {tie}  
                            borrarPedido = {borrarPedido}
                                                     />
                        ))

                    ) : (
                        <h3><img alt = 'cargando' src = 'https://media.tenor.com/mJj_aSgWvYQAAAAC/cargando-xd.gif'/></h3>
                    )
                }   
             
          </div>  
        </div>
    );
};

export default CardPedidos;
