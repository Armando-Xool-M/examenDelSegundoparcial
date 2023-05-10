package com.example.demo.modelo;

public class tramitesDTO {

    private String abreviatura;
    private String codigo;
    private String dependencia;
    private Long id;
    private String nombre;
    private String tipo;

    public String getAbreviatura() {
        return abreviatura;
    }
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDependencia() {
        return dependencia;
    }
    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}