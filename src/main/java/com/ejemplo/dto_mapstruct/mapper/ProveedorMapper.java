package com.ejemplo.dto_mapstruct.mapper;

import com.ejemplo.dto_mapstruct.dto.ProveedorDTO;
import com.ejemplo.dto_mapstruct.entity.Proveedor;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProveedorMapper {

 // Entity → DTO
 ProveedorDTO toDTO(Proveedor proveedor);

 // DTO → Entity (el id lo genera la base de datos)
 @Mapping(target = "id", ignore = true)
 Proveedor toEntity(ProveedorDTO dto);
}
