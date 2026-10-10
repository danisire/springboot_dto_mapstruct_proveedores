package com.ejemplo.dto_mapstruct.config;

import com.ejemplo.dto_mapstruct.entity.Producto;
import com.ejemplo.dto_mapstruct.repository.ProductoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

 @Bean
 CommandLineRunner cargarDatos(ProductoRepository repository) {

  return args -> {

   if (repository.count() == 0) {

    repository.save(
            new Producto("Laptop", 2500000)
    );

    repository.save(
            new Producto("Mouse Gamer", 120000)
    );

    repository.save(
            new Producto("Teclado Mecánico", 280000)
    );
   }
  };
 }
}