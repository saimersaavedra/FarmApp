import axios from "axios";
import AgregarProducto from './AgregarProducto';

const ProductoInventario = () => {
    
  const createFarmaceutico = async (newFarmaceutico) => {
    try {
        console.log(newFarmaceutico);
      await axios.post("http://localhost:8080/farmapp/api/apiproductos/producto",newFarmaceutico,{
        headers: {
          'Content-Type': 'application/json',
        },
            
    });
    } catch (error) {
      console.error(error);
    }

  };

    return(
        <div>
            <AgregarProducto createFarmaceutico={createFarmaceutico} />
        </div>
);

};
export default ProductoInventario;