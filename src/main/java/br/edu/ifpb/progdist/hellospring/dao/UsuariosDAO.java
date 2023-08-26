package br.edu.ifpb.progdist.hellospring.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpb.progdist.hellospring.model.Usuario;

public class UsuariosDAO {
    private List<Usuario> usuarios = new ArrayList<>();

    public UsuariosDAO() {
        this.usuarios.add(new Usuario(1, "Ana", 20));
        this.usuarios.add(new Usuario(2, "Carlos", 30));
        this.usuarios.add(new Usuario(3, "João", 25));
        this.usuarios.add(new Usuario(4, "José", 18));
    }

    public List<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void inserirUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

}
