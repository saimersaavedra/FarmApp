import React, { useEffect, useState } from 'react';
import TablaFarma from './TablaFarma';
import axios from 'axios';
import AgregarFarmaceutico from './AgregarFarmaceutico';


const Farmaceutico = () => {
    const [list, setList] = useState([]);
    useEffect(() => {
        fetchData();

    }, [setList] );

    const fetchData = async () => {
        try{
            const response = await axios ({
                url: "http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico",
            });
            setList(response.data);
        } catch(error){
            console.log(error);
        }
    }
    const createFarmaceutico = async (newFarmaceutico) => {
        try {
            console.log(newFarmaceutico);
          await axios.post("http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico",newFarmaceutico,{
            headers: {
              'Content-Type': 'application/json',
            },
                
        });
          fetchData();
        } catch (error) {
          console.error(error);
        }

      };
      const deleteFarmaceutico = async (cedula) => {
        let isDelete = window.confirm(
            `¿Estás seguro de eliminar el farmaceutico con la cedula: '${cedula}'?`
          );
          if (isDelete){
            try {
                await axios.delete(
                  `http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico/${cedula}`
                );
                console.log("si");
              } catch (error) {
                console.log(error);
              }
            };
            fetchData();
      };
    return (
        <div>
            <AgregarFarmaceutico createFarmaceutico={createFarmaceutico}/>
            <TablaFarma data = {list} deleteFarmaceutico = {deleteFarmaceutico} /> 
        </div>
    );
};
export default Farmaceutico;