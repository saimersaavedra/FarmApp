import React, {useState, useEffect} from "react";
import { useParams } from 'react-router-dom';
import axios from "axios";

import CardProducto from "./CardProductos";

const ListaB = () => {

  const [list, setList] = useState([]);
  const [errMsg, setErrMsg] = useState("");
  const { searchQuery, filterQuery } = useParams();


  useEffect(() => {
    const fetchData = async () => {
      try{
        const response = await axios.get(`http://localhost:8080/farmapp/api/apiproductos/producto/filtro/${filterQuery}/${searchQuery}`);
        ;
          setList(response.data);
          console.log(response.data);
      } catch (err) {
          if (!err?.response) {
            setErrMsg("No Server Response");
          } else if (err.response?.status === 404) {
            setErrMsg("Username Taken");
          } else {
            setErrMsg("Registration Failed");
          }
          window.alert(errMsg);
        }
      };

      fetchData();
  }, [filterQuery,searchQuery,setList, errMsg]);
  console.log(searchQuery);
  console.log(filterQuery);
  console.log(list)
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
  };

  return(
    <div class="container-fluid">
        <CardProducto data = {list} borrarProducto={borrarProducto}/> 
    </div>
  );

};

export default ListaB