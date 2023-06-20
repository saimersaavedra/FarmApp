import "./home.css"
import productoss from './productos.jpeg'
import { Link } from 'react-router-dom';
import pedidoss from './pedido.jpg'
const Home = () => {
  return (
      <div id="carouselExampleCaptions" class="carousel slide">
      <div class="carousel-indicators">
        <div class="text-bg-dark p-0">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
      </div>
      <div class="carousel-inner">
        <div class="carousel-item active">
        <Link to="/listado_productos" className="navbar-brand" href="#">
        <img src={productoss} class="d-block w-100" alt="..." width="300" height="600"/>
        <div class="carousel-caption d-none d-md-block">
            <h5 class="text-bg-dark p-3">Producto</h5>
            <p class="text-bg-success p-2">lista de productos</p>
          </div>
        </Link>
        </div>
        <div class="carousel-item">
        <Link to="/listado_farmaceuticos" className="navbar-brand" href="#">
        <img src="https://statics-diariomedico.uecdn.es/cms/styles/landscape_xl/azblob/2022-03/native-sig.jpg.webp?itok=EKUSOSuN" class="d-block w-100" alt="..." width="300" height="600"/>
        <div class="carousel-caption d-none d-md-block">
          <h5 class="text-bg-dark p-3">Farmaceutico</h5>
            <p class="text-bg-success p-2">lista de farmaceuticos</p>
          </div>
        </Link>
        </div>
        <div class="carousel-item">
        <Link to="/pedidos" className="navbar-brand" href="#">
        <img src={pedidoss} class="d-block w-100" alt="..." width="300" height="600"/>
        <div class="carousel-caption d-none d-md-block">
          <h5 class="text-bg-dark p-3">Pedido</h5>
          <p class="text-bg-success p-2">lista de pedidos</p>
          </div>
        </Link>
        </div>
      </div>
      <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previa</span>
      </button>
      <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Siguiente</span>
      </button>
  </div>
  )
}

export default Home