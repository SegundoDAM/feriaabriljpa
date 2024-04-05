package com.adorno.adorno.servicios;

import org.springframework.stereotype.Service;

import com.adorno.adorno.modelo.Mensaje;
import com.adorno.adorno.modelo.Usuario;
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
        Usuario usuario1 = new Usuario("usuario1", "usuario1@example.com");
        usuarioRepository.save(usuario1);

        Usuario usuario2 = new Usuario("usuario2", "usuario2@example.com");
        usuarioRepository.save(usuario2);

        Mensaje mensaje1 = new Mensaje("Mensaje 1", true, usuario1);
        mensajeRepository.save(mensaje1);

        Mensaje mensaje2 = new Mensaje("Mensaje 2", false, usuario2);
        mensajeRepository.save(mensaje2);

        Mensaje mensaje3 = new Mensaje("Mensaje 3", true, usuario1);
        mensajeRepository.save(mensaje3);

        // Puedes agregar más datos según sea necesario
    }
}
