import Home from '../pages/home/Home'
import React from 'react'
import NavBar from '../componentes/Common/NevBar'
import { BrowserRouter as Router, Route } from 'react-router-dom'
import Productos from '../pages/productos/Productos'
import Inventario from '../pages/inventario/Inventario'
import Farmaceuticos from '../pages/farmaceuticos/Farmaceuticos'
import ListadoFarmaceutico from '../pages/ListadoFarmaceutico/ListadoFarmaceutico'
import Pedido from '../pages/pedidos/Pedido'
const App = () => {
  return (
    <div className='container'>
      <Router>
      <div>
        <NavBar />

        <Route path='/'>
          <Home/>
        </Route>
        
        <Route path='/agregar_farmaceutico'>
          <Farmaceuticos/>
        </Route>

        <Route path='/listado_farmaceuticos'>
          <ListadoFarmaceutico/>
        </Route>

        <Route path='/listado_productos'>
          <Productos/>
        </Route>

        <Route path='/inventario'>
          <Inventario/>
        </Route>

        
        <Route path='/pedidos'>
          <Pedido/>
        </Route>

      </div>
      </Router>
      </div>
  );
}

export default App;