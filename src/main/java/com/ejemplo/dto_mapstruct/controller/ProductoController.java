package com.ejemplo.dto_mapstruct.controller;

import com.ejemplo.dto_mapstruct.dto.ProductoDTO;
import com.ejemplo.dto_mapstruct.entity.Producto;
import com.ejemplo.dto_mapstruct.mapper.ProductoMapper;
import com.ejemplo.dto_mapstruct.repository.ProductoRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

 private final ProductoRepository repository;
 private final ProductoMapper mapper;

 // Constructor
 public ProductoController(
         ProductoRepository repository,
         ProductoMapper mapper) {

  this.repository = repository;
  this.mapper = mapper;
 }

 // GET → Obtener todos los productos
 @GetMapping
 public List<ProductoDTO> listar() {

  return repository.findAll()
          .stream()
          .map(mapper::toDTO)
          .toList();
 }

 // POST → Crear un producto
 @PostMapping
 public ProductoDTO crear(@RequestBody ProductoDTO dto) {

  Producto producto = mapper.toEntity(dto);

  Producto guardado = repository.save(producto);

  return mapper.toDTO(guardado);
 }
}