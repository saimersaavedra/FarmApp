import React, { useState } from 'react';

const Filtro = () => {
    const [filterQuery, setFilterQuery] = useState('');

    const updateFilterTerm = e => {
        setFilterQuery(e.target.value);
      };

  return (
            <div class="input-group mb-3">
              <select
                className="form-select me-2"
                name="filter"
                value={filterQuery}
                onChange={updateFilterTerm}
              >
                <option value="">Seleccionar filtro</option>
                <option value="nombre">nombre</option>
                <option value="referencia">referencia</option>
                <option value="caracteristicas">características</option>
              </select>
            </div>
  )
}

export default Filtro