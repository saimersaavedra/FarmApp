import React, { useEffect, useState } from 'react';
import TablaFarma from './TablaFarma';
import ModalTurista from './ModalTurista'
import axios from 'axios';


const FarmaceuticoListado = () => {
    const [list, setList] = useState([]);
    const [show, setShow] = useState(false);
    const [lTurista, setLTurista] = useState([]);
    const [loading, setLoading] = useState(false);
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

      const editarTurista = async (id) => {
        setLoading(true);
        await editarCargar(id);
        setLoading(false);
        setShow(true);    
      };
    
      const editarCargar = async (id) => {    
        try{
            const response = await axios ({
                url: `http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico/${id}`
            });
            setLTurista(response.data);
            console.log("si");
        } catch(error){
            console.log(error);
        }
    };
    
      const modificarTurista = async (newTurista)  =>  { 
        console.log("Loading...");
          try {
          await axios.put(
            "http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico",newTurista,{
                headers: {
                  'Content-Type': 'application/json',
                },
                    
            });
         } catch (error) {
          console.log(error);
        }
      
    
      fetchData();
      };
    return (
        <div>
            <ModalTurista show={show} tur={lTurista} handleClose={() => setShow(false)} createFarmaceutico={createFarmaceutico} modificarTurista={modificarTurista}/>    
            <TablaFarma data = {list} deleteFarmaceutico={deleteFarmaceutico} editarTurista={editarTurista} loading={loading}  /> 
        </div>
    );
};
export default FarmaceuticoListado;