package com.emmanuelescobedo.reclutamiento.service;

import com.emmanuelescobedo.reclutamiento.model.Empresa;

import java.util.List;

public interface IEmpresaService {

    //Metodos para el CRUD

    //READ
    List<Empresa> traerEmpresas();

    //READ elemento especifico
    Empresa buscarEmpresa(Long codeEmpresa);

    //CREATE
    Empresa crearEmpresa(Empresa empresa);

    //UPDATE
    Empresa editarEmpresa(Empresa empresa, Long codeEmpresa);

    //DELETE
    boolean eliminarEmpresa(Long codeEmpresa);
}
