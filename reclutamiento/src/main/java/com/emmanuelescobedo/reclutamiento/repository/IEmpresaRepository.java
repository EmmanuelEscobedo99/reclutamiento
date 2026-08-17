package com.emmanuelescobedo.reclutamiento.repository;

import com.emmanuelescobedo.reclutamiento.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpresaRepository extends JpaRepository<Empresa, Long> {
}
