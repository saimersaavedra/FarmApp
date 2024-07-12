import React, { useEffect, useState } from 'react';
import axios from "axios";
import CardPedidos from './CardPedidos';

const Pedido = () => {
    const [list, setList] = useState([]);
    useEffect(() => {
        fetchData();

    }, [setList] );

    const fetchData = async () => {
        try{
            const response = await axios ({
                url: "http://localhost:8080/farmapp/api/apipedidos/pedido",
            });
            setList(response.data);
        } catch(error){
            console.log(error);
        }
    }
    const borrarPedido = async (nit) => {
        let isDelete = window.confirm(
            `¿Estás seguro de eliminar el pedido con el nit '${nit}'?`
          );
          if (isDelete){
            try {
                await axios.delete(
                  `http://localhost:8080/farmapp/api/apipedidos/pedido/${nit}`
                );
                console.log("si");
              } catch (error) {
                console.log(error);
              }
            };
            fetchData();
      };
    
    return(
        <div>
                <CardPedidos data = {list} borrarPedido = {borrarPedido} />
        </div>
);

};
export default Pedido;