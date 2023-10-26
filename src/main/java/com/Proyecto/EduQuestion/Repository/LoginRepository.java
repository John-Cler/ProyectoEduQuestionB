package com.Proyecto.EduQuestion.Repository;

import com.Proyecto.EduQuestion.Entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    Login findByUsuario(String usuario);
}
