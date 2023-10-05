package com.utn.ParcialHernandez.repositories;

import com.utn.ParcialHernandez.entities.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}
