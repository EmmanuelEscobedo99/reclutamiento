package com.emmanuelescobedo.reclutamiento.repository;

import com.emmanuelescobedo.reclutamiento.model.Vacante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVacanteRepository extends JpaRepository<Vacante, Long> {
}
