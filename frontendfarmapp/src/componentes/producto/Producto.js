import React, { useEffect, useState } from 'react';
import axios from "axios";
import CardProducto from "./CardProductos";

const Producto = () => {
    const [list, setList] = useState([]);
    useEffect(() => {
        fetchData();

    }, [setList] );

    const fetchData = async () => {
        try{
            const response = await axios ({
                url: "http://localhost:8080/farmapp/api/apiproductos/producto",
            });
            setList(response.data);
        } catch(error){
            console.log(error);
        }
    }
    const borrarProducto = async (nit) => {
        let isDelete = window.confirm(
            `¿Estás seguro de eliminar el registro con el id '${nit}'?`
          );
          if (isDelete){
            try {
                await axios.delete(
                  `http://localhost:8080/farmapp/api/apiproductos/producto/${nit}`
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
            <CardProducto data = {list} borrarProducto = {borrarProducto}/>
        </div>
);

};
export default Producto;