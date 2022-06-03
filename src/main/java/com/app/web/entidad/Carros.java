package com.app.web.entidad;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Carros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Marca",nullable = false,length = 50)
    private String Marca;

    @Column(name = "Modelo",nullable = false,length = 50)
    private String Modelo;

    @Column(name = "Descripcion",nullable = false,length = 50)
    private String Descripcion;

    @Column(name = "Tipo combustible",nullable = false,length = 50)
    private String Tipo_Combustible;

    @Column(name = "Año de fabricacion",nullable = false,length = 50)
    private String Año_de_Fabricacion;

    @Column(name = "Numero de chasis",nullable = false,length = 50,unique = true)
    private String Numero_de_Chasis;

    @Column(name = "Numero de placa",nullable = false,length = 50,unique = true)
    private String Numero_de_Placa;

    @Column(name = "Tipo de vehiculo",nullable = false,length = 50)
    private String Tipo_de_vehiculo;

    public Carros(String marca, String modelo, String descripcion, String tipo_Combustible, String año_de_Fabricacion, String numero_de_Chasis, String numero_de_Placa, String tipo_de_vehiculo) {

        Marca = marca;
        Modelo = modelo;
        Descripcion = descripcion;
        Tipo_Combustible = tipo_Combustible;
        Año_de_Fabricacion = año_de_Fabricacion;
        Numero_de_Chasis = numero_de_Chasis;
        Numero_de_Placa = numero_de_Placa;
        Tipo_de_vehiculo = tipo_de_vehiculo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getTipo_Combustible() {
        return Tipo_Combustible;
    }

    public void setTipo_Combustible(String tipo_Combustible) {
        Tipo_Combustible = tipo_Combustible;
    }

    public String getAño_de_Fabricacion() {
        return Año_de_Fabricacion;
    }

    public void setAño_de_Fabricacion(String año_de_Fabricacion) {
        Año_de_Fabricacion = año_de_Fabricacion;
    }

    public String getNumero_de_Chasis() {
        return Numero_de_Chasis;
    }

    public void setNumero_de_Chasis(String numero_de_Chasis) {
        Numero_de_Chasis = numero_de_Chasis;
    }

    public String getNumero_de_Placa() {
        return Numero_de_Placa;
    }

    public void setNumero_de_Placa(String numero_de_Placa) {
        Numero_de_Placa = numero_de_Placa;
    }

    public String getTipo_de_vehiculo() {
        return Tipo_de_vehiculo;
    }

    public void setTipo_de_vehiculo(String tipo_de_vehiculo) {
        Tipo_de_vehiculo = tipo_de_vehiculo;
    }

    @Override
    public String toString() {
        return "Carros{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Tipo_Combustible='" + Tipo_Combustible + '\'' +
                ", Año_de_Fabricacion='" + Año_de_Fabricacion + '\'' +
                ", Numero_de_Chasis='" + Numero_de_Chasis + '\'' +
                ", Numero_de_Placa='" + Numero_de_Placa + '\'' +
                ", Tipo_de_vehiculo='" + Tipo_de_vehiculo + '\'' +
                '}';
    }
}
