import React, { useEffect, useState } from 'react';
import axios from "axios";
import AgregarProducto from './AgregarProducto';

const ProductoInventario = () => {
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

    const createProducto = async (newProducto) => {
        try {
            console.log(newProducto);
          await axios.post("http://localhost:8080/farmapp/api/apiproductos/producto",newProducto,{
            headers: {
              'Content-Type': 'application/json',
            },
        });
          fetchData();
        } catch (error) {
          console.error(error);
        }

      };

    return(
        <div>
            <AgregarProducto createProducto={createProducto} />
        </div>
);

};
export default ProductoInventario;