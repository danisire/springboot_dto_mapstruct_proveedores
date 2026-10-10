package com.ejemplo.dto_mapstruct.dto;

public class ProductoDTO {

 private String nombre;
 private double precio;

 // Constructor vacío
 public ProductoDTO() {
 }

 // Constructor con datos
 public ProductoDTO(String nombre, double precio) {
  this.nombre = nombre;
  this.precio = precio;
 }

 // Getters
 public String getNombre() {
  return nombre;
 }

 public double getPrecio() {
  return precio;
 }

 // Setters
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setPrecio(double precio) {
  this.precio = precio;
 }
}