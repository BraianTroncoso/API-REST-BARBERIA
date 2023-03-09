package com.barberia.barberia.repositories;

import com.barberia.barberia.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
