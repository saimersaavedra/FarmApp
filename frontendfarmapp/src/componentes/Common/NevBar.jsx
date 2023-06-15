
import "./nevbar.css"
import { Link } from 'react-router-dom'
import logo from './logo212.png'
function NevBar() {
  return (

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
      <div class="container-fluid">

        <Link to="/" class="navbar-brand" href="#"><img src={logo} alt="Bootstrap" width="50" height="35" /></Link>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
            <button class="btn btn-outline-success" type="submit">Buscar</button>
          </form>
        </div>
        <div >
          <u3 class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <Link to="/" class="nav-link active" href="#">Home</Link>
            </li>
            <li class="nav-item dropdown">
              <a href="/#" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Productos
              </a>
              <ul class="dropdown-menu">
                <li>
                  <a href="/#" class="dropdown-item" >
                    <Link to="/listado_productos" class="nav-link active" href="#">Lista productos</Link>
                  </a>
                </li>
                <li>
                  <a href="/#" class="dropdown-item" >
                    <Link to="/inventario" class="nav-link active" href="#">Inventario</Link>
                  </a>
                </li>

              </ul>
            </li>
            <li class="nav-item dropdown">
              <a href="/#" class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                Farmaceutico
              </a>
              <ul class="dropdown-menu">
                <li>
                  <a href="/#" class="dropdown-item" >
                    <Link to="/listado_farmaceuticos" class="nav-link active" href="#">Lista farmaceuticos</Link>
                    </a>
                    <a href="/#" class="dropdown-item" >
                    <Link to="/agregar_farmaceutico" class="nav-link active" href="#">Registrar farmaceutico</Link>
                    </a>
                </li>
              </ul>
            </li>
            <li class="nav-item">
              <Link to="/pedidos" class="nav-link active" href="#">Pedidos</Link>
            </li>
            <li class="nav-item">
              <Link to="/contacto" class="nav-link active" href="#">Contacto</Link>
            </li>

          </u3>
        </div>
      </div>
    </nav>
  )
}

export default NevBar