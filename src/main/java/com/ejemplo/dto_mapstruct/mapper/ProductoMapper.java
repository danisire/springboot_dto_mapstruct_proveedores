package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProductoDTO;
import com.ejemplo.dto_mapstruct.entity.Producto;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

 // Entity → DTO
 ProductoDTO toDTO(Producto producto);

 // DTO → Entity
 Producto toEntity(ProductoDTO dto);
}