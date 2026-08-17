package com.emmanuelescobedo.reclutamiento.controller;

import com.emmanuelescobedo.reclutamiento.model.Empresa;
import com.emmanuelescobedo.reclutamiento.service.IEmpresaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

    private final IEmpresaService emprServ;

    public EmpresaController(IEmpresaService emprServ) {
        this.emprServ = emprServ;
    }

    //READ
    @GetMapping
    public List<Empresa> traerEmpresas() { return emprServ.traerEmpresas(); }

    //READ de elementos especificos
    @GetMapping("/{codeEmpresa}")
    public ResponseEntity<?> buscarEmpresa(@PathVariable Long codeEmpresa) {

        Empresa empresaBuscar = emprServ.buscarEmpresa(codeEmpresa);
        if(empresaBuscar == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No fue posible encontrar la empresa con el codigo: " + codeEmpresa);
        }

        return ResponseEntity.ok(empresaBuscar);
    }

    //CREATE
    @PostMapping
    public ResponseEntity<?> crearEmpresa(@RequestBody Empresa empresa) {
        Empresa empresaCrear = emprServ.crearEmpresa(empresa);

        if(empresaCrear == null) {
            return ResponseEntity.badRequest()
                    .body("Los datos enviados son invalidos. No es posible crear la empresa");
        }

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(empresaCrear);
    }

    //UPDATE
    @PutMapping("/{codeEmpresa}")
    public ResponseEntity<?> editarEmpresa(@PathVariable Long codeEmpresa, @RequestBody Empresa empresa) {
        Empresa empresaEditar = emprServ.editarEmpresa(empresa, codeEmpresa);

        if(empresaEditar == null) {
            return ResponseEntity.badRequest()
                    .body("No fue posible editar la empresa. Los datos no son validos");
        }

        return ResponseEntity.ok(empresaEditar);
    }

    //DELETE
    @DeleteMapping("/{codeEmpresa}")
    public ResponseEntity<?> eliminarEmpresa(@PathVariable Long codeEmpresa) {
        boolean empresaEliminar = emprServ.eliminarEmpresa(codeEmpresa);

        if(empresaEliminar == false) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontro una empresa con el codigo: " + codeEmpresa);
        }

        return ResponseEntity.ok("Empresa eliminada correctamente!");
    }
}
