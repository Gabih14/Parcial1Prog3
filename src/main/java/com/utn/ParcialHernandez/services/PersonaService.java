package com.utn.ParcialHernandez.services;

import com.utn.ParcialHernandez.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona,Long> {
    List<Persona> search(String filtro) throws Exception;
}
