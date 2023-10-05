package com.utn.ParcialHernandez.services;

import com.utn.ParcialHernandez.entities.Autor;
import com.utn.ParcialHernandez.repositories.AutorRepository;
import com.utn.ParcialHernandez.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }



}
