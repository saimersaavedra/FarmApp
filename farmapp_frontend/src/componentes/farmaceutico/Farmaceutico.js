import axios from 'axios';
import AgregarFarmaceutico from './AgregarFarmaceutico';


const Farmaceutico = () => {
  
    const createFarmaceutico = async (newFarmaceutico) => {
        try {
            console.log(newFarmaceutico);
          await axios.post("http://localhost:8080/farmapp/api/apifarmaceutico/farmaceutico",newFarmaceutico,{
            headers: {
              'Content-Type': 'application/json',
            },
                
        });
        } catch (error) {
          console.error(error);
        }

      };
    
    return (
        <div>
            <AgregarFarmaceutico createFarmaceutico={createFarmaceutico}/>
        </div>
    );
};
export default Farmaceutico;