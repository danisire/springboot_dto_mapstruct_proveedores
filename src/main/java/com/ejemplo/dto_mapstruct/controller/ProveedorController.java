package com.ejemplo.dto_mapstruct.controller;

import com.ejemplo.dto_mapstruct.dto.ProveedorDTO;
import com.ejemplo.dto_mapstruct.entity.Proveedor;
import com.ejemplo.dto_mapstruct.mapper.ProveedorMapper;
import com.ejemplo.dto_mapstruct.repository.ProveedorRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {

 private final ProveedorRepository repository;
 private final ProveedorMapper mapper;

 // Constructor
 public ProveedorController(
         ProveedorRepository repository,
         ProveedorMapper mapper) {

  this.repository = repository;
  this.mapper = mapper;
 }

 // GET → Obtener todos los proveedores
 @GetMapping
 public List<ProveedorDTO> listar() {

  return repository.findAll()
          .stream()
          .map(mapper::toDTO)
          .toList();
 }

 // POST → Registrar un proveedor
 @PostMapping
 public ProveedorDTO crear(@RequestBody ProveedorDTO dto) {

  Proveedor proveedor = mapper.toEntity(dto);

  Proveedor guardado = repository.save(proveedor);

  return mapper.toDTO(guardado);
 }
}
