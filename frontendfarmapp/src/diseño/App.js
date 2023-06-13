import Home from '../pages/home/Home'
import React from 'react'
import NavBar from '../componentes/Common/NevBar'
import './App.css'
import { BrowserRouter as Router, Route } from 'react-router-dom'
import Productos from '../pages/productos/Productos'
import Inventario from '../pages/inventario/Inventario'
import Farmaceuticos from '../pages/farmaceuticos/Farmaceuticos'
const App = () => {
  return (
      <Router>
      <div>
        <NavBar />

        <Route path='/'>
          <Home/>
        </Route>
        
        <Route path='/farmaceutico'>
          <Farmaceuticos/>
        </Route>

        <Route path='/productos'>
          <Productos/>
        </Route>

        <Route path='/inventario'>
          <Inventario/>
        </Route>

      </div>
      </Router>
    
  );
}

export default App;