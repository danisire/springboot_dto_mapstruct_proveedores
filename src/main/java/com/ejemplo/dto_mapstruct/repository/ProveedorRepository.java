package com.ejemplo.dto_mapstruct.repository;

import com.ejemplo.dto_mapstruct.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {

}
