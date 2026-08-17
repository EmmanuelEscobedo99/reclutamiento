package com.emmanuelescobedo.reclutamiento.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Vacante {

    @Id //
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeVacante;
    private String titulo;
    private String descripcion;
    private String ubicacion;
    private Double SalarioMensual;
    private String modalidad;
    private String nivelExpericencia;
    private String tipoContrato;
    private Integer vacantesDisponibles;
    private String habilidadesRequeridas;
    private LocalDate fechaPublicacion;
    private LocalDate fechaCierre;
    private boolean Activa;
    private Empresa empresa;

    public Vacante() {
    }

    public Vacante(Long codeVacante, Empresa empresa, boolean activa, LocalDate fechaCierre, LocalDate fechaPublicacion, String habilidadesRequeridas, Integer vacantesDisponibles, String tipoContrato, String nivelExpericencia, String modalidad, Double salarioMensual, String ubicacion, String descripcion, String titulo) {
        this.codeVacante = codeVacante;
        this.empresa = empresa;
        Activa = activa;
        this.fechaCierre = fechaCierre;
        this.fechaPublicacion = fechaPublicacion;
        this.habilidadesRequeridas = habilidadesRequeridas;
        this.vacantesDisponibles = vacantesDisponibles;
        this.tipoContrato = tipoContrato;
        this.nivelExpericencia = nivelExpericencia;
        this.modalidad = modalidad;
        SalarioMensual = salarioMensual;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }

    public Long getCodeVacante() {
        return codeVacante;
    }

    public void setCodeVacante(Long codeVacante) {
        this.codeVacante = codeVacante;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public boolean isActiva() {
        return Activa;
    }

    public void setActiva(boolean activa) {
        Activa = activa;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getHabilidadesRequeridas() {
        return habilidadesRequeridas;
    }

    public void setHabilidadesRequeridas(String habilidadesRequeridas) {
        this.habilidadesRequeridas = habilidadesRequeridas;
    }

    public Integer getVacantesDisponibles() {
        return vacantesDisponibles;
    }

    public void setVacantesDisponibles(Integer vacantesDisponibles) {
        this.vacantesDisponibles = vacantesDisponibles;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNivelExpericencia() {
        return nivelExpericencia;
    }

    public void setNivelExpericencia(String nivelExpericencia) {
        this.nivelExpericencia = nivelExpericencia;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public Double getSalarioMensual() {
        return SalarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        SalarioMensual = salarioMensual;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
