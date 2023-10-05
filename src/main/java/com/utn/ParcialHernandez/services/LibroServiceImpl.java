package com.utn.ParcialHernandez.services;

import com.utn.ParcialHernandez.entities.Libro;
import com.utn.ParcialHernandez.repositories.BaseRepository;
import com.utn.ParcialHernandez.repositories.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
   private LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
