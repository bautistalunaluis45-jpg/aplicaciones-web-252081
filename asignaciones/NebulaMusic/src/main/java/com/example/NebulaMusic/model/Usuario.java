package com.example.NebulaMusic.model;

public class Usuario {
    private String nombre;
    private String email;
    private String password;
    private String user;
    private String rad_genero;
    private String sel_suscripcion;
    private String fechaNacimiento;
    private String chk_terminos;
    private String comentarios;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, String comentarios, String user, String rad_genero, String sel_suscripcion, String fechaNacimiento, String chk_terminos) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.comentarios = comentarios;
        this.user = user;
        this.rad_genero = rad_genero;
        this.sel_suscripcion = sel_suscripcion;
        this.fechaNacimiento = fechaNacimiento;
        this.chk_terminos = chk_terminos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getChk_terminos() {
        return chk_terminos;
    }

    public void setChk_terminos(String chk_terminos) {
        this.chk_terminos = chk_terminos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSel_suscripcion() {
        return sel_suscripcion;
    }

    public void setSel_suscripcion(String sel_suscripcion) {
        this.sel_suscripcion = sel_suscripcion;
    }

    public String getRad_genero() {
        return rad_genero;
    }

    public void setRad_genero(String rad_genero) {
        this.rad_genero = rad_genero;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
