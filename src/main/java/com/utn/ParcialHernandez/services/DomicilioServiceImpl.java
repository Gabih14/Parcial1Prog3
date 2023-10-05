package com.utn.ParcialHernandez.services;

import com.utn.ParcialHernandez.entities.Domicilio;
import com.utn.ParcialHernandez.repositories.BaseRepository;
import com.utn.ParcialHernandez.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    private DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }
}
