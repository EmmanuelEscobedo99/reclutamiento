package com.emmanuelescobedo.reclutamiento.service;

import com.emmanuelescobedo.reclutamiento.model.Empresa;
import com.emmanuelescobedo.reclutamiento.repository.IEmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements IEmpresaService {

    private final IEmpresaRepository emprRepo;

    public EmpresaService(IEmpresaRepository emprRepo) {
        this.emprRepo = emprRepo;
    }

    @Override
    public List<Empresa> traerEmpresas() {
        return emprRepo.findAll();
    }

    @Override
    public Empresa buscarEmpresa(Long codeEmpresa) {
        return emprRepo.findById(codeEmpresa).orElse(null);
    }

    @Override
    public Empresa crearEmpresa(Empresa empresa) {

        if(empresa == null) {
            return null;
        }

        return emprRepo.save(empresa);
    }

    @Override
    public Empresa editarEmpresa(Empresa empresa, Long codeEmpresa) {

        Empresa empresaEditada = buscarEmpresa(codeEmpresa);

        if(empresaEditada == null) {
            return null;
        }

        empresaEditada.setNombre(empresa.getNombre());
        empresaEditada.setDescripcion(empresa.getDescripcion());
        empresaEditada.setIndustria(empresa.getIndustria());
        empresaEditada.setSitioWeb(empresa.getSitioWeb());
        empresaEditada.setCorreoContacto(empresa.getCorreoContacto());
        empresaEditada.setTelefono(empresa.getTelefono());
        empresaEditada.setDireccion(empresa.getDireccion());
        empresaEditada.setActiva(empresa.isActiva());

        return emprRepo.save(empresaEditada);
    }

    @Override
    public boolean eliminarEmpresa(Long codeEmpresa) {

        Empresa empresaEliminar = buscarEmpresa(codeEmpresa);

        if(empresaEliminar == null) {
            return false;
        }

        emprRepo.delete(empresaEliminar);
        return true;
    }
}
