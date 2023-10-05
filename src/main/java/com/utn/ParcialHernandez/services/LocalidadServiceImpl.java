package com.utn.ParcialHernandez.services;

import com.utn.ParcialHernandez.entities.Localidad;
import com.utn.ParcialHernandez.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
