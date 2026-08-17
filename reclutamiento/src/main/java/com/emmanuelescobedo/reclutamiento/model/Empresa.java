package com.emmanuelescobedo.reclutamiento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeEmpresa;
    private String nombre;
    private String descripcion;
    private String industria;
    private String sitioWeb;
    private String correoContacto;
    private String telefono;
    private String direccion;
    private boolean activa;

    public Empresa() {
    }

    public Empresa(Long codeEmpresa, String nombre, String descripcion, String industria, String sitioWeb, String correoContacto, String telefono, String direccion, boolean activa) {
        this.codeEmpresa = codeEmpresa;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.industria = industria;
        this.sitioWeb = sitioWeb;
        this.correoContacto = correoContacto;
        this.telefono = telefono;
        this.direccion = direccion;
        this.activa = activa;
    }

    public Long getCodeEmpresa() {
        return codeEmpresa;
    }

    public void setCodeEmpresa(Long codeEmpresa) {
        this.codeEmpresa = codeEmpresa;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    public void setCorreoContacto(String correoContacto) {
        this.correoContacto = correoContacto;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getIndustria() {
        return industria;
    }

    public void setIndustria(String industria) {
        this.industria = industria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
