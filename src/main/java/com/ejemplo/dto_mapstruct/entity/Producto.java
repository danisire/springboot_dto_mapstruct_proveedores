package com.ejemplo.dto_mapstruct.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String nombre;
 private double precio;

 // Constructor vacío
 public Producto() {
 }

 // Constructor con datos
 public Producto(String nombre, double precio) {
  this.nombre = nombre;
  this.precio = precio;
 }

 // Getters
 public Long getId() {
  return id;
 }

 public String getNombre() {
  return nombre;
 }

 public double getPrecio() {
  return precio;
 }

 // Setters
 public void setId(Long id) {
  this.id = id;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setPrecio(double precio) {
  this.precio = precio;
 }
}