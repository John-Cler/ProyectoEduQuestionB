package com.Proyecto.EduQuestion.ApiControllers;

import com.Proyecto.EduQuestion.Dto.DtoLogin;
import com.Proyecto.EduQuestion.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;




@RestController
@RequestMapping("api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/{user}")
    public ResponseEntity<DtoLogin> obtenerLogin(@PathVariable String usuario){
        DtoLogin dtoLogin = loginService.findByUsuario(usuario);
        if (dtoLogin != null){
            return new ResponseEntity<>(dtoLogin, HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // Configuración de OAuth 2.0 para proteger rutas
//    @Configuration
//    public class OAuth2Config {
//
//        @Bean
//        public JwtDecoder jwtDecoder() {
//            // Configura la decodificación de tokens JWT
//            // Por ejemplo, usa NimbusJwtDecoder para decodificar tokens JWT
//            return NimbusJwtDecoder.withJwkSetUri(jwkSetUri).build();
//        }
//
//        private final String jwkSetUri = "your-jwk-set-uri";
//
//        @Configuration
//        protected static class ResourceServerConfig {
//            // Configura el servidor de recursos OAuth 2.0
//            @Override
//            protected void configure(HttpSecurity http) throws Exception {
//                http
//                        .authorizeRequests()
//                        .antMatchers("/api/public/**").permitAll()
//                        .antMatchers("/api/private/**").authenticated();
//            }
//        }
//    }

}
