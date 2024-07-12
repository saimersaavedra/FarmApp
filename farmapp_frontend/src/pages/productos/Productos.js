import Producto from "../../componentes/producto/Producto"
import "./productos.css"
import React from "react"
import logo from './productosLogo.jpg'
const Productos = () => {
  return (

    <div className="container">
      <div>
        <div class="card mb-3">
          <img src = {logo} class="card-img-top" alt="..." width="20" height="350" />
          <div class="card-body">
            <h5 class="card-title">Lista de productos</h5>
            <p class="card-text">Estos son los productos farmaceuticos más relevantes.</p>
            <p class="card-text"><small class="text-body-secondary">ultima actualización hace 1 minuto..</small></p>
          </div>
        </div>
      </div>
      <Producto />
    </div >
  )
}

export default Productos