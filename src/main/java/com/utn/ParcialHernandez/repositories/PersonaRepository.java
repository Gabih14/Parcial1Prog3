package com.utn.ParcialHernandez.repositories;

import com.utn.ParcialHernandez.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Anotación Metodo de Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    boolean existsByDni(int dni);

    //Anotación JPQL parámetros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Persona> search(String filtro);

    @Query(
            value = "SELECT * FROM persona  WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Persona> search1(String filtro);
}
