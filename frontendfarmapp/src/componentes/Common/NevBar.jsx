
import "./nevbar.css"
import { Link } from 'react-router-dom'

function NevBar() {
  return (
    
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
    
      <Link to="/" class="navbar-brand">farmapp</Link>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <form class="d-flex" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
          <button class="btn btn-outline-success" type="submit">Buscar</button>
        </form>
        
      </div>
      <div>
      <u3 class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                      <Link to="/" class="nav-link active">Home</Link>
                    </li>
                    <li class="nav-item">
                      <Link to="/productos" class="nav-link active">Productos</Link>
                    </li>
                    <li class="nav-item">
                      <Link to="/farmaceutico" class="nav-link active">Farmaceutico</Link>
                    </li>
                    <li class="nav-item">
                      <Link to="/inventario" class="nav-link active">Inventario</Link>
                    </li>
          </u3>
      </div>
      
    </div>
  </nav>
  )
}

export default NevBar