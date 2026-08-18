package com.emmanuelescobedo.reclutamiento.service;

import com.emmanuelescobedo.reclutamiento.model.Vacante;
import com.emmanuelescobedo.reclutamiento.repository.IVacanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacanteService implements IVacanteService {

    private final IVacanteRepository vacaRepo;

    public VacanteService(IVacanteRepository vacaRepo) {
        this.vacaRepo = vacaRepo;
    }

    @Override
    public List<Vacante> traerVacantes() {
        return vacaRepo.findAll();
    }

    @Override
    public Vacante buscarVacante(Long codeVacante) {
        return vacaRepo.findById(codeVacante).orElse(null);
    }

    @Override
    public Vacante crearVacante(Vacante vacante) {

        if (vacante == null) {
            return null;
        }

        return vacaRepo.save(vacante);
    }

    @Override
    public Vacante editarVacante(Long codeVacante, Vacante vacante) {

        Vacante vacanteEditada = buscarVacante(codeVacante);

        if(vacanteEditada == null) {
            return null;
        }

        vacanteEditada.setDescripcion(vacante.getDescripcion());
        vacanteEditada.setTitulo(vacante.getTitulo());
        vacante.setUbicacion(vacante.getUbicacion());
        vacanteEditada.setSalarioMensual(vacante.getSalarioMensual());
        vacanteEditada.setModalidad(vacante.getModalidad());
        vacanteEditada.setNivelExpericencia(vacante.getNivelExpericencia());
        vacanteEditada.setTipoContrato(vacante.getTipoContrato());
        vacanteEditada.setVacantesDisponibles(vacante.getVacantesDisponibles());
        vacanteEditada.setHabilidadesRequeridas(vacante.getHabilidadesRequeridas());
        vacanteEditada.setFechaPublicacion(vacante.getFechaPublicacion());
        vacanteEditada.setFechaCierre(vacante.getFechaCierre());
        vacanteEditada.setActiva(vacante.isActiva());

        return vacaRepo.save(vacanteEditada);
    }

    @Override
    public boolean eliminarVacante(Long codeVacante) {

        Vacante vacanteEliminar = buscarVacante(codeVacante);

        if(vacanteEliminar == null) {
            return false;
        }

        vacaRepo.delete(vacanteEliminar);
        return true;
    }
}
