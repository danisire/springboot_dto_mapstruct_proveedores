package com.ejemplo.dto_mapstruct.repository;

import com.ejemplo.dto_mapstruct.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}