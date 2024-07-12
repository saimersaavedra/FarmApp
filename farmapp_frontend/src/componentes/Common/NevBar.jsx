import React, { useState } from 'react';
import './NevBar.css'
import { Link, useHistory } from 'react-router-dom';
import logo from './logo212.png';

function NevBar() {
  const [searchQuery, setSearchQuery] = useState('');
  const [filterQuery, setFilterQuery] = useState('');

  const updateSearchTerm = e => {
    setSearchQuery(e.target.value);
  };

  const updateFilterTerm = e => {
    setFilterQuery(e.target.value);
  };

  const history = useHistory();

  const handleSearch = e => {
    e.preventDefault();
    if (searchQuery.trim() !== '' && filterQuery.trim() !== '') {
      history.push(`/search-results/${filterQuery}/${searchQuery}`);
    }
  };

  return (
    <nav className="navbar navbar-expand-lg bg-body-tertiary">
      <div className="container-fluid">
        <Link to="/home" className="navbar-brand" href="#">
          <img src={logo} alt="Bootstrap" width="50" height="35" />
        </Link>
        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#navbarSupportedContent"
          aria-controls="navbarSupportedContent"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <div className="search-filter-container">
            <form className="d-flex" onSubmit={handleSearch}>
              <div className="input-group mb-3">
                <select
                  className="form-select filter-select"
                  name="filter"
                  value={filterQuery}
                  onChange={updateFilterTerm}
                >
                  <option value="">Seleccionar filtro</option>
                  <option value="nombre">nombre</option>
                  <option value="referencia">referencia</option>
                  <option value="caracteristicas">caracteristicas</option>
                </select>
              </div>
              <input
                className="form-control me-2 search-input"
                type="text"
                name="text"
                placeholder="buscar"
                value={searchQuery}
                onChange={updateSearchTerm}
              />
              <button
                className="btn btn-success search-button"
                type="submit"
                disabled={!searchQuery.trim()}
              >
              <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
      <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
    </svg>
              </button>
            </form>
          </div>
        </div>
        <div>
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item">
              <Link to="/home" className="nav-link active" href="#">
                Home
              </Link>
            </li>
            <li className="nav-item dropdown">
              <a 
              href="/#"
              className="nav-link dropdown-toggle"
              role="button"
              data-bs-toggle="dropdown"
              aria-expanded="false">
                Producto
              </a>
              <ul className="dropdown-menu">
                <li>
                  <a 
                  href="/#" 
                  className="dropdown-item" >
                    <Link 
                    to="/listado_productos" 
                    class="nav-link active" 
                    href="#">Lista productos</Link>
                  </a>
                  <a 
                  href="/#" 
                  className="dropdown-item" >
                    <Link 
                    to="/inventario" 
                    class="nav-link active" 
                    href="#">Inventario</Link>
                  </a>
                </li>
              </ul>
            </li>
            <li className="nav-item dropdown">
              <a
                href="/#"
                className="nav-link dropdown-toggle"
                role="button"
                data-bs-toggle="dropdown"
                aria-expanded="false"
              >
                Farmaceutico
              </a>
              <ul className="dropdown-menu">
                <li>
                  <a href="/#" className="dropdown-item">
                    <Link
                      to="/listado_farmaceuticos"
                      className="nav-link active"
                      href="#"
                    >
                      Lista farmaceuticos
                    </Link>
                  </a>
                  <a href="/#" className="dropdown-item">
                    <Link
                      to="/agregar_farmaceutico"
                      className="nav-link active"
                      href="#"
                    >
                      Registrar farmaceutico
                    </Link>
                  </a>
                </li>
              </ul>
            </li>
            <li className="nav-item">
              <Link to="/pedidos" className="nav-link active" href="#">
                Pedidos
              </Link>
            </li>
            <li className="nav-item">
              <Link to="/contacto" className="nav-link active" href="#">
                Contacto
              </Link>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  );
}

export default NevBar;
