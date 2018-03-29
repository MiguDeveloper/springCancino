package pe.tuna.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Persona {
    private int id;

    @NotBlank
    @NotNull
    private String nombres;

    @NotBlank
    @NotNull
    private String correo;

    @Min(18)
    private int edad;

    private String pais;

    public Persona() {
    }

    public Persona(String nombres, int edad, String pais) {
        this.nombres = nombres;
        this.edad = edad;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
