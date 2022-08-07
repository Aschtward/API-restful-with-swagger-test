package com.omg.projetoTeste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omg.projetoTeste.models.Evento;

public interface EventoRepository extends JpaRepository<Evento,String> {

}
