
import React from 'react';
import Card from './CardP';

const CardProducto = ({data, borrarProducto}) => {
    return (
        <div>
            <div class="row row-cols-1 row-cols-md-3 g-4"  >
                {
                    data.length > 0 ? (
                        data.map((tie) => (
                            <Card
                            key ={tie.idproducto}
                            tie = {tie}  
                            borrarProducto = {borrarProducto} 
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

export default CardProducto;
