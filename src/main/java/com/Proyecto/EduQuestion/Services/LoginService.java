package com.Proyecto.EduQuestion.Services;

import com.Proyecto.EduQuestion.Dto.DtoLogin;
import com.Proyecto.EduQuestion.Entity.Login;
import com.Proyecto.EduQuestion.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public DtoLogin findByUsuario(String usuario){
        Login login = loginRepository.findByUsuario(usuario);
        return new DtoLogin(login.getId(), login.getUsuario());
    }
}
