import Home from '../pages/home/Home'
import React from 'react'
import NavBar from '../componentes/Common/NevBar'
import './App.css'
import { BrowserRouter as Router, Route } from 'react-router-dom'
import Contact from '../pages/contact/Contact'
import Productos from '../pages/productos/Productos'
import Inventario from '../pages/inventario/Inventario'
const App = () => {
  return (
      <Router>
      <div>
        <NavBar />

        <Route path='/'>
          <Home/>
        </Route>
        
        <Route path='/contacto'>
          <Contact/>
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