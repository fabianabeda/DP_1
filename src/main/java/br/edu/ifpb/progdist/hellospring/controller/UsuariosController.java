package br.edu.ifpb.progdist.hellospring.controller;

import br.edu.ifpb.progdist.hellospring.model.Usuario;
import br.edu.ifpb.progdist.hellospring.service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios/")
public class UsuariosController {
    private UsuariosService usuariosService;

    @Autowired
    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping("")
    public List<Usuario> getUsuarios() {
        return usuariosService.getUsuarios();
    }

    @GetMapping("/{codigo}")
    public Usuario getUsuarioPorCodigo(@PathVariable int codigo) {
        return usuariosService.getUsuarioPorCodigo(codigo);
    }

    @PostMapping(path = "", consumes = "application/json", produces = "application/json")
    public Integer inserirUsuario(@RequestBody Usuario usuario) {
        usuariosService.inserirUsuario(usuario);
        return usuario.getCodigo();
    }
}
