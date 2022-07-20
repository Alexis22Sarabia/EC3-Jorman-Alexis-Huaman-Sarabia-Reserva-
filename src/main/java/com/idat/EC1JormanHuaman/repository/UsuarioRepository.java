package com.idat.EC1JormanHuaman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC1JormanHuaman.model.Usuariocliente;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuariocliente, Integer> {

	Usuariocliente findByUsuario(String usuario);

}