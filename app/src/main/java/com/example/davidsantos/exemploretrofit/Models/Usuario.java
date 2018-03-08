package com.example.davidsantos.exemploretrofit.Models;

/**
 * Created by david.santos on 08/03/2018.
 */

public class Usuario {

    public String usuarioId;
    public TipoUsuario tipoUsuario;
    public String Nome;
    public String Email;
    public String CPF;

    public double Preco;

    public String Skype;
    public String Whatsapp;

    public Usuario(String usuarioId, TipoUsuario tipoUsuario, String nome, String email, String CPF, double preco, String skype, String whatsapp) {
        this.usuarioId = usuarioId;
        this.tipoUsuario = tipoUsuario;
        Nome = nome;
        Email = email;
        this.CPF = CPF;
        Preco = preco;
        Skype = skype;
        Whatsapp = whatsapp;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public String getSkype() {
        return Skype;
    }

    public void setSkype(String skype) {
        Skype = skype;
    }

    public String getWhatsapp() {
        return Whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        Whatsapp = whatsapp;
    }
}
