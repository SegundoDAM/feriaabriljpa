package com.adorno.adorno.servicios;

import org.springframework.stereotype.Service;

import com.adorno.adorno.modelo.entity.Mensaje;
import com.adorno.adorno.modelo.entity.Usuario;
import com.adorno.adorno.repositorios.MensajeRepository;
import com.adorno.adorno.repositorios.UsuarioRepository;

@Service
public class PobladorService {
    private final UsuarioRepository usuarioRepository;
    private final MensajeRepository mensajeRepository;

    public PobladorService(UsuarioRepository usuarioRepository, MensajeRepository mensajeRepository) {
        this.usuarioRepository = usuarioRepository;
        this.mensajeRepository = mensajeRepository;
        cargarDatos();
    }
public void cargarDatos() {
        // Carga de datos de ejemplo
        Usuario usuario1 = new Usuario("Antonio", "tony@hotmail.com");
        usuarioRepository.save(usuario1);

        Usuario usuario2 = new Usuario("Alba", "alba@google.com");
        usuarioRepository.save(usuario2);

        Usuario usuario3 = new Usuario("Portalo", "portalo@gmail.com");
        usuarioRepository.save(usuario3);
        
        Usuario usuario4 = new Usuario("Yisus", "ammorch@google.com");
        usuarioRepository.save(usuario4);
        
        Mensaje mensaje1 = new Mensaje("Este tweeter falso no esta tan mal!!", true, usuario1);
        mensajeRepository.save(mensaje1);

        Mensaje mensaje2 = new Mensaje("Iniciandome en el mundo de la ciencia, que emoción!!", false, usuario2);
        mensajeRepository.save(mensaje2);

        Mensaje mensaje3 = new Mensaje("Odio la lluvia..... que ganas de playa", true, usuario1);
        mensajeRepository.save(mensaje3);

        Mensaje mensaje4 = new Mensaje("Disfrutando de la Feria de Abril Sevillana :D", true, usuario3);
        mensajeRepository.save(mensaje4);
        
        Mensaje mensaje5 = new Mensaje("Vaya calor hace hoy...", false, usuario3);
        mensajeRepository.save(mensaje5);
        
        Mensaje mensaje6 = new Mensaje("Elon Musk Tiembla!", false, usuario3);
        mensajeRepository.save(mensaje6);
        
        Mensaje mensaje7 = new Mensaje("Los Sevillanos no entienden de Feria...", false, usuario4);
        mensajeRepository.save(mensaje7);

        // Puedes agregar más datos según sea necesario
    }
}
