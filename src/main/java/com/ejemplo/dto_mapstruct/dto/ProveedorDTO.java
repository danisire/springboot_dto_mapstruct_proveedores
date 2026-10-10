package com.ejemplo.dto_mapstruct.dto;

public class ProveedorDTO {

 private Long id;
 private String nombre;
 private String telefono;
 private String correo;

 // Constructor vacío
 public ProveedorDTO() {
 }

 // Constructor con datos
 public ProveedorDTO(Long id, String nombre, String telefono, String correo) {
  this.id = id;
  this.nombre = nombre;
  this.telefono = telefono;
  this.correo = correo;
 }

 // Getters
 public Long getId() {
  return id;
 }

 public String getNombre() {
  return nombre;
 }

 public String getTelefono() {
  return telefono;
 }

 public String getCorreo() {
  return correo;
 }

 // Setters
 public void setId(Long id) {
  this.id = id;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public void setTelefono(String telefono) {
  this.telefono = telefono;
 }

 public void setCorreo(String correo) {
  this.correo = correo;
 }
}
