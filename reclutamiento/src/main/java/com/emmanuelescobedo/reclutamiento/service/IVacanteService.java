package com.emmanuelescobedo.reclutamiento.service;

import com.emmanuelescobedo.reclutamiento.model.Vacante;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IVacanteService {

    List<Vacante> traerVacantes();
    Vacante buscarVacante(Long codeVacante);

    Vacante crearVacante(Vacante vacante);
    Vacante editarVacante(Long codeVacante, Vacante vacante);

    boolean eliminarVacante(Long codeVacante);
}
