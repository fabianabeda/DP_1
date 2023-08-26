package br.edu.ifpb.progdist.hellospring.service;

import br.edu.ifpb.progdist.hellospring.dao.UsuariosDAO;
import br.edu.ifpb.progdist.hellospring.model.Usuario;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuariosService {
    private UsuariosDAO usuariosDAO = new UsuariosDAO();

    public List<Usuario> getUsuarios() {
        return usuariosDAO.getUsuarios();
    }

    public Usuario getUsuarioPorCodigo(int codigo) {
        return usuariosDAO.getUsuarios()
                .stream()
                .filter(usuario -> usuario.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public void inserirUsuario(Usuario usuario) {
        usuariosDAO.inserirUsuario(usuario);
    }
}
