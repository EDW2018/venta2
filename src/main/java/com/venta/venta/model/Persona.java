package com.venta.venta.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "apellido",nullable = false)
    private String apellido;
    private Date fechaNacimiento;
    private String emisor;
    private String valor;
    



    // @ManyToOne(fetch = FetchType.EAGER, optional = false)
    // @JoinColumn(name = "direccion_id")
    // private Direccion direccion;
        
	public Persona() {
    }

    public Persona(long id, String nombre, String apellido, Date fechaNacimiento, String emisor, String valor ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.emisor = emisor;
        this.valor = valor;
        
        // this.direccion = direccion;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getEmisor() {
        return emisor;
    }


    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }


    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }


    


    // public Direccion getDireccion() {
    //     return direccion;
    // }


    // public void setDireccion(Direccion direccion) {
    //     this.direccion = direccion;
    // }
	
	
}
