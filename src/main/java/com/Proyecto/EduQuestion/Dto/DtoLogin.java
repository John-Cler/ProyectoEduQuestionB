package com.Proyecto.EduQuestion.Dto;

import org.apache.juli.logging.Log;

public class DtoLogin {
    private Log Id;
    private String Usuario;
    private String Password;

    public DtoLogin(Long id, String usuario) {
    }

    public DtoLogin(Log id, String usuario, String password) {
        Id = id;
        Usuario = usuario;
        Password = password;
    }

    public Log getId() {
        return Id;
    }

    public void setId(Log id) {
        Id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "DtoLogin{" +
                "Id=" + Id +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
